package br.com.codigoalvo.udemy.designpatterns.structural.bridge;

public class ProfessorGraduacao extends Professor{
	
	public ProfessorGraduacao(Implementador imp){
		super(imp);
	}
	
	public void op() {
		System.out.println("Ola");
		imp.opImpl();
	}
}
