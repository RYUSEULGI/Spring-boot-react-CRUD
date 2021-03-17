package com.example.demo.bbs.domain;

import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Article {
	
	@Id
	@GeneratedValue
	private long articleNo;
	
	@Column(name = "user_no")
	private long userNo;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "reg_date")
	private String regDate;
}
