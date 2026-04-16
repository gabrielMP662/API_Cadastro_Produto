package com.produtos.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.api.entities.Produto;
import com.produtos.api.services.ProdutoService;



@RestController
@RequestMapping("/produtos")

public class ProdutoControllers {
	private final ProdutoService service;
	
	public ProdutoControllers(ProdutoService service) {
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto){
		Produto novo = service.cadastrar(produto);
		return ResponseEntity.ok(novo);
		
	}
	
	@GetMapping("/{id}")
	
	public ResponseEntity<Produto> buscar(@PathVariable Integer id){
		return service.buscarPorId(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
				
}
