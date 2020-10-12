package br.com.heycristhian.provider.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.heycristhian.provider.controller.dto.OrderItemDTO;
import br.com.heycristhian.provider.model.OrderItem;
import br.com.heycristhian.provider.model.Ordinance;
import br.com.heycristhian.provider.model.Product;
import br.com.heycristhian.provider.repository.OrderItemRepository;
import br.com.heycristhian.provider.repository.PedidoRepository;
import br.com.heycristhian.provider.repository.ProductRepository;

@Service
public class OrdinanceService {
	
	@Autowired
	private PedidoRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;

	public Ordinance makeOrder(List<OrderItemDTO> items) {
		
		if(items == null) {
			return null;
		}
		
		List<OrderItem> orderItems = toOrderItem(items);
		Ordinance ordinance = new Ordinance(orderItems);
		ordinance.setPreparationTime(items.size());
		return orderRepository.save(ordinance);
	}
	
	public Ordinance getOrderById(String id) {
		return this.orderRepository.findById(id).orElse(new Ordinance());
	}

	private List<OrderItem> toOrderItem(List<OrderItemDTO> items) {
		
		List<String> ordersId = items
				.stream()
				.map(item -> item.getId())
				.collect(Collectors.toList());
		
		List<Product> orderProducts = productRepository.findByIdIn(ordersId);
		
		
		List<OrderItem> orderItems = new ArrayList<>();
		
		OrderItem orderItem;
		for (Product product : orderProducts) {
			Integer quantity = items.stream()
					.filter(item -> item.getId().equals(product.getId()))
					.findFirst()
					.map(OrderItemDTO::getQuantity).get();
			
			orderItem = new OrderItem();
			orderItem.setProduct(product);
			orderItem.setQuantity(quantity);
			orderItems.add(orderItemRepository.save(orderItem));
		}
		/*
		List<OrderItem> orderItems = items
			.stream()
			.map(item -> {
				Product product = orderProducts
						.stream()
						.filter(p -> p.getId() == item.getId())
						.findFirst().get();
				
				OrderItem orderItem = new OrderItem();
				orderItem.setProduct(product);
				orderItem.setQuantity(item.getQuantity());
				return orderItemRepository.save(orderItem);
			})
			.collect(Collectors.toList());*/
		return orderItems;
	}
}
