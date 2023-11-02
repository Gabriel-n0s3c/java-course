package com.nosec.course.resources;

import com.nosec.course.entities.Order;
import com.nosec.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
         List<Order> listUsers = orderService.findAll();
        return ResponseEntity.ok().body(listUsers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){

        Order user = orderService.findByID(id);
        return ResponseEntity.ok().body(user);
    }


}
