package com.hla.in.homeloanapplication.service;

import java.util.List;

import com.hla.in.homeloanapplication.entities.LoanAgreement;
import com.hla.in.homeloanapplication.exceptions.InvalidLoanAgreementException; 


public interface ILoanAgreementService{
	
		public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement);
		public LoanAgreement updateLoanAgreement(LoanAgreement loanAgreement) throws InvalidLoanAgreementException;
		public LoanAgreement deleteLoanAgreement(long loanAgreementId) throws InvalidLoanAgreementException;
		public List<LoanAgreement> retrieveAllLoanAgreement();
		public LoanAgreement retrieveLoanAgreementById(long loanAgreementId)throws InvalidLoanAgreementException;
		
		




}
