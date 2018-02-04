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
@Table(name  = "mandate_approval")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage =  CacheConcurrencyStrategy.READ_WRITE)
public class MandateApproval extends Auditable<MandateApproval>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "mandate_signature_data" , nullable = false)
    private String mandateSignatureDate;


    @Column(name  = "mandate_signature_place" , nullable = false)
    private String mandateSignaturePlace;


    @Column(name = "mandate_signed" , nullable = false)
    private boolean mandateSigned;


}
