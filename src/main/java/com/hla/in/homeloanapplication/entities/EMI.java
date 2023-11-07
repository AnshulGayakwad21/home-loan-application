package com.hla.in.homeloanapplication.entities;

import java.time.LocalDate;

public class EMI {
	private long emiid;
	private LocalDate dueDate;
	private double emiAmount;
	private double loanAmount;
	private double interestAmount;
	private long loanAgreementId;
	public EMI(long emiid, LocalDate dueDate, double emiAmount, double loanAmount, double interestAmount,
			long loanAgreementId) {
		super();
		this.emiid = emiid;
		this.dueDate = dueDate;
		this.emiAmount = emiAmount;
		this.loanAmount = loanAmount;
		this.interestAmount = interestAmount;
		this.loanAgreementId = loanAgreementId;
	}
	public long getEmiid() {
		return emiid;
	}
	public void setEmiid(long emiid) {
		this.emiid = emiid;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}
	public long getLoanAgreementId() {
		return loanAgreementId;
	}
	public void setLoanAgreementId(long loanAgreementId) {
		this.loanAgreementId = loanAgreementId;
	}
	@Override
	public String toString() {
		return "EMI [emiid=" + emiid + ", dueDate=" + dueDate + ", emiAmount=" + emiAmount + ", loanAmount="
				+ loanAmount + ", interestAmount=" + interestAmount + ", loanAgreementId=" + loanAgreementId + "]";
	}
	
	
	
	

}
