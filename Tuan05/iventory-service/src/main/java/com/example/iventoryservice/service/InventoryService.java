package com.example.iventoryservice.service;

import com.example.iventoryservice.entity.InventoryItem;
import com.example.iventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean reserve(String productId, int qty) {
        InventoryItem item = inventoryRepository.findByProductId(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        if (item.getQuantity() >= qty) {
            item.setQuantity(item.getQuantity() - qty);
            inventoryRepository.save(item);
            return true;
        }
        return false;
    }

    public void release(String productId, int qty) {
        InventoryItem item = inventoryRepository.findByProductId(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        item.setQuantity(item.getQuantity() + qty);
        inventoryRepository.save(item);
    }

    public InventoryItem getInventory(String productId) {
        return inventoryRepository.findByProductId(productId).orElse(null);
    }
}