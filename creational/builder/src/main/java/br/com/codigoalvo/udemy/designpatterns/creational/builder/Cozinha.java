package br.com.codigoalvo.udemy.designpatterns.creational.builder;

public class Cozinha{
	
	public void fazSanduiche(SanduicheBuilder builder){
		builder.abrePao();
		builder.insereIngredientes();
		builder.fechaPao();
	}
}
