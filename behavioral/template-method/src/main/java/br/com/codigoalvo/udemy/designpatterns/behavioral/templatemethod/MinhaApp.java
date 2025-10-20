package br.com.codigoalvo.udemy.designpatterns.behavioral.templatemethod;


public class MinhaApp {

	public static void main(String[] args) {
		Game game1 = new Futebol();
		game1.play();
		Game game2 = new Basquete();
		game2.play();
	}

}
