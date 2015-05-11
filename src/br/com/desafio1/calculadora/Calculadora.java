/**
 * Desenvolver uma calculadora com as quatro opera��es b�sicas:
 * A calculadora deve rodar no console/terminal
 * Exibir um menu b�sico para o usu�rio com as seguintes opera��es:
 *   - somar
 *   - subtrair
 *   - multiplicar
 *   - dividir
 *   - sair
 * O programa s� pode terminar quando o usu�rio selecionar a op��o sair
 * Depois de realizar uma das opera��es matem�tica o sistema de exibir novamente o menu
 * O programa pode ter apenas uma classe mas deve ter mais de 1 m�todo
 * Ter testes para cada opera��o
 * O projeto deve estar no GITHUB
 * 
 */
package br.com.desafio1.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public String operacao;
	public static int valor1;
	public static int valor2;
	public static int resultado;
		
//	public void somar(int valor1, int valor2){
//		this.resultado = valor1 + valor2;
//	}
	
	public static int somar(int valor1, int valor2){
		return resultado = valor1 + valor2;
	}
	
	public static int subtrair(int valor1, int valor2){
		return resultado = valor1 - valor2;
	}
	
	public static int dividir(int valor1, int valor2){
		return resultado = valor1 / valor2;
	}
	
	public static int multiplicar(int valor1, int valor2){
		return resultado = valor1 * valor2;
	}
	
	public void sair(){
		System.out.println("Saindo...");
	}
	
	public static void main(String[] args){
		
		System.out.println("Bem vindo � Calculadora no console!\n");
		
		System.out.println("Escreva logo abaixo, qual opera��o deseja realizar \n \nConsidere: 1- Somar, 2- Subtrair, 3- Dividir, 4- Multiplicar e 0- Sair \n");
		
		Scanner entrada = new Scanner(System.in);
		
		String operacao = entrada.nextLine();
		
		switch(operacao){
		
			case "1":
				Calculadora soma = new Calculadora();
				soma.somar(valor1, valor2);
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextInt();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextInt();
				System.out.println("Resultado da opera��o = "+ Calculadora.somar(valor1,valor2));
				break;
			
			case "2":
				Calculadora subtrai = new Calculadora();
				subtrai.subtrair(valor1, valor2);
				break;
				
			case "3":
				Calculadora dividi = new Calculadora();
				dividi.dividir(valor1, valor2);
				break;
				
			case "4":
				Calculadora multiplica = new Calculadora();
				multiplica.multiplicar(valor1, valor2);
				break;
			
			case "0":
				Calculadora sai = new Calculadora();
				sai.sair();
				break;
			
			default:
				System.out.println("Op��o de opera��o inv�lida, tente novamente.");
				break;
				
		}
		
		System.out.println("qual operacao agora?");
		
//		if("1".equals(operacao)){
//			Calculadora s = new Calculadora();
//			s.somar(valor1, valor2);
//		}
		
//		System.out.println("Digite o valor 1:");
//		valor1 = entrada.nextInt();
//		
//		System.out.println("Digite o valor 2:");
//		valor2 = entrada.nextInt();
//		
//		
//		System.out.println("Resultado da opera��o = "+ Calculadora.somar(valor1,valor2));
	
	}
	
}