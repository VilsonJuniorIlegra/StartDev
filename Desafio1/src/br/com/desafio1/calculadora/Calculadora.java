package br.com.desafio1.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static String operacao;
	public static float valor1;
	public static float valor2;
	public static float resultado;

	public static float somar(float valor1, float valor2){
		return resultado = valor1 + valor2;
	}

	public static float subtrair(float valor1, float valor2){
		return resultado = valor1 - valor2;
	}

	public static float dividir(float valor1, float valor2){
		return resultado = valor1 / valor2;
	}

	public static float multiplicar(float valor1, float valor2){
		return resultado = valor1 * valor2;
	}

	public void sair(){
		System.out.println("Saindo...");
	}

	public static void main(String[] args){

		System.out.println("Bem vindo � Calculadora no console!\n");
		System.out.println("Digite uma das op��es logo abaixo, para opera��o que deseja realizar, considerando:\n");
		System.out.println("1- Soma, 2- Subtrai, 3- Dividi, 4- Multiplica e 0- Sair \n");

		while(operacao != "0"){

			Scanner entrada = new Scanner(System.in);
			operacao = entrada.nextLine();

			if(operacao.equals("1")){
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextFloat();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextFloat();
				System.out.println("Resultado da Soma �: " + Calculadora.somar(valor1, valor2)+"\n");
				System.out.println("Digite a pr�xima opera��o: ");
			}
			else if(operacao.equals("2")){
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextFloat();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextFloat();
				System.out.println("Resultado da Subtra��o �: " + Calculadora.subtrair(valor1, valor2));
			} 
			else if(operacao.equals("3")){
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextFloat();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextFloat();
				System.out.println("Resultado da Divis�o �: " + Calculadora.dividir(valor1, valor2));
			}
			else if(operacao.equals("4")){
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextFloat();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextFloat();
				System.out.println("Resultado da Multiplica��o  �: " + Calculadora.multiplicar(valor1, valor2));
			}
			else if(operacao.equals("0")){
			;
			}
			else{
				System.out.println("Opera��o do tipo inv�lida");
			}

		}




	}

}



