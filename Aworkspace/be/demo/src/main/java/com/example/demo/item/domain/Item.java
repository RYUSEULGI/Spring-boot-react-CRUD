package com.example.demo.item.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.example.demo.order.domain.OrderItem;

import lombok.Data;

@Entity
@Data
@Table(name = "items")
public class Item {

	@Id
	@Column(name = "item_id")
	@GeneratedValue
	private long itemNo;

	@Column(name = "item_brand")
	private String itemBrand;

	@Column(name = "model_no")
	private String modelNo;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "item_color")
	private String itemColor;

	@Column(name = "release_date")
	private String releaseDate;

	@Column(name = "sold_out")
	private Boolean soldOut;

	 @OneToMany(mappedBy = "item")
	 private List<OrderItem> orderItem = new ArrayList<>();
}
