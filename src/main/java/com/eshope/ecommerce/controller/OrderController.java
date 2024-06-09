package com.eshope.ecommerce.controller;

import com.eshope.ecommerce.dto.OrderRequest;
import com.eshope.ecommerce.dto.OrderResponse;
import com.eshope.ecommerce.model.OrderModel;
import com.eshope.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getOrders")
    public List<OrderResponse> getOrders(){
    // ResponseEntity
        return orderService.getOrders();
    }

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order placed successfully!";
    }

    @GetMapping("/track-order/{isPaid}")
    public List<OrderModel> getPaidOrders(@PathVariable () boolean isPaid){
        return orderService.getOrderStatus(isPaid);
    }

    //Open and close princel break
//    public deleteOrder(){
//
//    }

}
