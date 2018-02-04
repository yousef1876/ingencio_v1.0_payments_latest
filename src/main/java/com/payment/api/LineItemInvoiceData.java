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
@Table(name  = "line_item_invoice_data")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class LineItemInvoiceData extends Auditable<LineItemInvoiceData>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "description" , nullable = true)
    private String description;


    @Column(name  = "merchant_line_number" , nullable = false)
    private String merchantLinenumber;



    @Column(name  = "merchant_page_number" , nullable = false)
    private String merchantPagenumber;



    @Column(name  = "nr_of_items" , nullable = false)
    private String nrOfItems;



    @Column(name  = "price_per_item" , nullable = false)
    private String pricePerItem;





}
