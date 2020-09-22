package br.com.heycristhian.store.controller.dto;

public class PurchaseItemsDTO {

	private long id;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

}
