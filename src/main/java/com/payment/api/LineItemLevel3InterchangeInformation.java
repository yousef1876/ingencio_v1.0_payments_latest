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
@Table(name  = "line_item_level_3_info")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class LineItemLevel3InterchangeInformation extends Auditable<LineItemLevel3InterchangeInformation>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "discount_amount" , nullable = false)
    private Integer discountAmount;


    @Column(name  = "line_amount_total" , nullable = false)
    private Integer lineAmountTotal;


    @Column(name  = "product_code" , nullable = false)
    private String productCode;


    @Column(name  = "product_price" , nullable = false)
    private Integer  productPrice;


    @Column(name  = "product_type" , nullable = false)
    private String productType;


    @Column(name  = "quantity" , nullable = false)
    private Integer quantity;


    @Column(name  = "tax_amount" , nullable = false)
    private Integer taxAmount;


    @Column(name = "unit" , nullable = false)
    private String unit;

}
