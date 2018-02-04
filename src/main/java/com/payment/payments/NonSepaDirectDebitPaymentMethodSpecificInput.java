package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.RecurringPaymentSequenceIndicatorEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "non_sepa_direct_debit_payment_method_input")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class NonSepaDirectDebitPaymentMethodSpecificInput extends Auditable<NonSepaDirectDebitPaymentMethodSpecificInput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "date_collect" , nullable = false)
    private String dateCollect;


    @Column(name  = "direct_debit_text" , nullable = false)
    private String directDebitText;


    @Column(name  = "is_recurring" , nullable = false)
    private boolean isRecurring;




  /*  paymentProduct705SpecificInput FK */


    @Column(name  = "payment_product_id" , nullable = false)
    private String paymentProductId;



    @Column(name  = "rec_pay" , nullable = false)
    private RecurringPaymentSequenceIndicatorEnum  recPay;



    @Column(name  = "token" , nullable = false)
    private String token;



    @Column(name  = "tokenize" , nullable = false)
    private String tokenize;


}
