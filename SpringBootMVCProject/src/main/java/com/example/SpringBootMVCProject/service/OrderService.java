package com.example.SpringBootMVCProject.service;

import com.example.SpringBootMVCProject.model.Order;
import com.example.SpringBootMVCProject.model.OrderItem;
import com.example.SpringBootMVCProject.model.Product;
import com.example.SpringBootMVCProject.model.dto.OrderItemRequest;
import com.example.SpringBootMVCProject.model.dto.OrderItemResponse;
import com.example.SpringBootMVCProject.model.dto.OrderRequest;
import com.example.SpringBootMVCProject.model.dto.OrderResponse;
import com.example.SpringBootMVCProject.repo.OrderRepo;
import com.example.SpringBootMVCProject.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {


    @Autowired
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public OrderResponse placeOrder(OrderRequest request) {
        Order order = new Order();

        String orderId = UUID.randomUUID().toString();
        order.setOrderId(orderId);
        order.setCustomerName(request.custerName());
        order.setEmail(request.email());
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());

        List<OrderItem> orderItems = new ArrayList<>();
        for(OrderItemRequest itemReq : request.items()) {
            Product product = productRepo.findById(itemReq.productId())
                    .orElseThrow(() -> new RuntimeException("Product Not Found"));

            product.setStackQuantity(product.getStackQuantity() - itemReq.quantity());
            productRepo.save(product);

            OrderItem orderItem = OrderItem.builder()
                    .product(product)
                    .quantity(itemReq.quantity())
                    .totalPrice(product.getPrice().multiply(BigDecimal.valueOf(itemReq.quantity())))
                    .order(order)
                    .build();
            orderItems.add(orderItem);
        }
        order.setOrderItems(orderItems);
        Order savedOrder= orderRepo.save(order);

        List<OrderItemResponse> orderItemResponses = new ArrayList<>();
        for(OrderItem orderItem : order.getOrderItems()) {
            OrderItemResponse orderItemResponse=new OrderItemResponse(
                    orderItem.getProduct().getName(),
                    orderItem.getId(),
                    orderItem.getTotalPrice()
            );
            orderItemResponses.add(orderItemResponse);
        }

        OrderResponse orderResponse= new OrderResponse(
                savedOrder.getOrderId(),
                savedOrder.getCustomerName(),
                savedOrder.getEmail(),
                savedOrder.getStatus(),
                savedOrder.getOrderDate(),
                orderItemResponses
        );
        return orderResponse;
    }

    public List<OrderResponse> getAllOrdersResponses() {
        List<Order> orders = orderRepo.findAll();
        List<OrderResponse> orderResponses = new ArrayList<>();

        for(Order order : orders) {

            List<OrderItemResponse> orderItemResponses = new ArrayList<>();

            for(OrderItem orderItem : order.getOrderItems()) {
                OrderItemResponse orderItemResponse=new OrderItemResponse(
                        orderItem.getProduct().getName(),
                        orderItem.getId(),
                        orderItem.getTotalPrice()
                );
                orderItemResponses.add(orderItemResponse);
            }

            OrderResponse orderResponse=new OrderResponse(
                    order.getOrderId(),
                    order.getCustomerName(),
                    order.getEmail(),
                    order.getStatus(),
                    order.getOrderDate(),
                    orderItemResponses
            );
            orderResponses.add(orderResponse);
        }

        return orderResponses;
    }
}
