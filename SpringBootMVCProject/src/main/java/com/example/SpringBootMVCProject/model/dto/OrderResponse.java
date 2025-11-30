package com.example.SpringBootMVCProject.model.dto;

import java.time.LocalDate;
import java.util.List;

public record OrderResponse(
        String orderId,
        String custerName,
        String email,
        String status,
        LocalDate orderDate,
        List<OrderItemResponse> items
) {
}
