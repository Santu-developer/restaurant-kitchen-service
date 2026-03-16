package com.restaurant.kitchenservice.dto;

import lombok.Data;

@Data
public class KitchenOrderResponse {

    private Long id;

    private Long orderId;

    private String status;

}