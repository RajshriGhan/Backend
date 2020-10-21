package com.ShopBridge.service;

import com.ShopBridge.Entity.Product;
import com.ShopBridge.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin("http://localhost:4200")
public class UserService {

    @Autowired
    ProductRepository productRepository;

    public void create(Product product){
        productRepository.save(product);
    }


    public List<Product> getAll(){
        return productRepository.findAll();
    }
}
