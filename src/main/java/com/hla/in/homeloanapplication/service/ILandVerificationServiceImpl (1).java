package com.hla.in.homeloanapplication.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hla.in.homeloanapplication.entities.LoanApplication;
import com.hla.in.homeloanapplication.exceptions.InvalidLoanApplicationException;
import com.hla.in.homeloanapplication.repository.ILoanApplicationRepository;

@Service
public class ILandVerificationServiceImpl implements ILandVerificationService {

	@Autowired
	ILoanApplicationRepository applicationRepository;

	public ILandVerificationServiceImpl(ILoanApplicationRepository applicationRepository) {
		super();
		this.applicationRepository = applicationRepository;
	}

	@Override
	@Transactional

	public LoanApplication updateStatus(LoanApplication loanApplication) throws InvalidLoanApplicationException {
		Optional<LoanApplication> optional = applicationRepository.findById(loanApplication.getApplicationId());

		if (optional.isPresent()) {
			applicationRepository.save(loanApplication);

			return loanApplication; 
		} else {
			throw new InvalidLoanApplicationException("Loan application couldn't be Updated! "); // returns the stated
																									// exception message
		}

	}
}
