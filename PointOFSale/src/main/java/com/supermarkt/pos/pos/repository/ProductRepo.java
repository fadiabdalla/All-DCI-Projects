package com.supermarkt.pos.pos.repository;

import com.supermarkt.pos.pos.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Long> {

    ProductEntity findByBarcode(Long barcode);

}
