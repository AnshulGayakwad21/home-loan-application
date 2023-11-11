package com.hla.in.homeloanapplication.service.impl;


import com.hla.in.homeloanapplication.dtos.CustomerDto;
import com.hla.in.homeloanapplication.dtos.DocsDto;
import com.hla.in.homeloanapplication.entities.Customer;
import com.hla.in.homeloanapplication.entities.LoanApplication;
import com.hla.in.homeloanapplication.enums.Status;
import com.hla.in.homeloanapplication.exceptions.CouldNotBeAddedException;
import com.hla.in.homeloanapplication.exceptions.ResourceNotFoundException;
import com.hla.in.homeloanapplication.repository.ICustomerRepository;
import com.hla.in.homeloanapplication.repository.ILoanApplicationRepository;
import com.hla.in.homeloanapplication.service.ICustomerService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
public class ICustomerServiceImpl implements ICustomerService {
    Log logger = LogFactory.getLog(ILoanAgreementServiceImpl.class);
    @Autowired
    ICustomerRepository custRepo;

    @Autowired
    ILoanApplicationRepository loanRepo;

//    @Autowired
//    private PasswordEncoder bcryptEncoder;

    @Override
    public Customer viewCustomer(int custId) throws ResourceNotFoundException {
        logger.info("Entered into viewCustomer method");
        return custRepo.findById(custId)
                .orElseThrow(() -> new ResourceNotFoundException("User Not found for Id " + custId));
    }

    @Override
    public List<Customer> viewAllCustomers() throws ResourceNotFoundException {
        logger.info("Entered into viewAllCustomers method");
        if (custRepo.findAll().isEmpty()) {
            throw new ResourceNotFoundException("No Users Found");
        }
        return custRepo.findAll();
    }

    @Override
    public Customer addCustomer(CustomerDto customer) throws CouldNotBeAddedException {
        logger.info("Entered into addCustomer method");
        if (custRepo.findByMobileNumber(customer.getMobileNumber()) != null) {
            throw new CouldNotBeAddedException("Customer already exists");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = String.valueOf(customer.getDateOfBirth());

        //convert String to LocalDate
        LocalDate dob = LocalDate.parse(date, formatter);

        /*
        checking for age > 18 years
         */
        LocalDate now = LocalDate.now();
        long age = ChronoUnit.YEARS.between(dob, now);
        if (age < 18) {
            throw new CouldNotBeAddedException("Age should be at least 18");
        }


        Customer newCustomer = new Customer();
        newCustomer.setCustomerName(customer.getCustomerName());
        newCustomer.setGender(customer.getGender());
        //newCustomer.setEmail(customer.getEmail());
        newCustomer.setPassword(customer.getPassword());
        newCustomer.setMobileNumber(customer.getMobileNumber());
        newCustomer.setAadharNumber(customer.getAadharNumber());
        newCustomer.setPanNumber(customer.getPanNumber());
        newCustomer.setNationality(customer.getNationality());
        newCustomer.setRole("CUSTOMER");
        newCustomer.setDateOfBirth(customer.getDateOfBirth());
        //newCustomer.setDateOfBirth(LocalDate.parse(customer.getDateOfBirth(), formatter));


        return custRepo.save(newCustomer);
    }

    @Override
    public Customer updateCustomer(int id, DocsDto docsDto) throws ResourceNotFoundException {
        logger.info("Entered into updateCustomer method");
        Optional<Customer> customerOp = custRepo.findById(id);
        if (customerOp.isPresent()) {
            Customer customer = customerOp.get();
            customer.setPanNumber(docsDto.getPanNumber());
            customer.setAadharNumber(docsDto.getAadharNumber());
            LoanApplication loanApplication = loanRepo.findByCustomerId(id);
            loanApplication.setStatus(Status.DOCUMENTS_UPLOADED);
            loanRepo.save(loanApplication);
            return custRepo.save(customer);
        } else {
            throw new ResourceNotFoundException("User Not found for Id" + id);
        }
    }

    @Override
    public List<Customer> viewCustomerList(String date) throws ResourceNotFoundException {
        logger.info("Entered into viewCustomerList method");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfApplication = LocalDate.parse(date, formatter);
        List<Customer> customers = custRepo.findByDateOfApplication(dateOfApplication);
        if (customers.isEmpty()) {
            throw new ResourceNotFoundException("No users found for the given date");
        }
        return customers;
    }

    @Override
    public Customer deleteCustomerById(int custId) throws ResourceNotFoundException {
        logger.info("Entered into deleteCustomerById method");
        Optional<Customer> customerOp = custRepo.findById(custId);
        if (customerOp.isPresent()) {
            custRepo.deleteById(custId);
            return customerOp.get();
        } else {
            throw new ResourceNotFoundException("User Not found for Id" + custId);
        }
    }

//    @Override
//    public String loginCustomer(UserLoginDto userLoginDto) throws AuthenticationFailedException {
//
//        Customer customer = custRepo.findById(userLoginDto.getUserId()).orElseThrow(() -> new AuthenticationFailedException("Invalid Credentials "));
//        String password = userLoginDto.getPassword();
//
//        if (bcryptEncoder.matches(password, customer.getPassword())) {
//            return "Login successfully";
//        }
//        return "Invalid Credentials";
//
//    }


}

