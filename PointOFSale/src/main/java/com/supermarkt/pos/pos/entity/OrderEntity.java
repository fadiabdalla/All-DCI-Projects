package com.supermarkt.pos.pos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Table(name = "orders")
@Entity
@Setter
@Getter
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "total")
    private Double total;


}
