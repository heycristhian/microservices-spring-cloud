package br.com.heycristhian.provider.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Ordinance {
	
	@Id
	private String id;
	
	private Integer preparationTime;
	
	private OrderStatus status;
	
	@DBRef
	@Field("orderItem")
	private List<OrderItem> items;
	
	public Ordinance(List<OrderItem> itens) {
		this.items = itens;
		this.status = OrderStatus.RECEIVED;
	}
	
	public Ordinance() {
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Integer getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}
}
