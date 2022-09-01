package br.ufrn.imd.dominio;

/**
 * Classe pessoa para cálculo do IMC.
 * @author itami
 *
 */
public class Pessoa {
	//variáveis
	private String nome;
	private double peso;
	private double altura;
	//construtores de pessoa
	public Pessoa() { }
	
	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	//gets e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

	//ToString para apresentação do nome da pessoa
	@Override
	public String toString() {
		return nome + " Peso: " + peso + " Altura: " + altura;
	}
}
