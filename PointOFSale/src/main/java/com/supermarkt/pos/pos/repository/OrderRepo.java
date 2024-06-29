package com.supermarkt.pos.pos.repository;

import com.supermarkt.pos.pos.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity,Long> {
}
