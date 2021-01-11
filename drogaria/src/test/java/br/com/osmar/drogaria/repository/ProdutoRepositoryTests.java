package br.com.osmar.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.osmar.drogaria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;
	@Test
	public void inserir() { // null pq estamos gerando a chave automaticamente
		Produto p1 = new Produto(null, "Coca-Cola", Byte.valueOf("15"), BigDecimal.valueOf(10.50), LocalDate.of(2026, 11, 25),null);
		Produto p2 = new Produto(null, "Heineken", Byte.valueOf("23"), BigDecimal.valueOf(8.50), LocalDate.of(2023, 7, 15), null);
		Produto p3 = new Produto(null, "Sabonete Dove", Byte.valueOf("23"), BigDecimal.valueOf(2.50), LocalDate.of(2029, 3, 25), null);
		Produto p4 = new Produto(null, "Creme Dental", Byte.valueOf("23"), BigDecimal.valueOf(1.99), LocalDate.of(2021, 4, 12), null);
		
		//salvando as entidades
		produtoRepository.save(p1);
		produtoRepository.save(p2);
		produtoRepository.save(p3);
		produtoRepository.save(p4);

		
		
	}
}
