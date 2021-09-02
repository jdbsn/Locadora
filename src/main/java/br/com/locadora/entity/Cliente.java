package br.com.locadora.entity;

public class Cliente {

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", cnh=" + cnh + ", nome=" + nome + ", idade=" + idade + ", carro=" + carro
				+ "]";
	}

	private int cpf;
	private int cnh;
	private String nome;
	private int idade;
	private Carro carro;

	public Cliente (int cpf, int cnh, String nome, int idade) {
		this.setCpf(cpf);
		this.setCnh(cnh);
		this.setNome(nome);
		this.setIdade(idade);
		
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
}
