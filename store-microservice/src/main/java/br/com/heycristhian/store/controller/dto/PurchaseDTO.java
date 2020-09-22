package br.com.heycristhian.store.controller.dto;

import java.util.List;

public class PurchaseDTO {

	private List<PurchaseItemsDTO> items;
	private AddressDTO addressDTO;

	public List<PurchaseItemsDTO> getItems() {
		return items;
	}

	public void setItems(List<PurchaseItemsDTO> items) {
		this.items = items;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

}
