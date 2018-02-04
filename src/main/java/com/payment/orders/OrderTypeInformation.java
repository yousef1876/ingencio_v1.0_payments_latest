package com.payment.orders;

import com.config.payment.audit.Auditable;
import com.enums.PurchaseTypeEnum;
import com.enums.UsageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "order_type_infos")
@Data
@EntityListeners(com.config.payment.audit.EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class OrderTypeInformation extends Auditable<OrderTypeInformation>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "type" , nullable = false)
    private PurchaseTypeEnum type;


    @Column(name  = "usage" , nullable = false)
    private UsageType usage;



}
