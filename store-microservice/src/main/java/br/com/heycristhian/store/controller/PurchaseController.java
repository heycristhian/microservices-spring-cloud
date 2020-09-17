package br.com.heycristhian.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.heycristhian.store.controller.dto.PurchaseDTO;
import br.com.heycristhian.store.service.PurchaseService;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
	
	@Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public void makePurchase(@RequestBody PurchaseDTO purchaseDTO) {
        purchaseService.make(purchaseDTO);    	
    }

}
