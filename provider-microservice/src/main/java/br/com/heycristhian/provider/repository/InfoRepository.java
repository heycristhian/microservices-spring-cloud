package br.com.heycristhian.provider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.heycristhian.provider.model.InfoProvider;

@Repository
public interface InfoRepository extends MongoRepository<InfoProvider, String>{

	InfoProvider findByState(String state);
}
