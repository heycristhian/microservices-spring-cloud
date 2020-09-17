package br.com.heycristhian.provider.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.heycristhian.provider.model.InfoProvider;
import br.com.heycristhian.provider.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public Optional<InfoProvider> getInfoByZipCode(int zipCode) {
		return infoRepository.findByZipCode(zipCode);
	}

}
