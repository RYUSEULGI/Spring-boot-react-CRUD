package com.example.demo.uss.domain;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User{

    @Id
    @Column(name = "user_no")
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}