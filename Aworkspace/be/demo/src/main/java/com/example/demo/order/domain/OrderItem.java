package com.example.demo.order.domain;

import javax.persistence.*;

import com.example.demo.item.domain.Item;
import com.example.demo.uss.domain.User;

@Entity
@Table(name="orderItems")
public class OrderItem {
	
	@Id
	@GeneratedValue
	@Column(name="order_item_id")
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="item_id")  // FK
	private Item item;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id") // FK
	private User user;
	
	@Column(name="order_price")
	private long orderPrice;
	
	@Column(name="order_status")
	private String count;
}
