package com.example.shippingservice.repository;

import com.example.shippingservice.entity.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingInfo, Long> {
    Optional<ShippingInfo> findByOrderId(String orderId);
}
