package com.example.demo.uss.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.example.demo.order.domain.OrderItem;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private long userNo;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "reg_date")
    private String regDate;

     @OneToMany(mappedBy="user")
     private List<OrderItem> orderItem = new ArrayList<>();
}