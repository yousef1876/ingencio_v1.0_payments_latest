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
@Table(name  = "capture_payment_request")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache( usage =  CacheConcurrencyStrategy.READ_WRITE)
public class CapturePaymentRequest extends Auditable<CapturePaymentRequest>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "amount" , nullable = false)
    private String amount;

    @Column(name  = "is_final" , nullable = false)
    private boolean isFinal;


}
