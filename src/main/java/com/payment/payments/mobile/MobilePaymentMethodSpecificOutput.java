package com.payment.payments.mobile;


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
@Table(name  = "mobile_payment_method_output")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class MobilePaymentMethodSpecificOutput extends Auditable<MobilePaymentMethodSpecificOutput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "authorisation_code" , nullable = false)
    private String authorisationCode;



    /*  fraudResults FK  */


    @Column(name = "network" , nullable = false)
    private String network;





   /* paymentData  FK*/



   @Column(name  = "payment_product_id" , nullable = false)
   private String paymentProductId;



   /*  threeDSecureResults FK */


}
