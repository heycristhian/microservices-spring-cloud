package br.com.heycristhian.provider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.heycristhian.provider.model.Ordinance;

public interface PedidoRepository extends MongoRepository<Ordinance, String>{

}
