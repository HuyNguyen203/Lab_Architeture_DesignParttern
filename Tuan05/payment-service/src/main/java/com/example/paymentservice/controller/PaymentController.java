package com.example.paymentservice.controller;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestParam String orderId, @RequestParam Double amount) {
        return ResponseEntity.ok(paymentService.createPayment(orderId, amount));
    }

    @PostMapping("/{orderId}/confirm")
    public ResponseEntity<Payment> confirm(@PathVariable String orderId) {
        return ResponseEntity.ok(paymentService.confirmPayment(orderId));
    }

    @PostMapping("/{orderId}/refund")
    public ResponseEntity<Payment> refund(@PathVariable String orderId) {
        return ResponseEntity.ok(paymentService.refund(orderId));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Payment> getByOrderId(@PathVariable String orderId) {
        return ResponseEntity.ok(paymentService.getPaymentByOrderId(orderId));
    }
}
