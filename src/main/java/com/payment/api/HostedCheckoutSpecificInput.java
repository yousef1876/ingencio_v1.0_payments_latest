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
@Table(name  = "checkout_specific_inpout")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class HostedCheckoutSpecificInput extends Auditable<HostedCheckoutSpecificInput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "is_recurring" , nullable = false)
    private boolean isRecurring;


    @Column(name  = "locale" , nullable = false)
    private String locale;



    /*paymentProductFilters FK*/


    @Column(name  = "return_url" , nullable = false)
    private String returnUrl;



    @Column(name  = "show_result_page" , nullable = false)
    private boolean showResultPage;


    @Column(name  = "token" , nullable = false)
    private String tokens;



    @Column(name  = "variant" , nullable = false)
    private String variant;


}
