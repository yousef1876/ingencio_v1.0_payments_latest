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
@Table(name  = "level_3_summary_data")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Level3SummaryData extends Auditable<Level3SummaryData>{



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "discount_amount" , nullable = false)
    private Integer discountAmount;


    @Column(name  = "dutty_amount" , nullable = false)
    private Integer dutyAmount;


    @Column(name  = "shipping_amount" , nullable = false)
    private Integer shippingAmount;

}
