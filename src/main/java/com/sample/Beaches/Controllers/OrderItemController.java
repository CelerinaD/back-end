package com.sample.Beaches.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Beaches.Model.OrderItem;
import com.sample.Beaches.NotFoundException.OrderNotFoundException;
import com.sample.Beaches.Repository.OrderItemRepository;


@RestController
public class OrderItemController {

    OrderItemRepository repo;
     public OrderItemController(OrderItemRepository repo) {
        this.repo = repo;
    }
    
    @GetMapping("/orderItems")
    public List<OrderItem> getOrderItems(){
        return repo.findAll();
    }

     @GetMapping("/orderItem/{id}")
     public Order getOrderItem(@PathVariable Long id) {
         return repo.findById(id).orElseThrow(
            () -> new OrderNotFoundException(id)
            );
     }

    @PostMapping("/order/new")
    public String addOrderItem(@RequestBody OrderItem newOrder){
        repo.save(newOrderItem);
        return "A new order item is created.";
    }


     @DeleteMapping("/orderItem/delete/{id}")
    public String deleteOrderItem(@PathVariable Long id) {
        repo.deleteById(id);
        return "The order item is deleted!";
    }



}
    


}
