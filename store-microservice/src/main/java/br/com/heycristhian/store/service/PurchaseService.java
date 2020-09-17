package br.com.heycristhian.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.heycristhian.store.controller.dto.InfoProviderDTO;
import br.com.heycristhian.store.controller.dto.PurchaseDTO;

@Service
public class PurchaseService {
	
	 @Autowired
	 private RestTemplate client;
	 
	 public void make(PurchaseDTO purchaseDTO) {
	        ResponseEntity<InfoProviderDTO> exchange =
	            client.exchange("http://provider/info/" +  String.valueOf(purchaseDTO.returnZipCode()),
	                HttpMethod.GET, null, InfoProviderDTO.class);

	        System.out.println(exchange.getBody().getAddress());
	    }
}
