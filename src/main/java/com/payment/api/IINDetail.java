package com.payment.api;


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
@Table(name  = "iin_details")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
@AllArgsConstructor
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class IINDetail extends Auditable<IINDetail>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "allowed_incontext" , nullable = false)
    private boolean isAllowedInContext;


    @Column(name  = "payment_product_id" , nullable = false)
    private String paymentProductId;


}
