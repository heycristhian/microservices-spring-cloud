package br.com.heycristhian.store.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.heycristhian.store.controller.dto.InfoOrderDTO;
import br.com.heycristhian.store.controller.dto.InfoProviderDTO;
import br.com.heycristhian.store.controller.dto.PurchaseItemsDTO;

@FeignClient("provider")
public interface ProviderClient {

	@RequestMapping("/infos/{state}")
	InfoProviderDTO getInfoByState(@PathVariable String state);

	@PostMapping("/ordinances")
	InfoOrderDTO makeOrder(List<PurchaseItemsDTO> items);
}
