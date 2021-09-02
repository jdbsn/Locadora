package br.com.locadora.entity;

public class Carro {

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", categoria=" + categoria + ", marca=" + marca + ", modelo=" + modelo
				+ ", ano=" + ano + ", cliente=" + cliente + "]";
	}

	private String placa;
	private Categoria categoria;
	private String marca;
	private String modelo;
	private int ano;
	private Cliente cliente;
	
	public Carro(String placa, String marca, String modelo, int ano) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		
	}
	
	public Carro(String placa, String marca, String modelo, int ano, Categoria categoria) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.categoria = categoria;
		
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
