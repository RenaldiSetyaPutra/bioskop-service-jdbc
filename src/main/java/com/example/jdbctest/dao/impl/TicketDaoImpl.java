package com.example.jdbctest.dao.impl;

import java.util.List;
import java.util.UUID;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.jdbctest.dao.TicketDao;
import com.example.jdbctest.models.Order;

@Component
public class TicketDaoImpl implements TicketDao{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Order> getAllOrders(){
        String query = "SELECT * FROM orders";
        
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Order.class));
    }

    @Override
    public Order getById(UUID id) {
        String query = "SELECT * FROM orders WHERE id = ?";

        return jdbcTemplate.queryForObject(query, new Object[]{id}, new BeanPropertyRowMapper<>(Order.class));
    }
}
