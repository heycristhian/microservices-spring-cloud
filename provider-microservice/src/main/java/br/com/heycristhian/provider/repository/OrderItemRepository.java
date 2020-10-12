package br.com.heycristhian.provider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.heycristhian.provider.model.OrderItem;

@Repository
public interface OrderItemRepository extends MongoRepository<OrderItem, String>{

}
