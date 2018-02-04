package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "payment_output")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class PaymentOutput extends Auditable<PaymentOutput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /* amountOfMoney FK*/


    @Column(name  = "amount_paid" , nullable = false)
    private String amountPaid;


     /* bankTransferPaymentMethodSpecificOutput  FK */



     /* cardPaymentMethodSpecificOutput FK  */



     /*  cashPaymentMethodSpecificOutput FK */



     /* directDebitPaymentMethodSpecificOutput FK*/



     /*invoicePaymentMethodSpecificOutput  FK*/




     /*mobilePaymentMethodSpecificOutput FK*/




     /*paymentMethod  FK*/




     /*redirectPaymentMethodSpecificOutput FK*/




     /* references FK*/




     /*  sepaDirectDebitPaymentMethodSpecificOutput   FK*/




}
