package com.example.SpringBootMVCProject.model.dto;

import java.util.List;

public record OrderRequest(
        String custerName,
        String email,
        List<OrderItemRequest> items
) {
}
