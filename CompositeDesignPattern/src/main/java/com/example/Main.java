package com.example;

public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm
        Product coffee = new Product("Cà phê", 25000);
        Product tea = new Product("Trà sữa", 40000);
        Product water = new Product("Nước suối", 15000);

        // Tạo bàn và thêm sản phẩm
        Table table1 = new Table(1);
        table1.addProduct(coffee);
        table1.addProduct(tea);

        Table table2 = new Table(2);
        table2.addProduct(water);
        table2.addProduct(coffee);
        table2.addProduct(tea);

        // Tạo quán cà phê và thêm bàn
        CoffeeShop shop = new CoffeeShop();
        shop.addTable(table1);
        shop.addTable(table2);

        // In doanh thu quán
        shop.printRevenue();
    
    }
}