package com.eshope.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String orderNumber;
    private Boolean orderStatus;
    private Boolean isPaid;
}
