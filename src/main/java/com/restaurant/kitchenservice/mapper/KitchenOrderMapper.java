package com.restaurant.kitchenservice.mapper;

import com.restaurant.kitchenservice.dto.KitchenOrderRequest;
import com.restaurant.kitchenservice.dto.KitchenOrderResponse;
import com.restaurant.kitchenservice.model.KitchenOrder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KitchenOrderMapper {

    KitchenOrder toEntity(KitchenOrderRequest request);

    KitchenOrderResponse toResponse(KitchenOrder order);

}