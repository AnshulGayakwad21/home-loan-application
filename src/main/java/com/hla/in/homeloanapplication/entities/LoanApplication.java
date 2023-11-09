package com.hla.in.homeloanapplication.entities;

import com.hla.in.homeloanapplication.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long applicationId;
    @Column
    private LocalDate applicationDate;

    @OneToOne(cascade = CascadeType.ALL)
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
    @Enumerated(EnumType.STRING)
    private Status status;
////////////////////////////////////////////////////////////////////////////////////////////////
    //added this relationship from Master homeloan application
    //If it is giving errors, then delete it
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_loanagrmnt_id",referencedColumnName = "loanAgreementId")
    LoanAgreement loanAgreement;


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
