package br.com.heycristhian.provider.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.heycristhian.provider.model.InfoProvider;

@Repository
public interface InfoRepository extends CrudRepository<InfoProvider, Long>{
	
	Optional<InfoProvider> findByZipCode(int zipCode);

}
