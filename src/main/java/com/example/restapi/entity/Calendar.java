package com.example.restapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calendar {
    private String locationId;
    private String Day;
    private LocalTime cutOffTime;

}
