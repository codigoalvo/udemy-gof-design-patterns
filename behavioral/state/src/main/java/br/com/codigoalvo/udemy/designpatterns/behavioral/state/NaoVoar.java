package br.com.codigoalvo.udemy.designpatterns.behavioral.state;


public class NaoVoar extends Comportamento{
	public void exec() {
		System.out.println("Esta ave nao voa :(");
	}
}
