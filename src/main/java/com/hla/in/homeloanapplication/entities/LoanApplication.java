package com.hla.in.homeloanapplication.entities;

import com.hla.in.homeloanapplication.enums.Status;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long applicationId;
    @Column
    private LocalDate applicationDate;
    @OneToOne
    @JoinColumn(name = "user_Info", referencedColumnName = "userId")
    private Customer customer;
    @Column
    private double loanAppliedAmount;
    @Column
    private double loanApprovedAmount;
    @Column
    private boolean landVerificationApproval;
    @Column
    private boolean financeVerificationApproval;
    @Column
    private boolean adminApproval;
    @Column
    private Status status;

    public LoanApplication(long applicationId, LocalDate applicationDate, Customer customer, double loanAppliedAmount, double loanApprovedAmount, boolean landVerificationApproval, boolean financeVerificationApproval, boolean adminApproval, Status status) {
        this.applicationId = applicationId;
        this.applicationDate = applicationDate;
        this.customer = customer;
        this.loanAppliedAmount = loanAppliedAmount;
        this.loanApprovedAmount = loanApprovedAmount;
        this.landVerificationApproval = landVerificationApproval;
        this.financeVerificationApproval = financeVerificationApproval;
        this.adminApproval = adminApproval;
        this.status = status;
    }

    public LoanApplication(long applicationId, Status status) {
        super();
        this.applicationId = applicationId;
        this.status = status;
    }

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getLoanAppliedAmount() {
        return loanAppliedAmount;
    }

    public void setLoanAppliedAmount(double loanAppliedAmount) {
        this.loanAppliedAmount = loanAppliedAmount;
    }

    public double getLoanApprovedAmount() {
        return loanApprovedAmount;
    }

    public void setLoanApprovedAmount(double loanApprovedAmount) {
        this.loanApprovedAmount = loanApprovedAmount;
    }

    public boolean isLandVerificationApproval() {
        return landVerificationApproval;
    }

    public void setLandVerificationApproval(boolean landVerificationApproval) {
        this.landVerificationApproval = landVerificationApproval;
    }

    public boolean isFinanceVerificationApproval() {
        return financeVerificationApproval;
    }

    public void setFinanceVerificationApproval(boolean financeVerificationApproval) {
        this.financeVerificationApproval = financeVerificationApproval;
    }

    public boolean isAdminApproval() {
        return adminApproval;
    }

    public void setAdminApproval(boolean adminApproval) {
        this.adminApproval = adminApproval;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "applicationId=" + applicationId +
                ", applicationDate=" + applicationDate +
                ", customer=" + customer +
                ", loanAppliedAmount=" + loanAppliedAmount +
                ", loanApprovedAmount=" + loanApprovedAmount +
                ", landVerificationApproval=" + landVerificationApproval +
                ", financeVerificationApproval=" + financeVerificationApproval +
                ", adminApproval=" + adminApproval +
                ", status=" + status +
                '}';
    }
}
