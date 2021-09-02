package br.com.locadora.entity;

public class Aluguel {

	@Override
	public String toString() {
		return "Aluguel [carro=" + carro + ", cliente=" + cliente + ", numDiarias=" + numDiarias + ", total=" + total
				+ "]";
	}

	private Carro carro;
	private Cliente cliente;
	private int numDiarias;
	double total;

	public Aluguel(Carro carro, Cliente cliente, int numDiarias) {
		this.carro = carro;
		
		if (cliente.getIdade() < 21) {
			System.out.println("Você nâo tem idade suficiente para alugar um carro");
		} else if (cliente.getCarro() != null) {
			System.out.println("Você já tem um carro alugado");
		} else {
			this.cliente = cliente;
		}
		
		if (numDiarias < 1) {
			System.out.println("O m�nimo de di�rias � 1 dia.");
		} else if (numDiarias >= 30) {
			System.out.println("O m�ximo de di�rias � de 30 dias.");
		} else {
			this.numDiarias = numDiarias;			
		}
	}
	
	double calcularValorTotal () {
		total = carro.getCategoria().getValorDiaria() * numDiarias;
		return total;
	}
	
	void alugar () {
			carro.setCliente(cliente);
			cliente.setCarro(carro);
			System.out.println("Você alugou um" + " " + carro.getMarca() + " " + carro.getModelo() + " por " + numDiarias + " dias.");
		}
	
	void acabarAluguel () {
		carro.setCliente(null);
		cliente.setCarro(null);
		System.out.println("O seu aluguel de um " + carro.getMarca() + " por " + numDiarias + " dias acabou.");
	}
	
}
