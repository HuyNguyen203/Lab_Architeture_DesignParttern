package com.example;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private int tableNumber;
    private List<Product> products;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Bàn " + tableNumber + " - Tổng tiền: " + getTotalPrice() + " VND";
    }
}
