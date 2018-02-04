package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.CustomerAccountStatus;
import com.enums.CustomerAddressStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "payment_product_840_customer_account")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class PaymentProduct840CustomerAccount extends Auditable<PaymentProduct840CustomerAccount>{



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "account_id" , nullable = false)
    private String accountId;


    @Column(name  = "billing_aggreement_id" ,nullable = false)
    private String billingAgreementId;


    @Column(name  = "company_name" , nullable = false)
    private String companyName;



    @Column(name  = "country_code" , nullable = false)
    private String countryCode;



    @Column(name  = "status_address" , nullable = false)
    private CustomerAddressStatus statusAddress;


    @Column(name  = "account_status" , nullable = false)
    private CustomerAccountStatus  accountStatus;



    @Column(name  = "first_name" , nullable = false)
    private String firstName;



    @Column(name  = "payer_id" , nullable = false)
    private String payerId;



    @Column(name  = "surname" , nullable = false)
    private String surname;

}
