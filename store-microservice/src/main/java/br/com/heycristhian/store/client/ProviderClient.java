package br.com.heycristhian.store.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.heycristhian.store.controller.dto.InfoProviderDTO;

@FeignClient("provider")
public interface ProviderClient {

	@RequestMapping("/info/{zipCode}")
	InfoProviderDTO getInfoProviderByZipCode(@PathVariable int zipCode);
}
