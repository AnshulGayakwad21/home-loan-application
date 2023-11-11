package com.hla.in.homeloanapplication.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoanAgreement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanAgreementId;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name ="fk_emi_id",referencedColumnName = "emiId")
	EMI emi;

	////////////////////////////////////////////////////////////////////////
	//@Column
	//loanApplicationId is not present in the MAster Home loan application
	//check it once
	//private long loanApplicationId;


	////////////////////////////////////////////////////////////////////////
//	@OneToMany(cascade = CascadeType.ALL)
//	//We can write this, as per the Instructor
//	//@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinTable(name = "LOAN_EMI", joinColumns = @JoinColumn(name = "loanAgreementId" ),
//			inverseJoinColumns = @JoinColumn(name = "emiId"))
//	private Set<EMI> allemis = new HashSet<>();
	////////////////////////////////////////////////////////////////////////

//	public LoanAgreement(long loanAgreementId, long loanApplicationId, Set<EMI> allemis) {
//		this.loanAgreementId = loanAgreementId;
//		this.loanApplicationId = loanApplicationId;
//		this.allemis = allemis;
//	}
//
//	public LoanAgreement(long loanAgreementId, long loanApplicationId) {
//		super();
//		this.loanAgreementId = loanAgreementId;
//		this.loanApplicationId = loanApplicationId;
//	}

//	public long getLoanAgreementId() {
//		return loanAgreementId;
//	}
//
//	public void setLoanAgreementId(long loanAgreementId) {
//		this.loanAgreementId = loanAgreementId;
//	}
//
//	public long getLoanApplicationId() {
//		return loanApplicationId;
//	}
//
//	public void setLoanApplicationId(long loanApplicationId) {
//		this.loanApplicationId = loanApplicationId;
//	}
//
//	public Set<EMI> getAllemis() {
//		return allemis;
//	}
//
//	public void setAllemis(Set<EMI> allemis) {
//		this.allemis = allemis;
//	}

//	@Override
//	public String toString() {
//		return "LoanAgreement{" +
//				"loanAgreementId=" + loanAgreementId +
//				", loanApplicationId=" + loanApplicationId +
//				", allemis=" + allemis +
//				'}';
//	}
}

