package com.payment.api;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "mandate_sepa_direct_debit_without_creditor")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class MandateSepaDirectDebitWithoutCreditor extends Auditable<MandateSepaDirectDebitWithoutCreditor>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /* bankAccountIban	FK   */


    @Column(name  = "customer_contract_identifier" , nullable = false)
    private String customerContractIdentifier;



    /*debtor  FK*/


    @Column(name  = "is_recurring" , nullable = false)
    private boolean isRecurring;




    /*   mandateApproval  FK*/




   @Column(name  = "pre_notification" , nullable = false)
   private String preNotification;




}
