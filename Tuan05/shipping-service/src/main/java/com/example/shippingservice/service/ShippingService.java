package com.example.shippingservice.service;

import com.example.shippingservice.entity.ShippingInfo;
import com.example.shippingservice.enums.ShippingStatus;
import com.example.shippingservice.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    @Autowired
    private ShippingRepository shippingRepository;

    public ShippingInfo createShipping(String orderId, String address) {
        ShippingInfo shipping = new ShippingInfo();
        shipping.setOrderId(orderId);
        shipping.setAddress(address);
        shipping.setStatus(ShippingStatus.PENDING);
        return shippingRepository.save(shipping);
    }

    public ShippingInfo updateStatus(String orderId, ShippingStatus status) {
        ShippingInfo shipping = shippingRepository.findByOrderId(orderId)
                .orElseThrow(() -> new RuntimeException("Not found"));
        shipping.setStatus(status);
        return shippingRepository.save(shipping);
    }

    public ShippingInfo getShipping(String orderId) {
        return shippingRepository.findByOrderId(orderId).orElse(null);
    }
}