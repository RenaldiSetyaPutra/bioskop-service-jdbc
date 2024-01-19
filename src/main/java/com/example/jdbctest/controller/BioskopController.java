package com.example.jdbctest.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbctest.dao.TicketDao;
import com.example.jdbctest.models.Order;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BioskopController {
    private final TicketDao ticketDao;

    @GetMapping("/getAllOrders")
    public List<Order> getAllOrders(){
        return ticketDao.getAllOrders();
    }

    // @PostMapping("/addOrder")
    // public OrderResponse addOrders(@RequestBody OrderRequest request){
    //     OrderResponse orders = crudService.saveOrders(request);
    //     if (orders != null){
    //         return orders;
    //     }
    //     return null;
    // }

    // @PutMapping("/updateOrder/{id}")
    // public OrderResponse updateOrders(@PathVariable UUID id, @RequestBody OrderRequest request){
    //     OrderResponse result = crudService.updateOrders(id, request);
    //     if (result != null){
    //         return result;
    //     }
    //     return null;
    // }

    @GetMapping("/getOrdersById/{id}")
    public Order getOrdersById(@PathVariable UUID id){
        return ticketDao.getById(id);
    }

    // @DeleteMapping("/deleteOrder/{id}")
    // public String deleteOrder(@PathVariable UUID id){
    //     if (crudService.deleteOrders(id)){
    //         return "Success Delete";
    //     }
    //     return "Failed Delete";
    // }
}
