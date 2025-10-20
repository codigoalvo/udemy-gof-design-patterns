package br.com.codigoalvo.udemy.designpatterns.creational.factorymethod;

import java.util.Calendar;

//Fabrica
public abstract class Empresa {
	
	public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);
	
}
