package com.produtos.api.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.api.entities.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Integer>{
	
}
