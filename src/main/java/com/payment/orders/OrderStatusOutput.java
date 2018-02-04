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
@Table(name  = "order_status_output")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class OrderStatusOutput extends Auditable<OrderStatusOutput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "errors" , nullable = false)
    private String errors;


    @Column(name  = "is_cancellable" , nullable = false)
    private boolean isCancellable;


    @Column(name  = "status" , nullable = false)
    private com.enums.OrderStatusOutput status;



    @Column(name  = "status_code" , nullable = false)
    private String statusCode;



    @Column(name  = "status_code_change_date_time" , nullable = false)
    private String statusCodeChangeDateTime;

}
