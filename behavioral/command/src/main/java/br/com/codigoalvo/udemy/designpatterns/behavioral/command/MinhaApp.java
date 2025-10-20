package br.com.codigoalvo.udemy.designpatterns.behavioral.command;


public class MinhaApp {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		Invoker invoker = new Invoker();
		
		invoker.compute(new Soma(calculadora, 10));
		invoker.compute(new Soma(calculadora, 5));
		invoker.compute(new Soma(calculadora, 7));
		invoker.compute(new Soma(calculadora, 9));
		invoker.compute(new Soma(calculadora, 3));
		//Desfazer as duas ultimas operacoes
		invoker.undo(2);
	}

}
