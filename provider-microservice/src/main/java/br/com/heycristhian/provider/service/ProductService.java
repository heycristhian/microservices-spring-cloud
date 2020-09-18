package br.com.heycristhian.provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.heycristhian.provider.model.Product;
import br.com.heycristhian.provider.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProdutosPorEstado(String estado) {
		return productRepository.findByState(estado);
	}

	
}
