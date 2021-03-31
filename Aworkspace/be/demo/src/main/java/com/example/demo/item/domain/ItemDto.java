package com.example.demo.item.domain;

import java.io.Serializable;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ItemDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long itemNo;
	private String itemBrand;
	private String modelNo;
	private String itemName;
	private String itemColor;
	private String releaseDate;
	private Boolean soldOut;
}
