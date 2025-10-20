package br.com.codigoalvo.udemy.designpatterns.structural.adapter;

public class PlugBrasileiro extends Plug {

	public String obtemEletricidade() {
		return "Plug brasileiro conectado a ";
	}
}
