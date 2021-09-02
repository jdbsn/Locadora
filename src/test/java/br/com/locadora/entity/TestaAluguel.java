package br.com.locadora.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestaAluguel {

	private Carro carro;
	private Carro carro2;
	private Carro carro3;
	private Cliente cliente;
	private Cliente cliente2;
	private Cliente cliente3;
	private Aluguel aluguel;
	private Aluguel aluguel2;
	private Aluguel aluguel3;
	
	@BeforeEach
	public void inicializarCenario () {
		carro = new Carro("PDM-0001", "Fiat", "Mobi", 2020, new Categoria ("Subcompacto", 100));
		carro2 = new Carro("PDH-0001", "Hyundai", "HB20", 2019, new Categoria ("Compacto", 150));
		carro3 = new Carro("PDV-0001", "VW", "Virtus", 2020, new Categoria ("Sedan", 200));
		
		
		
		cliente = new Cliente (42259, 1410, "Gustavo", 21);
		cliente2 = new Cliente (13834, 8989, "Ana", 30);
		cliente3 = new Cliente (943241, 2468, "Pedro", 45);
	}
	
	@Test
	public void alugar() {
		
		aluguel = new Aluguel (carro, cliente, 4);
		aluguel.alugar();

		assertEquals(carro, cliente.getCarro());
			
	}
	
	@Test
	public void acabarAluguel() {
		
		aluguel2 = new Aluguel (carro2, cliente2, 4);
		aluguel2.alugar();
		aluguel2.acabarAluguel();
		
		assertEquals(null, cliente2.getCarro());
			
	}
	
	@Test
	public void calcularValorTotalDoAluguel() {
		
		aluguel3 = new Aluguel (carro3, cliente3, 10);
		assertEquals(2000.00, aluguel3.calcularValorTotal());
		
	}
	
}
