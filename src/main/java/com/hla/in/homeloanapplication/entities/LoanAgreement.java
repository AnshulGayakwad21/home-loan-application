package com.hla.in.homeloanapplication.entities;

public class LoanAgreement {
	private long loanAgreementId;
	private long loanApplication;
	public LoanAgreement(long loanAgreementId, long loanApplication) {
		super();
		this.loanAgreementId = loanAgreementId;
		this.loanApplication = loanApplication;
	}
	public long getLoanAgreementId() {
		return loanAgreementId;
	}
	public void setLoanAgreementId(long loanAgreementId) {
		this.loanAgreementId = loanAgreementId;
	}
	public long getLoanApplication() {
		return loanApplication;
	}
	public void setLoanApplication(long loanApplication) {
		this.loanApplication = loanApplication;
	}

}
