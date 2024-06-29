package com.supermarkt.pos.pos.dao;

import com.supermarkt.pos.pos.dto.OrderDto;
import com.supermarkt.pos.pos.entity.OrderEntity;
import com.supermarkt.pos.pos.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDao {

    @Autowired
   private OrderRepo orderRepo;

    public OrderEntity saveOrder(List<OrderDto> orderDto) {
        if(orderDto.size() == 0){
            return null;
        }
        Double total = 0.0;
        for (OrderDto order : orderDto){

            total += order.getProductPrice();
        }

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTotal(total);
        return this.orderRepo.save(orderEntity);
    }

    public List<OrderEntity> getAllOrders() {

        return this.orderRepo.findAll();
    }
}
