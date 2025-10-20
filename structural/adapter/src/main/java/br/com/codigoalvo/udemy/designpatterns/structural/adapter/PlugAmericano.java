package br.com.codigoalvo.udemy.designpatterns.structural.adapter;

public class PlugAmericano extends Plug {

	public String obtemEletricidade() {
		return "Plug americando conectado a ";
	}
}