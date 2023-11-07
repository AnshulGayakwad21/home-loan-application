package com.hla.in.homeloanapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity

public class EMI {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long emiId;
	private LocalDate dueDate;
	private double emiAmount;
	private double loanAmount;
	private double interestAmount;
	private long loanAgreementId;
	public EMI(long emiId, LocalDate dueDate, double emiAmount, double loanAmount, double interestAmount,
			long loanAgreementId) {
		super();
		this.emiId = emiId;
		this.dueDate = dueDate;
		this.emiAmount = emiAmount;
		this.loanAmount = loanAmount;
		this.interestAmount = interestAmount;
		this.loanAgreementId = loanAgreementId;
	}
	public long getEmiId() {
		return emiId;
	}
	public void setEmiId(long emiId) {
		this.emiId = emiId;
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
		return "EMI [emiId=" + emiId + ", dueDate=" + dueDate + ", emiAmount=" + emiAmount + ", loanAmount="
				+ loanAmount + ", interestAmount=" + interestAmount + ", loanAgreementId=" + loanAgreementId + "]";
	}
}
// Author : Saikiran