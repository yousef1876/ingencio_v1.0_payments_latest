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
@Table(name  = "payment_product_field_display_hint")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class PaymentProductFieldDisplayHints extends Auditable<PaymentProductFieldDisplayHints>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name = "alawys_show" , nullable = false)
    private boolean alwaysShow;


    @Column(name  = "display_order" , nullable = false)
    private Integer displayOrder;



    /* formElement FK  */



    @Column(name  = "label" , nullable = false)
    private String label;



    @Column(name  = "mask" , nullable = false)
    private String mask;



    @Column(name  = "obfuscate" , nullable = false)
    private  boolean obfuscate;



    @Column(name  = "place_holder_label" , nullable = false)
    private String placeholderLabel;


    @Column(name  = "preferred_input_type" , nullable = false)
    private String preferredInputType;




    /* tooltip FK */


}
