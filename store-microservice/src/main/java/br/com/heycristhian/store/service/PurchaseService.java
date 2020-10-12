package br.com.heycristhian.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.heycristhian.store.client.ProviderClient;
import br.com.heycristhian.store.controller.dto.InfoOrderDTO;
import br.com.heycristhian.store.controller.dto.InfoProviderDTO;
import br.com.heycristhian.store.controller.dto.PurchaseDTO;
import br.com.heycristhian.store.model.Purchase;

@Service
public class PurchaseService {
	
	@Autowired
	private ProviderClient providerClient;

	public Purchase makePurchase(PurchaseDTO purchaseDTO) {
		
		final String state = purchaseDTO.getAddressDTO().getState();
		
		InfoProviderDTO info = providerClient.getInfoByState(state);
		
		InfoOrderDTO infoOrderDTO = providerClient.makeOrder(purchaseDTO.getItems());
		
		Purchase savePurchase = new Purchase();
		savePurchase.setOrderId(infoOrderDTO.getId());
		savePurchase.setPreparationTime(infoOrderDTO.getPreparationTime());
		savePurchase.setSupplierAddress(info.getAddress());
		
		return savePurchase;
	}
}
