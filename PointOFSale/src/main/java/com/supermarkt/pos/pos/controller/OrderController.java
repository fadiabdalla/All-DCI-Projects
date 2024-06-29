package com.supermarkt.pos.pos.controller;

import com.supermarkt.pos.pos.dao.OrderDao;
import com.supermarkt.pos.pos.dao.SaleDao;
import com.supermarkt.pos.pos.dto.OrderDto;
import com.supermarkt.pos.pos.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/orders")
@RestController
@CrossOrigin
public class OrderController {
    @Autowired
    OrderDao orderDao;

    @Autowired
    SaleDao saleDao;

    @PostMapping("/save-order")
    public OrderEntity saveOrder(@RequestBody List<OrderDto> orderDto){

        return this.saleDao.saveSale(orderDto);
    }

    @GetMapping("/get-all-orders")
    public List<OrderEntity> getAllOrders(){

        return this.orderDao.getAllOrders();
    }


}
