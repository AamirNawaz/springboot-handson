package com.eshope.ecommerce.service;

import com.eshope.ecommerce.dto.OrderRequest;
import com.eshope.ecommerce.dto.OrderResponse;
import com.eshope.ecommerce.model.OrderModel;
import com.eshope.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    public final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }
    public List<OrderResponse> getOrders(){
        List<OrderModel> result = orderRepository.findAll();
        return result.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }
    private OrderResponse mapToDto(OrderModel orderModel) {
        return new OrderResponse(orderModel);
    }

    public void placeOrder(OrderRequest orderRequest){
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderNumber(orderRequest.getOrderNumber());
        orderModel.setOrderStatus(orderRequest.getOrderStatus());
        orderModel.setIsPaid(orderRequest.getIsPaid());
        orderRepository.save(orderModel);
    }

    public List<OrderModel> getOrderStatus(boolean isPaid) {
        return orderRepository.findByOrderStatusAndIsPaid(true,true);
    }
}
