package br.com.locadora.entity;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestaCarro {

	private Carro carro;

	@Test 
	public void carroDeveTerCategoria() {
		carro = new Carro ("PDM-0001", "Fiat", "Mobi", 2020, new Categoria("Compacto", 150));
		assertNotNull(carro.getCategoria());
		assertEquals("Compacto", carro.getCategoria().getNome());
		
	}

}
