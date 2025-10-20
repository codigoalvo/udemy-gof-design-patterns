package br.com.codigoalvo.udemy.designpatterns.creational.abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class MinhaApp {

	public static void main(String[] args) {
		//Empresas de Onibus
		EmpresaOnibus viacaoXYZ = new ConcreteEmpresaOnibus();
		
		//Emite passagens
		PassagemOnibusUrbano pUrbano = viacaoXYZ.emitePassagemOnibusUrbano("Sao Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));
		
		PassagemOnibusInterestadual pInterestadual = viacaoXYZ.emitePassagemOnibusInterestadual("Sao Paulo", "Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));
		
		//Exibe detalhes da passagem
		pUrbano.exibeDetalhes();
		
		pInterestadual.exibeDetalhes();
	}

}
