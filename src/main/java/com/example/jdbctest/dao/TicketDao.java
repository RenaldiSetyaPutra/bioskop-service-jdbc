package com.example.jdbctest.dao;

import java.util.List;
import java.util.UUID;

import com.example.jdbctest.models.Order;

public interface TicketDao {
    
    List<Order> getAllOrders();
    Order getById(UUID id);
}
