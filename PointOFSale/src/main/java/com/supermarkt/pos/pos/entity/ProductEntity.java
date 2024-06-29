package com.supermarkt.pos.pos.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Table(name = "products")
@Entity
@Setter
@Getter
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private Double productPrice;
    @Column(name = "barcode")
    private Long barcode;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private List<SaleEntity> sales;



}
