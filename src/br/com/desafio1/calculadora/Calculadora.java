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

public class Calculadora {
	
	/**
	 * O que comp�e/tem em uma calculadora?
	 * n�meros/valores, opera��es e um resultado
	 */
	public String operacao;
	public int valor1;
	public int valor2;
	public static int resultado;
	/**
	 * M�todo para soma
	 * dever� selecionar a op��o referente a opera��o de soma
	 * informar o valor 1, a seguir o valor 2 e por fim apresentar o resultado
	 * 
	 * 
	 * Solu��o: verifiquei e li sobre classes, atributos e m�todos
	 * achei dificuldade no poder verificar se o m�todo funciona
	 * 
	 */
	
//	public void somar(int valor1, int valor2){
//		this.resultado = valor1 + valor2;
//	}
	
	public static int somar(int valor1, int valor2){
		return resultado = valor1 + valor2;
	}
	
//	public void subtrair(int valor1, int valor2){
//		this.resultado = valor1 - valor2;
//	}
	
	public static int subtrair(int valor1, int valor2){
		return resultado = valor1 - valor2;
	}
	
//	public void dividir(int valor1, int valor2){
//		this.resultado = valor1 / valor2;
//	}
	
	public static int dividir(int valor1, int valor2){
		return resultado = valor1 / valor2;
	}
	
//	public void multiplicar(int valor1, int valor2){
//		this.resultado = valor1 * valor2;
//	}
	
	public static int multiplicar(int valor1, int valor2){
		return resultado = valor1 * valor2;
	}
	
//	public static String escolherOperacao(){
//		return String operacao;
//	}
	
	public static void main(String[] args){
		
		System.out.println("Bem vindo � Calculadora no console!");
		System.out.println("Informe logo abaixo qual opera��o deseja realizar \nConsidere: 1- Soma, 2- Subtrai, 3- Dividi e 4- Multiplica \n");
		System.out.println(Calculadora.somar(4,6));
	}
	
}