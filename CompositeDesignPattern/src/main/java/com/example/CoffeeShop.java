package com.example;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private List<Table> tables;

    public CoffeeShop() {
        this.tables = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public double getTotalRevenue() {
        return tables.stream().mapToDouble(Table::getTotalPrice).sum();
    }

    public void printRevenue() {
        System.out.println("====== Doanh thu quán cà phê ======");
        tables.forEach(System.out::println);
        System.out.println("Tổng doanh thu: " + getTotalRevenue() + " VND");
    }
}
