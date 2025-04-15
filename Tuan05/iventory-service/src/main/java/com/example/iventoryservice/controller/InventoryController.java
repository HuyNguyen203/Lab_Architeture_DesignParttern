package com.example.iventoryservice.controller;

import com.example.iventoryservice.entity.InventoryItem;
import com.example.iventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/reserve")
    public ResponseEntity<String> reserve(@RequestParam String productId, @RequestParam int quantity) {
        boolean result = inventoryService.reserve(productId, quantity);
        return result ? ResponseEntity.ok("Reserved") : ResponseEntity.badRequest().body("Not enough stock");
    }

    @PostMapping("/release")
    public ResponseEntity<String> release(@RequestParam String productId, @RequestParam int quantity) {
        inventoryService.release(productId, quantity);
        return ResponseEntity.ok("Released");
    }

    @GetMapping("/{productId}")
    public ResponseEntity<InventoryItem> getInventory(@PathVariable String productId) {
        return ResponseEntity.ok(inventoryService.getInventory(productId));
    }
}