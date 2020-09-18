package br.com.heycristhian.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.heycristhian.store.client.ProviderClient;
import br.com.heycristhian.store.controller.dto.InfoProviderDTO;
import br.com.heycristhian.store.controller.dto.PurchaseDTO;

@Service
public class PurchaseService {
	
	@Autowired
	private ProviderClient providerClient;
	 
	public void make(PurchaseDTO purchaseDTO) {
	        	
		InfoProviderDTO info = providerClient.getInfoProviderByZipCode(purchaseDTO.returnZipCode());

	    System.out.println(info.getAddress());
    }
}
