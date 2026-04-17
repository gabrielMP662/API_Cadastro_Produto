package com.produtos.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping 
	public List<Produto> listaProduto(){
		return service.findAll();
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
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id){
		service.deletar(id);
		return ResponseEntity.noContent().build();
	}
	@PutMapping("{id}")
	public ResponseEntity<Produto> atualizaProd(@PathVariable Integer id , @RequestBody Produto dadosNovos){
		Produto atualizado = service.atualizarProd(id, dadosNovos);
		return ResponseEntity.ok(atualizado);
	}
				
}
