package com.matheusknaul.Labsystem.domain;

public class Product {
    private Long id;
    private String name;
    private String code;
    private String unit; // e.g., "kg", "L", "unit"
    private int minimumStock;
    private double price;

    public Product() {}

    public Product(Long id, String name, String code, String unit, int minimumStock, double price) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.unit = unit;
        this.minimumStock = minimumStock;
        this.price = price;
    }

    // Getters and Setters
}

