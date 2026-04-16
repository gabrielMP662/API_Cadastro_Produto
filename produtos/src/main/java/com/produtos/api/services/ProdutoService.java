package com.produtos.api.services;



import java.util.Optional;

import org.springframework.stereotype.Service;

import com.produtos.api.entities.Produto;
import com.produtos.api.repositories.ProdutoRepository;
@Service
public class ProdutoService {
	private final ProdutoRepository repository;
	
	public ProdutoService(ProdutoRepository repository) {
		this.repository = repository;
		
	}
	
	public Produto cadastrar(Produto produto) {
		if(repository.findById(produto.getId()).isPresent()) {
			throw new IllegalArgumentException("Produto ja cadastrado!");
		}
		return repository.save(produto);
	}
	public Optional<Produto> buscarPorId(Integer id) {
	    return repository.findById(id);
	}
}

