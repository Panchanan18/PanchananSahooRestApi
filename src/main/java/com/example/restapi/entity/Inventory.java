package com.example.restapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inventory {
    private String productId;
    private String productName;
    private String UOM;
    private double availQty;
    private Date availDate;

}
