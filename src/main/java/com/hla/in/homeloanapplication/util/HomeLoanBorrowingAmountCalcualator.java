package com.hla.in.homeloanapplication.util;

public class HomeLoanBorrowingAmountCalcualator {
	
	private double loanAmount;
	private double rateOfInterest;
	private int tenure;
	private double totalAnnualIncome;
	private double monthlyExpenses;
	private double otherMonthlyExpenses;
	
	public double getLoanAmount() {
		return loanAmount;
	}

	
	public HomeLoanBorrowingAmountCalcualator(double loanAmount, double rateOfInterest, int tenure,
			double totalAnnualIncome, double monthlyExpenses, double otherMonthlyExpenses) {
		super();
		this.loanAmount = loanAmount;
		this.rateOfInterest = rateOfInterest;
		this.tenure = tenure;
		this.totalAnnualIncome = totalAnnualIncome;
		this.monthlyExpenses = monthlyExpenses;
		this.otherMonthlyExpenses = otherMonthlyExpenses;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getTotalAnnualIncome() {
		return totalAnnualIncome;
	}
	public void setTotalAnnualIncome(double totalAnnualIncome) {
		this.totalAnnualIncome = totalAnnualIncome;
	}
	public double getMonthlyExpenses() {
		return monthlyExpenses;
	}
	public void setMonthlyExpenses(double monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}
	public double getOtherMonthlyExpenses() {
		return otherMonthlyExpenses;
	}
	public void setOtherMonthlyExpenses(double otherMonthlyExpenses) {
		this.otherMonthlyExpenses = otherMonthlyExpenses;
	}

	@Override
	public String toString() {
		return "HomeLoanBorrowingAmountCalculator [loanAmount=" + loanAmount + ", rateOfInterest=" + rateOfInterest
				+ ", tenure=" + tenure + ", totalAnnualIncome=" + totalAnnualIncome + ", monthlyExpenses="
				+ monthlyExpenses + ", otherMonthlyExpenses=" + otherMonthlyExpenses + "]";
	}
}

