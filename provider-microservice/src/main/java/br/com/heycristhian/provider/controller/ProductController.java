package br.com.heycristhian.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.heycristhian.provider.model.Product;
import br.com.heycristhian.provider.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/{state}")
	public List<Product> getProductsByState(@PathVariable("state") String state) {
		return productService.getProdutosPorEstado(state);
	}
}
