package com.example.demo.uss.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.example.demo.order.domain.OrderItem;

@Entity
@Table(name="users")
public class User{

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    public long userNo;

    @Column(name = "username")
    public String username;

    @Column(name = "password")
    public String password;
    
    @Column(name = "name")
    public String name;
    
    @Column(name = "email")
    public String email;
    
    @Column(name = "reg_date")
    public String regDate;
    
    @OneToMany(mappedBy="user")
    private List<OrderItem> orderItem = new ArrayList<>();
}