package com.payment.orders;

import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.AcquireDescriptor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "order_references")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class OrderReferences extends Auditable<OrderReferences>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "descriptor" , nullable = false)
    private AcquireDescriptor decriptor;


    /* invoiceData FK*/


    /*  merchantOrderId */
    @Column(name  = "merchant_order_id" , nullable = false)
    private Integer merchantOrderId;


    @Column(name  = "merchant_reference" , nullable = false)
    private String merchantReference;
}
