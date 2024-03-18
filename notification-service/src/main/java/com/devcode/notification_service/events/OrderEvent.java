package com.devcode.notification_service.events;

import com.devcode.notification_service.model.enums.OrderStatus;

public record OrderEvent(String orderNumber, int itemsCount, OrderStatus orderStatus) {
}
