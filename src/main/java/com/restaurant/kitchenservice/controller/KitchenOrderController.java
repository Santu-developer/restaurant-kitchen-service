package com.restaurant.kitchenservice.controller;

import com.restaurant.kitchenservice.dto.KitchenOrderRequest;
import com.restaurant.kitchenservice.dto.KitchenOrderResponse;
import com.restaurant.kitchenservice.service.KitchenOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitchen-orders")
@RequiredArgsConstructor
public class KitchenOrderController {

    private final KitchenOrderService service;

    @PostMapping
    public KitchenOrderResponse createKitchenOrder(
            @RequestBody KitchenOrderRequest request) {

        return service.createKitchenOrder(request);
    }

    @GetMapping
    public List<KitchenOrderResponse> getAllKitchenOrders() {

        return service.getAllKitchenOrders();
    }
}