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
import javax.validation.constraints.Null;

@Entity
@Table(name  = "invoice_payment_method_specific_output")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage =  CacheConcurrencyStrategy.READ_WRITE)
public class InvoicePaymentMethodSpecificOutput extends Auditable<InvoicePaymentMethodSpecificOutput>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "payment_product_id" , nullable = false)
    private Integer paymentProductId;


}
