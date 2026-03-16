package com.restaurant.kitchenservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kitchen_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KitchenOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private String status;

}