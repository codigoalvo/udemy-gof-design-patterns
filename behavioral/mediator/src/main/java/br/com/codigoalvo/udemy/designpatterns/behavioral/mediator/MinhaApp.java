package br.com.codigoalvo.udemy.designpatterns.behavioral.mediator;


public class MinhaApp {

	public static void main(String[] args) {
		//Cria-se o objeto mediador
		ChatMediator salaChat = new ChatMediator();
		
		//Criam-se os objetos participantes
		Participante joao = new ParticipanteImpl("Joao", salaChat);
		Participante maria = new ParticipanteImpl("Maria", salaChat);
		Participante carlos = new ParticipanteImpl("Carlos", salaChat);
		Participante renato = new ParticipanteImpl("Renato", salaChat);
		
		//Registra todos os participantes na sala de chat
		salaChat.registraParticipante(joao);
		salaChat.registraParticipante(maria);
		salaChat.registraParticipante(carlos);
		salaChat.registraParticipante(renato);
		
		//Inicia a conversa entre os participantes
		joao.enviaMensagem("Maria", "Ola Maria, tudo bem ?");
		
		maria.enviaMensagem("Joao", "Oi tudo! E com voce ?");
		
		carlos.enviaMensagem("Renato", "Renato, voce eh um @!xxx.");
		
		joao.enviaMensagem("Maria", "Voce esta no trabalho agora ?");
	}

}
