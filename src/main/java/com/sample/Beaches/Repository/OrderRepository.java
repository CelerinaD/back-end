package com.sample.Beaches.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.Beaches.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
