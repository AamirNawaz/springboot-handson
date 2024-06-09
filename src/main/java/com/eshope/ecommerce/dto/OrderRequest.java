package com.eshope.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private String orderNumber;
    private Boolean orderStatus;
    private Boolean isPaid;
}
