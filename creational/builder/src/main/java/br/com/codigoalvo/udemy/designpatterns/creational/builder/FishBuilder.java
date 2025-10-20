package br.com.codigoalvo.udemy.designpatterns.creational.builder;

public class FishBuilder extends SanduicheBuilder{

	private Sanduiche s = new Fishburguer(); 
	
	public void abrePao() {
		System.out.println("Abre pao de fishburguer.");
	}

	public void insereIngredientes() {
		System.out.println("Insere file de peixe.");
	}

	public void fechaPao() {
		System.out.println("Fecha pao de fishburguer.");
	}

	public Sanduiche getSanduiche() {
		System.out.println("Fishburguer esta pronto !");
		return s;
	}
}
