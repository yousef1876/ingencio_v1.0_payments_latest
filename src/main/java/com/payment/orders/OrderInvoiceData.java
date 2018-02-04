package com.payment.orders;

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
@Table(name  = "order_invoice_data")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class OrderInvoiceData extends Auditable<OrderInvoiceData>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "additional_data" , nullable = false)
    private String additionalData;


    @Column(name  = "invoice_date" , nullable = false)
    private String invoiceDate;


    @Column(name  = "invoice_number" , nullable = false)
    private String invoiceNumber;


    @Column(name  = "text_qualification" , nullable = false)
    private String textQualifiers;

}
