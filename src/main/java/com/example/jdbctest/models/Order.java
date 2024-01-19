package com.example.jdbctest.models;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class Order {
    
    private UUID id;
    private String orderId;
    private String filmName;
    private String date;
    private String orders;
    private int theater;
    private LocalDateTime created_at;
}
