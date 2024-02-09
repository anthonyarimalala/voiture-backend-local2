package com.example.springsecurity.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mobiletoken")
public class MobileToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmobiletoken")
    private Integer id;

    @Column(name = "iduser")
    private Integer userId;

    @Column(name = "mobiletoken")
    private String token;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public MobileToken() {
    }
}
