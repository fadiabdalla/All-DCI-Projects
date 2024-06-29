package com.supermarkt.pos.pos.dao;

import com.supermarkt.pos.pos.entity.ProductEntity;
import com.supermarkt.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDao {

    @Autowired
    private ProductRepo productRepo;


    public ProductEntity addProduct(ProductEntity product){
        return this.productRepo.save(product);
    }

    public void deleteProduct(Long productId) {

        this.productRepo.deleteById(productId);
    }

    public ProductEntity updateProduct(ProductEntity product) {
        return this.productRepo.save(product);
    }

    public ProductEntity getProductByBarcode(Long barcode) {

        Optional<ProductEntity> optionalProduct = Optional.ofNullable(this.productRepo.findByBarcode(barcode));

        return optionalProduct.orElse(null);
    }

    public ProductEntity getProductById(Long produactId) {
        Optional<ProductEntity> optionalProduct = this.productRepo.findById(produactId);
        return optionalProduct.orElse(null);
    }

    @RequestMapping("/products/get-all")
    public List<ProductEntity>  getAllProducts() {

        return productRepo.findAll();
    }
}
