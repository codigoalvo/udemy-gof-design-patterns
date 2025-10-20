package br.com.codigoalvo.udemy.designpatterns.structural.adapter;

//Target
public abstract class Tomada<P> {

	public abstract String conecta(P plug);
	
	public abstract String getNomeRede();
}
