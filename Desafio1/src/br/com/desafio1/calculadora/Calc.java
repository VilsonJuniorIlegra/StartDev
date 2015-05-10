package br.com.desafio1.calculadora;

import java.util.Scanner;

public class Calc {  

	public static void main (String args[]){  
		int v1;  
		int v2;  
		int resultado;
		int operacao = 1;

		while(operacao != 0){
			
			System.out.println("qual operacao?");
			Scanner entrada = new Scanner(System.in);
			operacao = entrada.nextInt();
			
			if(operacao == 1){
				System.out.println("valor 1 please?");
				v1 = entrada.nextInt();
				System.out.println("valor 2 please?");
				v2 = entrada.nextInt();
				System.out.println("Resultado: " + v1+v2);
			}
			else if(operacao == 2){
				System.out.println("valor 1 please?");
				v1 = entrada.nextInt();
				System.out.println("valor 2 please?");
				v2 = entrada.nextInt();
				System.out.println(v1 - v2 + "resultado");
					}
			else if(operacao == 0){
				System.out.println("saindo");
			}
			}
	}
}