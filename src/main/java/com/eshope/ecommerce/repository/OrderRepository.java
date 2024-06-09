package com.eshope.ecommerce.repository;

import com.eshope.ecommerce.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel,Long> {
    List<OrderModel> findByOrderStatusAndIsPaid(boolean orderStatus,boolean isPaid);

}
