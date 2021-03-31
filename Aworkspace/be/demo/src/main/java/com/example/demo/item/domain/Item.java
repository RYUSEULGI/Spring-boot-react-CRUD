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
	public long itemNo;

	@Column(name = "item_brand")
	public String itemBrand;

	@Column(name = "model_no")
	public String modelNo;

	@Column(name = "item_name")
	public String itemName;

	@Column(name = "item_color")
	public String itemColor;

	@Column(name = "release_date")
	public String releaseDate;
	
	@Column(name = "sold_out")
	public Boolean soldOut;
	
	@OneToMany(mappedBy = "item")
	private List<OrderItem> orderItem = new ArrayList<>();
	
}
