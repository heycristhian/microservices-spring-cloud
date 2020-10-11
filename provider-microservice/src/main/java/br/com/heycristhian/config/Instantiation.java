package br.com.heycristhian.config;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.heycristhian.provider.model.Product;
import br.com.heycristhian.provider.repository.ProductRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p = new Product();
		p.setName("teste instantiation");
		p.setDescription("description");
		p.setState("SP");
		p.setPrice(BigDecimal.valueOf(100));
		productRepository.save(p);
		
	}

}
