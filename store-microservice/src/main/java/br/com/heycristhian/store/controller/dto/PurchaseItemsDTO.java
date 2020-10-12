package br.com.heycristhian.store.controller.dto;

public class PurchaseItemsDTO {

	private String id;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

}
