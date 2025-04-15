package com.example.shippingservice.entity;

import com.example.shippingservice.enums.ShippingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShippingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;

    @Enumerated(EnumType.STRING)
    private ShippingStatus status;

    private String address;

    private LocalDateTime createdAt = LocalDateTime.now();
}