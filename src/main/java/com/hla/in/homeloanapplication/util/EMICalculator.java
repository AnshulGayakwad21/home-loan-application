package com.hla.in.homeloanapplication.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EMICalculator {
	
	private double loanAmount;
	private double rateOfInterest;
	private int tenure;

	public double getEMIAmount() {
		return (loanAmount+(loanAmount*rateOfInterest))/(tenure);
	}


//	public double getLoanAmount() {
//		return loanAmount;
//	}
//
//	public void setLoanAmount(double loanAmount) {
//		this.loanAmount = loanAmount;
//	}
//
//	public double getRateOfInterest() {
//		return rateOfInterest;
//	}
//
//	public void setRateOfInterest(double rateOfInterest) {
//		this.rateOfInterest = rateOfInterest;
//	}
//
//	public int getTenure() {
//		return tenure;
//	}
//
//	public void setTenure(int tenure) {
//		this.tenure = tenure;
//	}
//
//	@Override
//	public String toString() {
//		return "EmiCalculator [loanAmount=" + loanAmount + ", rateOfInterest=" + rateOfInterest + ", tenure=" + tenure
//				+ "]";
//	}

}


