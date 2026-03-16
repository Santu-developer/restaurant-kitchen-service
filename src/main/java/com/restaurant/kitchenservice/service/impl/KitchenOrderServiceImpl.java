package com.restaurant.kitchenservice.service.impl;

import com.restaurant.kitchenservice.dto.KitchenOrderRequest;
import com.restaurant.kitchenservice.dto.KitchenOrderResponse;
import com.restaurant.kitchenservice.mapper.KitchenOrderMapper;
import com.restaurant.kitchenservice.model.KitchenOrder;
import com.restaurant.kitchenservice.repository.KitchenOrderRepository;
import com.restaurant.kitchenservice.service.KitchenOrderService;
import com.restaurant.kitchenservice.util.KitchenStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KitchenOrderServiceImpl implements KitchenOrderService {

    private final KitchenOrderRepository repository;
    private final KitchenOrderMapper mapper;

    @Override
    public KitchenOrderResponse createKitchenOrder(KitchenOrderRequest request) {

        KitchenOrder order = mapper.toEntity(request);

        order.setStatus(KitchenStatus.RECEIVED);

        KitchenOrder saved = repository.save(order);

        return mapper.toResponse(saved);
    }

    @Override
    public List<KitchenOrderResponse> getAllKitchenOrders() {

        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }
}