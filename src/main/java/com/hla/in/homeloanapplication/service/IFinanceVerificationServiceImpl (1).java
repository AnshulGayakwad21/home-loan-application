package com.hla.in.homeloanapplication.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hla.in.homeloanapplication.entities.LoanApplication;
import com.hla.in.homeloanapplication.exceptions.InvalidLoanApplicationException;
import com.hla.in.homeloanapplication.repository.ILoanApplicationRepository;

@Service
public class IFinanceVerificationServiceImpl implements IFinanceVerificationService {

	@Autowired
	ILoanApplicationRepository ApplicationRepository;

	public IFinanceVerificationServiceImpl(ILoanApplicationRepository applicationRepository) {
		super();
		this.ApplicationRepository = applicationRepository;
	}

	@Override
	@Transactional

	public LoanApplication updateStatus(LoanApplication loanApplication) throws InvalidLoanApplicationException {

		Optional<LoanApplication> optional = ApplicationRepository.findById(loanApplication.getApplicationId());
		if (optional.isPresent()) {
			ApplicationRepository.save(loanApplication);
			return loanApplication;
		} else {
			throw new InvalidLoanApplicationException("Loan application couldn't be Updated! ");// returns updated loan
																								// application

		}
	}

}
