package com.sample.Beaches.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.Beaches.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
