package com.hla.in.homeloanapplication.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hla.in.homeloanapplication.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplicationDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long applicationId;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate applicationDate;

    //Customer is remaining @OneToOne relationship

    @Min(value = 50000,message = "Minimum home loan application value should be 50000")
    private double loanAppliedAmount;

    @Min(value = 500,message = "Minimum Approved Loan value should be 500")
    private double loanApprovedAmount;

    private boolean landVerificationApproval;
    private boolean financeVerificationApproval;
    private boolean adminApproval;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Min(value = 0,message = "Please enter valid Customer ID")
    private int customerId;
    ////////////////////////////////////////////////////////////////////////
    // This is Extra stuff from Master home loan application

    @Min(value = 0,message = "scheme id cannot be negative")
    private int schemeId;
    @Min(value = 0,message = "Cannot be less than 0")
    private double totalAnnualIncome;
    @Min(value = 0,message = "Cannot be less than 0")
    private double monthlyExpenses;
    @Min(value = 0,message = "Cannot be less than 0")
    private double otherMonthlyExpenses;

}
