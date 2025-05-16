package com.matheusknaul.Labsystem.domain;

public class Supplier {
    private Long id;
    private String name;
    private String cnpj;
    private String email;
    private String phone;
    private String address;

    public Supplier() {}

    public Supplier(Long id, String name, String cnpj, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters and Setters
}

