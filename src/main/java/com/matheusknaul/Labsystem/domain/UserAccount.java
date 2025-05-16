package com.matheusknaul.Labsystem.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="users")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name  = "name_account", unique = true, nullable =false)
    private String nameAccount;
	@Column(name  = "name_view", nullable =false)
    private String nameView;
    
    @Column(name  = "email", unique = true, nullable =false)
    private String email;
    
    @Column(name  = "cpf", unique = true, nullable = false, length = 14)
    private String cpf;
    
    private String password;
    private String role;

    public UserAccount() {}

    public UserAccount(Integer id, String nameAccount, String nameView, String email, String cpf, String password, String role) {
        this.id = id;
        this.nameAccount = nameAccount;
        this.nameView = nameView;
        this.email = email;
        this.cpf = cpf;
        this.password = password;
        this.role = role;
    }

}
