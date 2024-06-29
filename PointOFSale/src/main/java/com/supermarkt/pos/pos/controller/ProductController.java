package com.supermarkt.pos.pos.controller;


import com.supermarkt.pos.pos.dao.ProductDao;
import com.supermarkt.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/products")
@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    ProductDao productDao;

    @PostMapping("/add-product")
    public ProductEntity addProduct(@RequestBody ProductEntity product){

        return this.productDao.addProduct(product);
    }

    @GetMapping("/delete-product")
    public String deleteProduct(@RequestParam Long productId){

         this.productDao.deleteProduct(productId);

         return "success";
    }

    @PostMapping("/update-product")
    public ProductEntity updateProduct(@RequestBody ProductEntity product){

        return this.productDao.updateProduct(product);
    }

    @GetMapping("/get-by-barcode")
    public ProductEntity getProductByBarcode(@RequestParam Long barcode){

        return  productDao.getProductByBarcode(barcode);
    }

    @GetMapping("/get-by-id")
    public ProductEntity getProductById(@RequestParam Long productId){

        return  productDao.getProductById(productId);
    }
    @GetMapping("/get-all-products")
    public List<ProductEntity> getAllProducts(){

        return  productDao.getAllProducts();
    }

}
