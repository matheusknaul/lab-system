package com.matheusknaul.Labsystem.domain;

public class Service {
    private Long id;
    private String description;
    private double price;
    private String type; // e.g., "Calibration", "Maintenance", "Analysis"

    public Service() {}

    public Service(Long id, String description, double price, String type) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.type = type;
    }

    // Getters and Setters
}

