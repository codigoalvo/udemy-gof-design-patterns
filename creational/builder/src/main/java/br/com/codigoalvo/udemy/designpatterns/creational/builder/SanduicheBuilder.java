package br.com.codigoalvo.udemy.designpatterns.creational.builder;

//Builder
public abstract class SanduicheBuilder {
	public abstract void abrePao();
	public abstract void insereIngredientes();
	public abstract void fechaPao();
	public abstract Sanduiche getSanduiche(); 
}