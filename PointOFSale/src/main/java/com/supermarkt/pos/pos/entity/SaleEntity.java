package com.supermarkt.pos.pos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;


@Table(name = "sales")
@Entity
@Setter
@Getter
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Long saleId;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product;

}
