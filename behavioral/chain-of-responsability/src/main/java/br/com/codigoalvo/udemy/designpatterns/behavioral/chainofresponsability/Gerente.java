package br.com.codigoalvo.udemy.designpatterns.behavioral.chainofresponsability;


//ConcreteHandler
public class Gerente extends TomadorDeDecisao {
	
	public void aprova(Compra compra) {
		if (compra.getValor() < 1000F) {
			System.out.println("Compra aprovada pelo Gerente.");
		}

		else if (sucessor != null) {
			sucessor.aprova(compra);
		}
	}
}
