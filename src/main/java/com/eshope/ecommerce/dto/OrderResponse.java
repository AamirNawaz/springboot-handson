package com.eshope.ecommerce.dto;

import com.eshope.ecommerce.model.OrderModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private Long id;
    private String orderNumber;
    public OrderResponse(OrderModel orderModel) {
        this.id = orderModel.getId();
        this.orderNumber = orderModel.getOrderNumber();
    }
}
