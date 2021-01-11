package br.com.osmar.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.osmar.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
