package com.supermarkt.pos.pos.dao;

import com.supermarkt.pos.pos.dto.OrderDto;
import com.supermarkt.pos.pos.entity.OrderEntity;
import com.supermarkt.pos.pos.entity.SaleEntity;
import com.supermarkt.pos.pos.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class SaleDao {

    @Autowired
    private SaleRepo saleRepo;

    private OrderDao orderDao;

    public SaleDao(OrderDao orderDao){

        this.orderDao = orderDao;
    }


    public OrderEntity saveSale(List<OrderDto> orderDto) {

        OrderEntity order = this.orderDao.saveOrder(orderDto);
        orderDto.forEach(o -> {
            SaleEntity saleEntity = new SaleEntity();
            saleEntity.setOrderId(order.getOrderId());
            saleEntity.setProductId(o.getProductId());
            saleEntity.setCreatedAt(LocalDateTime.now());
            this.saleRepo.save(saleEntity);
        });
         return order;
    }

    public  List<SaleEntity> getAllSales (){
        return this.saleRepo.findAll();
    }

    public List<SaleEntity> getSalesByOrderId(Long orderId) {
        return this.saleRepo.findAllByOrderId(orderId);
    }
}
