package com.hla.in.homeloanapplication.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class LoanAgreement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanAgreementId;
	@Column
	private long loanApplicationId;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "LOAN_EMI", joinColumns = @JoinColumn(name = "loanAgreementId" ),
			inverseJoinColumns = @JoinColumn(name = "emiId"))
	private Set<EMI> allemis = new HashSet<>();

	public LoanAgreement(long loanAgreementId, long loanApplicationId, Set<EMI> allemis) {
		this.loanAgreementId = loanAgreementId;
		this.loanApplicationId = loanApplicationId;
		this.allemis = allemis;
	}

	public LoanAgreement(long loanAgreementId, long loanApplicationId) {
		super();
		this.loanAgreementId = loanAgreementId;
		this.loanApplicationId = loanApplicationId;
	}

	public long getLoanAgreementId() {
		return loanAgreementId;
	}

	public void setLoanAgreementId(long loanAgreementId) {
		this.loanAgreementId = loanAgreementId;
	}

	public long getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(long loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public Set<EMI> getAllemis() {
		return allemis;
	}

	public void setAllemis(Set<EMI> allemis) {
		this.allemis = allemis;
	}

	@Override
	public String toString() {
		return "LoanAgreement{" +
				"loanAgreementId=" + loanAgreementId +
				", loanApplicationId=" + loanApplicationId +
				", allemis=" + allemis +
				'}';
	}
}

// Author : Saikiran
