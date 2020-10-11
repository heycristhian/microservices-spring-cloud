package br.com.heycristhian.provider.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.heycristhian.provider.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

	List<Product> findByState(String state);
	
	List<Product> findByIdIn(List<String> ids);
}
