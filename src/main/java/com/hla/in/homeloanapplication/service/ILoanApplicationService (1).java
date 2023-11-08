package com.hla.in.homeloanapplication.service;

import java.util.List;

import com.hla.in.homeloanapplication.entities.LoanApplication;
import com.hla.in.homeloanapplication.exceptions.InvalidLoanApplicationException;

public interface ILoanApplicationService  {
	
	public LoanApplication addLoanApplication(LoanApplication loanApplication);
	public LoanApplication updateLoanApplication(LoanApplication loanApplication) throws InvalidLoanApplicationException;
	public LoanApplication deleteLoanApplication(long loanApplicationId) throws InvalidLoanApplicationException;
	public List<LoanApplication> retrieveAllLoanApplication();
	public LoanApplication retrieveLoanApplicationById(long loanApplicationId) throws InvalidLoanApplicationException;
	
}
