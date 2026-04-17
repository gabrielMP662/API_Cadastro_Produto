package com.produtos.api.services;



import java.util.List;
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
		return repository.save(produto);
	}
	public Optional<Produto> buscarPorId(Integer id) {
	    return repository.findById(id);
	}
	public List<Produto> findAll(){
		return repository.findAll();
	}
	public void deletar(Integer id) {
		if(!repository.existsById(id)) {
			throw new RuntimeException("Produto nas encontrado!");
		}
		repository.deleteById(id);
	}
	public Produto atualizarProd(Integer id, Produto dadosNovos) {
		Produto existente = repository.findById(id)
		.orElseThrow(() -> new RuntimeException("Produto nao encontrado"));
		
		existente.setNome(dadosNovos.getNome());
		existente.setDescricao(dadosNovos.getDescricao());
		existente.setPreco(dadosNovos.getPreco());
		existente.setQtd(dadosNovos.getQtd());
		
		return repository.save(existente);
	}
	
}


