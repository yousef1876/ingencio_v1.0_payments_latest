package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.PaymentMethodType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "payment_product")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class PaymentProduct extends Auditable<PaymentProduct>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "accounts_on_file" , nullable = false)
    private String accountsOnFile;


    @Column(name  = "allows_recurring" , nullable = false)
    private boolean allowsRecurring;



    @Column(name  = "allows_tokenization" , nullable = false)
    private boolean allowsTokenization;



    @Column(name  = "auto_tokenized" , nullable = false)
    private boolean autoTokenized;



    @Column(name  = "can_be_iframed" , nullable = false)
    private String canBeIframed;




    /* displayHints FK*/



    @Column(name  = "fields" , nullable = false)
    private String fields;



    @Column(name  = "max_amount" , nullable = false)
    private Integer maxAmount;



    @Column(name  = "min_amount" , nullable = false)
    private Integer minAmount;



    @Column(name  = "mobile_integeration_level" , nullable = false)
    private String mobileIntegrationLevel;



    @Column(name  = "type" , nullable = false)
    private PaymentMethodType type;



    @Column(name  = "payment_product_group" , nullable = false)
    private String paymentProductGroup;



    @Column(name = "uses_redirection_to_3rd_party" , nullable = false)
    private boolean usesRedirectionTo3rdParty;


}
