package br.com.heycristhian.provider.config;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.heycristhian.provider.model.InfoProvider;
import br.com.heycristhian.provider.model.Product;
import br.com.heycristhian.provider.repository.InfoRepository;
import br.com.heycristhian.provider.repository.ProductRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private InfoRepository infoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		if (productRepository.findAll().isEmpty()) {
			Product p1 = new Product();
			p1.setId("5f83e2fe1d5391433c37d0da");
			p1.setName("Livro Spring boot");
			p1.setDescription("Aprenda a programar do zero");
			p1.setState("SP");
			p1.setPrice(BigDecimal.valueOf(100));
			productRepository.save(p1);
			
			Product p2 = new Product();
			p2.setId("5f83e2fe1d5391433c37d0db");
			p2.setName("Vaso");
			p2.setDescription("Vaso de vidro");
			p2.setState("GO");
			p2.setPrice(BigDecimal.valueOf(100));
			productRepository.save(p2);
			
			InfoProvider info1 = new InfoProvider();
			info1.setName("Fornecedor 01");
			info1.setState("SP");
			info1.setAddress("Avenida dos Rosais");
			infoRepository.save(info1);
			
			InfoProvider info2 = new InfoProvider();
			info2.setName("Fornecedor 02");
			info2.setState("GO");
			info2.setAddress("Avenida das Orquídeas");
			infoRepository.save(info2);
		}
	}

}
