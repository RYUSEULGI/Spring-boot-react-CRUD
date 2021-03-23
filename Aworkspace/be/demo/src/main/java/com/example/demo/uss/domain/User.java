package com.example.demo.uss.domain;

import javax.persistence.*;

import lombok.Builder;

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
    
	@Column(name = "authority")
	private String authority;
	
    @Column(name = "enabled")
    private boolean enabled;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "birthday")
    private String birthday;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "reg_date")
    private String regDate;

	@Builder
	public User(String name, String password, String username, 
			String email, String birthday, String gender, String regdate) {
		super();
		this.name = name;
		this.password = password;
		this.username = username;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.regDate = regdate;
		return;
	}
	
	public User() { 
		return;
	}
}