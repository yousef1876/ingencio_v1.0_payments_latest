package com.payment.payments.mobile;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.AuthorizationMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "mobile_payment_method_input")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class MobilePaymentMethodSpecificInput extends Auditable<MobilePaymentMethodSpecificInput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "mode" , nullable = false)
    private AuthorizationMode mode;



    /* decryptedPaymentData FK*/


    @Column(name  = "encrypted_payment" , nullable = false)
    private String encryptedPaymentData;



    /* paymentProduct320SpecificInput FK*/



    @Column(name  = "payment_product_id" , nullable = false)
    private Integer paymentProductId;



    @Column(name  = "requires_approval" , nullable = false)
    private boolean requiresApproval;



    @Column(name  = "skip_fraud_service" , nullable = false)
    private boolean skipFraudService;



    @Column(name  = "transaction_id" , nullable = false)
    private String transactionId;







}
