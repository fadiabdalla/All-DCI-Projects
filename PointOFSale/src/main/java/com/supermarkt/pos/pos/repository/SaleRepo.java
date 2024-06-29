package com.supermarkt.pos.pos.repository;

import com.supermarkt.pos.pos.entity.OrderEntity;
import com.supermarkt.pos.pos.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepo extends JpaRepository<SaleEntity,Long> {
    List<SaleEntity> findAllByOrderId(Long orderId);
}
