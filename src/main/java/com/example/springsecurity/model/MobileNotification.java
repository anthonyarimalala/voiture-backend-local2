package com.example.springsecurity.model;

import jakarta.persistence.*;


@Entity
@Table(name = "mobilenotification")
public class MobileNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmobilenotification")
    private Integer id;

    @Column(name = "idreceive")
    private Integer receiverId;

    @Column(name = "_message")
    private String message;

    public MobileNotification() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
