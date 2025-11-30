package com.example.SpringBootMVCProject.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
