package br.com.heycristhian.provider.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.heycristhian.provider.model.InfoProvider;
import br.com.heycristhian.provider.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;

	@GetMapping
	@RequestMapping("/{zipCode}")
	public ResponseEntity<InfoProvider> getInfoByZipCode(@PathVariable int zipCode) {
		Optional<InfoProvider> infoProvider = infoService.getInfoByZipCode(zipCode);
		
		if (!infoProvider.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(infoProvider.get());
		
	}
}
