package br.com.codigoalvo.udemy.designpatterns.structural.composite;

//Leaf
public class Programador extends Empregado {
  
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
 
    //Exibe detalhes do empregado
    public void print() {
        System.out.println("[E] " + super.nome + ", $" + super.salario);
    }
     
    //Adiciona empregado a estrutura.
    public void add(Empregado e) {
        System.out.println("Nao eh possivel adicionar empregado subordinado do programador");
    }
  
    //Remove empregado da estrutura.
    public void remove(Empregado e) {
        System.out.println("Nao eh possivel remover empregado subordinado do programador");
    }
}