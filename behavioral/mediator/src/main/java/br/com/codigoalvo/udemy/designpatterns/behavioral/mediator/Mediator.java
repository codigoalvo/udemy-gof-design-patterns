package br.com.codigoalvo.udemy.designpatterns.behavioral.mediator;


public abstract class Mediator {
	
	public abstract void enviaMensagem(String remetente, String destinatario, String mensagem);
}
