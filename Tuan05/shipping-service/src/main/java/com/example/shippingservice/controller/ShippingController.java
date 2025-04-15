package com.example.shippingservice.controller;

import com.example.shippingservice.entity.ShippingInfo;
import com.example.shippingservice.enums.ShippingStatus;
import com.example.shippingservice.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    @PostMapping("/create")
    public ResponseEntity<ShippingInfo> create(@RequestParam String orderId, @RequestParam String address) {
        return ResponseEntity.ok(shippingService.createShipping(orderId, address));
    }

    @PutMapping("/update-status")
    public ResponseEntity<ShippingInfo> updateStatus(@RequestParam String orderId,
                                                     @RequestParam ShippingStatus status) {
        return ResponseEntity.ok(shippingService.updateStatus(orderId, status));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<ShippingInfo> getShipping(@PathVariable String orderId) {
        return ResponseEntity.ok(shippingService.getShipping(orderId));
    }
}
