package com.example.demo.bbs.domain;

import javax.persistence.*;

@Entity
@Table(name ="boards")
public class Board {
	
	@Id
	@GeneratedValue
	private long boardNo;
	
	@Column(name = "board_name")
	private String boardName;
	
	@Column(name = "user_id")
	private String userId;
}
