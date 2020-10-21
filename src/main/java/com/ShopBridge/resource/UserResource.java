package com.ShopBridge.resource;

import com.ShopBridge.Entity.Product;
import com.ShopBridge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/products/add")
public class UserResource {

    @Autowired
    UserService userService;
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> create(@RequestBody final Product product){
        userService.create(product);
        return  userService.getAll();
    }

     @GetMapping
    public List<Product> getAll() {
        return userService.getAll();    }

}
