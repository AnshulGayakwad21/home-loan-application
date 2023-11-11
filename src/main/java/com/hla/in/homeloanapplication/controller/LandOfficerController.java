package com.hla.in.homeloanapplication.controller;

import com.hla.in.homeloanapplication.dtos.LandVerificationOfficerDto;
import com.hla.in.homeloanapplication.dtos.UserLoginDto;
import com.hla.in.homeloanapplication.entities.LandVerificationOfficer;
import com.hla.in.homeloanapplication.entities.LoanApplication;
import com.hla.in.homeloanapplication.enums.Status;
import com.hla.in.homeloanapplication.exceptions.CouldNotBeAddedException;
import com.hla.in.homeloanapplication.exceptions.InvalidCredentialException;
import com.hla.in.homeloanapplication.exceptions.ResourceNotFoundException;
import com.hla.in.homeloanapplication.service.ILandVerificationService;
import com.hla.in.homeloanapplication.service.ILoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/landofficer")
public class LandOfficerController {

    @Autowired
    ILoanApplicationService loanApplicationService;

    @Autowired
    ILandVerificationService landVerificationService;


    @GetMapping("/loan/{id}")
    public ResponseEntity<LoanApplication> retrieveLoanApplicationById(@PathVariable Long id) throws ResourceNotFoundException {
        LoanApplication loanApplication = loanApplicationService.retrieveLoanApplicationById(id);
        return new ResponseEntity<>(loanApplication, HttpStatus.OK);
    }

    @PutMapping("/loan/{id}")
    public ResponseEntity<LoanApplication> updateStatusOfLoanApplication(@PathVariable Long id) throws ResourceNotFoundException {
        LoanApplication loanApplication = loanApplicationService.updateStatusOfLoanApplication(id, Status.WAITING_FOR_FINANCE_APPROVAL);
        return new ResponseEntity<>(loanApplication, HttpStatus.OK);
    }

    @GetMapping("/loans/pending")
    public ResponseEntity<List<LoanApplication>> getPendingApplications() {
        List<LoanApplication> pendingApplications = loanApplicationService.retrieveLoanApplicationByStatus(
                String.valueOf(Status.WAITING_FOR_LAND_VERIFICATION_OFFICE_APPROVAL)
        );
        return new ResponseEntity<>(pendingApplications, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<LandVerificationOfficer> createNewCustomer(@Valid @RequestBody LandVerificationOfficerDto landVerificationOfficerDto) throws CouldNotBeAddedException {
        LandVerificationOfficer newLandOfficer = landVerificationService.addLandVerificationOfficer(landVerificationOfficerDto);
        return new ResponseEntity<>(newLandOfficer, HttpStatus.CREATED);
    }

//    @PostMapping("/login")
//    public ResponseEntity<String> loginLandOfficer(@RequestBody UserLoginDto userLoginDto) throws InvalidCredentialException {
//        String response = landVerificationService.loginLandOfficer(userLoginDto);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//
//    }


}

