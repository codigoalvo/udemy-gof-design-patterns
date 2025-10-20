package br.com.codigoalvo.udemy.designpatterns.structural.flyweight;

public class MinhaApp {

	public static void main(String[] args) {
		
		Figura f = FiguraFactory.getFigura("linha");
		f.desenha("amarela");
		
		f = FiguraFactory.getFigura("oval nao preenchida");
		f.desenha("vermelha");
		

	}

}
