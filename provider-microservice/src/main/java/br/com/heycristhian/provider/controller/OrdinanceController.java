package br.com.heycristhian.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.heycristhian.controller.dto.OrderItemDTO;
import br.com.heycristhian.provider.model.Ordinance;
import br.com.heycristhian.provider.service.OrdinanceService;

@RestController
@RequestMapping("/orders")
public class OrdinanceController {

	@Autowired
	private OrdinanceService ordinanceService;
	
	@PostMapping
	public Ordinance makeOrder(@RequestBody List<OrderItemDTO> orders) {
		return ordinanceService.makeOrder(orders);
	}
	
	@PostMapping("/{id}")
	public Ordinance getPedidoPorId(@PathVariable Long id) {
		return ordinanceService.getOrderById(id);
	}
}
