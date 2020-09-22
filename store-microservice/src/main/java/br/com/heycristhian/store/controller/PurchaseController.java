package br.com.heycristhian.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.heycristhian.store.controller.dto.PurchaseDTO;
import br.com.heycristhian.store.model.Purchase;
import br.com.heycristhian.store.service.PurchaseService;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;

	@RequestMapping(method = RequestMethod.POST)
	public Purchase makePurchase(@RequestBody PurchaseDTO purchase) {
		return purchaseService.makePurchase(purchase);
	}

}
