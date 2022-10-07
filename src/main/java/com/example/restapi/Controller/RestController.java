package com.example.restapi.Controller;

import com.example.restapi.entity.*;
import com.example.restapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private ProductService productService;

    @PostMapping("/sortProducts")
    public ProductList sortProducts(@RequestBody ProductList  productList){
        return this.productService.sortProducts(productList);
    }

    @GetMapping("/getInvPicture")
    public OutputInventory getInvPicture(@RequestBody InputInventory inputInventory) throws Exception {
        return this.productService.getInvPicture(inputInventory);

    }

    @PostMapping("/findStoreAvailability")
    public OutputStore findStoreAvailability(@RequestBody InputStore inputStore){
        return this.productService.findStoreAvailability(inputStore);
    }


}
