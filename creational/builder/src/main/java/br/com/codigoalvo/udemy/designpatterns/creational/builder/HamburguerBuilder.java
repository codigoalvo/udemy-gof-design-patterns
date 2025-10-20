package br.com.codigoalvo.udemy.designpatterns.creational.builder;

public class HamburguerBuilder extends SanduicheBuilder{
	
	private Sanduiche s = new Hamburguer(); 
	
	public void abrePao() {
		System.out.println("Abre pao de hamburguer.");
	}

	public void insereIngredientes() {
		System.out.println("Insere carne e queijo.");
	}

	public void fechaPao() {
		System.out.println("Fecha pao de hamburguer.");
	}

	public Sanduiche getSanduiche() {
		System.out.println("Hamburguer esta pronto !");
		return s;
	}
}
