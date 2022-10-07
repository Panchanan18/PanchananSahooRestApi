package com.example.restapi.service;

import com.example.restapi.entity.*;

public interface ProductService {
    ProductList sortProducts(ProductList productList);

    OutputInventory getInvPicture(InputInventory inputInventory) throws Exception;

    OutputStore findStoreAvailability(InputStore inputStore);
}
