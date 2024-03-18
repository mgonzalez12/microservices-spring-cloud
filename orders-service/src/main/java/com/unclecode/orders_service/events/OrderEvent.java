package com.unclecode.orders_service.events;

import com.unclecode.orders_service.model.enums.OrderStatus;

public record OrderEvent(String orderNumber, int itemsCount, OrderStatus orderStatus) {
}
