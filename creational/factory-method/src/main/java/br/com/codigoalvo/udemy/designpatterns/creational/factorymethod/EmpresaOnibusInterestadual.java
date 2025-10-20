package br.com.codigoalvo.udemy.designpatterns.creational.factorymethod;

import java.util.Calendar;

//Fabrica concreta
public class EmpresaOnibusInterestadual extends Empresa {

	public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
		
		return new PassagemOnibusInterestadual(origem, destino, dataHoraPartida);
	}

	

}
