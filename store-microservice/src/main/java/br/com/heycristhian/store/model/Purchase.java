package br.com.heycristhian.store.model;

public class Purchase {

	private String orderId;
	private Integer preparationTime;
	private String supplierAddress;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String destinationAddress) {
		this.supplierAddress = destinationAddress;
	}

}
