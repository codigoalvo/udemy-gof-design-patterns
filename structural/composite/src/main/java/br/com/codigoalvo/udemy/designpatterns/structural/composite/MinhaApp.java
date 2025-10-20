package br.com.codigoalvo.udemy.designpatterns.structural.composite;

public class MinhaApp {

	public static void main(String[] args) {
		//Cria programadores (folhas)
		Programador pEstagiario = new Programador("Jose", 900);
		Programador pJunior = new Programador("Pedro", 2900);
		Programador pSenior = new Programador("Ricardo", 3900);
		
		//Gerentes
		Gerente g3 = new Gerente("Joao", 15000);
        Gerente g2 = new Gerente("Maria", 10000);
        Gerente g1 = new Gerente("Carlos", 5000);
        
        //Montar a estrutura em arvore
        
        //Carlos superviosiona os programadores Jose e Pedro
        g1.add(pEstagiario);
        g1.add(pJunior);
        
        //Maria superviosiona o programador Ricardo
        g2.add(pSenior);
        
        //Joao eh raiz da estrutura em arvore
        g3.add(g1);
        g3.add(g2);
        
        g3.print();
	}

}
