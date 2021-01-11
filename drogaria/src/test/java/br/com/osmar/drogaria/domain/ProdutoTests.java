package br.com.osmar.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {
	@Test
	public void criar() {
		Produto p = new Produto(
				Integer.valueOf("1"),
				"Coca-Cola",
				Byte.valueOf("15"),
				BigDecimal.valueOf(15.10),
				LocalDate.of(2021, 11, 23),
				null
				);	
	System.out.println("-------------------------------------------------");
	System.out.println(p);	
	System.out.println("-----------------------------------------------------");
	}
}
