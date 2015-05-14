package br.com.desafio1.calculadora;

import java.util.Scanner;

public class Menu {
	
	private Scanner entrada;
		
	public Menu(){
		this.entrada = new Scanner(System.in);
	}
	
	Operacao calculadora = new Operacao();
	
	public void executar(){
		String operacao = "";
		System.out.println("Calculadora no console!");

		while (operacao != "0") {
			operacao = infoMenu();			
			if (operacao.equals("1")) {				
				menuSoma();								
			} else if (operacao.equals("2")) {
				menuSubtrair();
			} else if (operacao.equals("3")) {
				menuDividir();
			} else if (operacao.equals("4")) {
				menuMultiplicar();
			} else if (operacao.equals("0")) {
				System.out.println("Voc� encerrou a calculadora!");
				return;
			} else {
				System.out.println("Opera��o do tipo inv�lida");
			}
		}
	}

	private String infoMenu() {
		String operacao;
		System.out.println("\nDigite uma das op��es de opera��o que deseja realizar, considerando:");
		System.out.println("1- Somar \n2- Subtrair \n3- Dividir \n4- Multiplicar \n0- Sair");
		operacao = entrada.nextLine();
		return operacao;
	}
	
	private void menuSoma() {
		System.out.println("Digite o valor 1:");
		float valor1 = entrada.nextFloat();
		System.out.println("Digite o valor 2:");
		float valor2 = entrada.nextFloat();
		System.out.println("Resultado da Soma �: " + calculadora.somar(valor1, valor2));
	}	
	
	private void menuSubtrair() {
		System.out.println("Digite o valor 1:");
		float valor1 = entrada.nextFloat();
		System.out.println("Digite o valor 2:");
		float valor2 = entrada.nextFloat();
		System.out.println("Resultado da Subtra��o �: "	+ calculadora.subtrair(valor1, valor2));
	}	

	private void menuDividir() {
		System.out.println("Digite o valor 1:");
		float valor1 = entrada.nextFloat();
		System.out.println("Digite o valor 2:");
		float valor2 = entrada.nextFloat();
		System.out.println("Resultado da Divis�o �: " + calculadora.dividir(valor1, valor2));
	}	
	
	private void menuMultiplicar() {
		System.out.println("Digite o valor 1:");
		float valor1 = this.entrada.nextFloat();
		System.out.println("Digite o valor 2:");
		float valor2 = this.entrada.nextFloat();
		System.out.println("Resultado da Multiplica��o  �: " + calculadora.multiplicar(valor1, valor2));
	}

}
/*
 * criei o objeto calculadora da classe operacao para que seja utilizado dentro dos metodos
 * afinal o objeto calculadora � o mesmo para eles, mudando somente o m�todo para cada operacao
 * 
 */