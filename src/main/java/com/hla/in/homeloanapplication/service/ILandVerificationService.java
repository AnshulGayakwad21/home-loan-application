package com.hla.in.homeloanapplication.service;

import com.hla.in.homeloanapplication.entities.LoanApplication;
import com.hla.in.homeloanapplication.exceptions.InvalidLoanApplicationException;

public interface ILandVerificationService {

	public LoanApplication updateStatus(LoanApplication loanApplication) throws InvalidLoanApplicationException;

}
