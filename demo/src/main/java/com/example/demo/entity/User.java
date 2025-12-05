package com.example.demo.entity;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    // db columns

    @Id //id
    @GeneratedValue(strategy = GenerationType.UUID) // id is UUID
    private UUID userId;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;
    
    @CreationTimestamp
    private Instant creationTimestamp;
    
    @UpdateTimestamp
    private Instant updatedTimestamp;

    // user constructor padrao
    public User() {
    }

    // metodo construtor personalizado

    public User(String username, String email, String password, Instant creationTimestamp, Instant updatedTimestamp) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.creationTimestamp = creationTimestamp;
        this.updatedTimestamp = updatedTimestamp;
    }

    public UUID getUserId() {
        return userId;
    }
}