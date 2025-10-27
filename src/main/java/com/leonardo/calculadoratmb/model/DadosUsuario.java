package com.leonardo.calculadoratmb.model;

public class DadosUsuario {
	
	private Integer idade;
	private double peso;
	private double altura;
	private Integer atividade;
	private double calorias;
	private String genero;
	
	public DadosUsuario(Integer idade, double peso, double altura, Integer atividade, double calorias, String genero) {
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.atividade = atividade;
		this.calorias = calorias;
		this.genero = genero;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Integer getAtividade() {
		return atividade;
	}

	public void setAtividade(Integer atividade) {
		this.atividade = atividade;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
		
	

}
