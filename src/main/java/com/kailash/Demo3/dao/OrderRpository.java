package com.kailash.Demo3.dao;

import com.kailash.Demo3.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRpository extends JpaRepository<Orders, Long> {


}
