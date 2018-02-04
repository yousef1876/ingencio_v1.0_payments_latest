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
@Table(name  = "payments_creation_output")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class PaymentCreationOutput extends Auditable<PaymentCreationOutput>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "additional_reference" , nullable = false)
    private String additionalReference;


    @Column(name  = "external_reference" , nullable = false)
    private String externalReference;


    @Column(name  = "is_new_token" , nullable = false)
    private boolean isNewToken;


    @Column(name  = "token" , nullable = false)
    private String token;


}
