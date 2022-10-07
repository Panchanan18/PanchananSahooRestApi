package com.example.restapi.service;

import com.example.restapi.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.util.resources.cldr.ta.CalendarData_ta_IN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductList IproductList;

    List<Inventory> inventories= new ArrayList<>();
    List<Calendar>  calendars = new ArrayList<>();
    public ProductServiceImp() throws ParseException {
        inventories.add(new Inventory("Prod1", "Shirt", "EACH", 10, new SimpleDateFormat("YYYY-mm-dd").parse("2021-03-19")));
        inventories.add(new Inventory("Prod1", "Shirt", "EACH", 20, new SimpleDateFormat("YYYY-mm-dd").parse("2021-03-21")));
        inventories.add(new Inventory("Prod1", "Shirt", "EACH", 20, new SimpleDateFormat("YYYY-mm-dd").parse("2021-03-28")));

    }


    @Override
    public ProductList sortProducts(ProductList productList) {
        List<Product> list= productList.getProductList().stream().sorted((o1, o2)->o2.getProductId().
                compareTo(o1.getProductId())).
                collect(Collectors.toList());
        IproductList.setProductList(list);
        return IproductList;
    }

    @Override
    public OutputInventory getInvPicture(InputInventory inputInventory) throws Exception {
        if(inputInventory.getReqDate().getDate()>28){
             throw new Exception("Invalid Request Date");

        }
       else if(inputInventory.getReqDate().getDate()<=19){
            return new OutputInventory("Prod1","Shirt",50);

        }
       else if (inputInventory.getReqDate().getDate()<=21){
            return new OutputInventory("Prod1","Shirt",40);

        }
       else{
            return new OutputInventory("Prod1","Shirt",20);

        }

    }

    @Override
    public OutputStore findStoreAvailability(InputStore inputStore) {
         return null;
    }
}
