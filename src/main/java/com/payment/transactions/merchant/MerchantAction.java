package com.payment.transactions.merchant;

import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.MerchantActionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "merchant_action")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class MerchantAction extends Auditable<MerchantAction>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "type" , nullable = false)
    private MerchantActionType type;



    /*  redirectData FK */


    @Column(name  = "rendering_data" , nullable = false)
    private String renderingData;


    @Column(name  = "show_data" , nullable = false)
    private String showData;


}
