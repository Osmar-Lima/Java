package br.com.osmar.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.osmar.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
}
