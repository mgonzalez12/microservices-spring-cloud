package com.unclecode.orders_service.model.dtos;

public record OrderItemsResponse(Long id, String sku, Double price, Long quantity) {
}
