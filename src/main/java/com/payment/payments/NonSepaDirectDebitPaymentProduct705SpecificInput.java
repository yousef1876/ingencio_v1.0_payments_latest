package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import liquibase.datatype.DataTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "non_sepa_direct_debit_payment_product_705_input")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class NonSepaDirectDebitPaymentProduct705SpecificInput extends Auditable<NonSepaDirectDebitPaymentProduct705SpecificInput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "authorisation_id" , nullable = false)
    private String authorisationId;


    /* bankAccountBban FK  */


    @Column(name  = "type" , nullable = false)
    private TransactionType types;


}
