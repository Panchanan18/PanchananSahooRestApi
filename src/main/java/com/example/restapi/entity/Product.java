package com.example.restapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder

public class Product {
    private String productId;
    private String productName;
    private String unitOfMeasure;
    private Date launchDate;


}
