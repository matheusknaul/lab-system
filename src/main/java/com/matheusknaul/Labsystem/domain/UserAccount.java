package com.matheusknaul.Labsystem.domain;

public class UserAccount {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;

    public UserAccount() {}

    public UserAccount(Long id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}
