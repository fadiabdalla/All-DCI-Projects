package com.supermarkt.pos.pos.controller;

import com.supermarkt.pos.pos.dao.SaleDao;
import com.supermarkt.pos.pos.entity.SaleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/sales")
@RestController
@CrossOrigin
public class SaleController {

    @Autowired
    SaleDao saleDao;


    @GetMapping("/get-all-sales")
    public List<SaleEntity> getAllSales (){
        return this.saleDao.getAllSales();
    }

    @GetMapping(path = "/get-by-order-id")
    public List<SaleEntity> getSalesByOrderId(@RequestParam Long orderId) {
        return this.saleDao.getSalesByOrderId(orderId);
    }
}
