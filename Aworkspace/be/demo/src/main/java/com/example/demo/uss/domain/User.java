package com.example.demo.uss.domain;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue
	private long userNo;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="passwd")
	private String passWd;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="email")
	private String email;
}
