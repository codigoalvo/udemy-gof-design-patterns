package br.com.codigoalvo.udemy.designpatterns.behavioral.iterator;


public class MinhaApp {

	public static void main(String[] args) {
		//Criar objeto zoo
		Zoo zoo = new ZooImpl();
		
		//Adiciona animais ao zoologico
		zoo.addAnimal(new Animal("tigre", "mamifero"));
		zoo.addAnimal(new Animal("pinguim", "ave"));
		zoo.addAnimal(new Animal("jacare", "reptil"));
		zoo.addAnimal(new Animal("leao", "mamifero"));
		zoo.addAnimal(new Animal("elefante", "mamifero"));
		zoo.addAnimal(new Animal("pato", "ave"));
		
		AveIterator it = new AveIterator(zoo);
		
		while(it.hasNext()){
			System.out.println(it.next().getNome());
		}
	}

}
