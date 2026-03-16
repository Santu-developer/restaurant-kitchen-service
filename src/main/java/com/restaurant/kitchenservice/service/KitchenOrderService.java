package com.restaurant.kitchenservice.service;

import com.restaurant.kitchenservice.dto.KitchenOrderRequest;
import com.restaurant.kitchenservice.dto.KitchenOrderResponse;

import java.util.List;

public interface KitchenOrderService {

    KitchenOrderResponse createKitchenOrder(KitchenOrderRequest request);

    List<KitchenOrderResponse> getAllKitchenOrders();

}