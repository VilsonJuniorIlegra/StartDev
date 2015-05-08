/**
 * Desenvolver uma calculadora com as quatro operações básicas:
 * A calculadora deve rodar no console/terminal
 * Exibir um menu básico para o usuário com as seguintes operações:
 *   - somar
 *   - subtrair
 *   - multiplicar
 *   - dividir
 *   - sair
 * O programa só pode terminar quando o usuário selecionar a opção sair
 * Depois de realizar uma das operações matemática o sistema de exibir novamente o menu
 * O programa pode ter apenas uma classe mas deve ter mais de 1 método
 * Ter testes para cada operação
 * O projeto deve estar no GITHUB
 * 
 */
package br.com.desafio1.calculadora;

public class Calculadora {
	
	/**
	 * O que compõe/tem em uma calculadora?
	 * números/valores, operações e um resultado
	 */
	public String operacao;
	public int valor1;
	public int valor2;
	public static int resultado;
	/**
	 * Método para soma
	 * deverá selecionar a opção referente a operação de soma
	 * informar o valor 1, a seguir o valor 2 e por fim apresentar o resultado
	 * 
	 * 
	 * Solução: verifiquei e li sobre classes, atributos e métodos
	 * achei dificuldade no poder verificar se o método funciona
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
		
		System.out.println("Bem vindo à Calculadora no console!");
		System.out.println("Informe logo abaixo qual operação deseja realizar \nConsidere: 1- Soma, 2- Subtrai, 3- Dividi e 4- Multiplica \n");
		System.out.println(Calculadora.somar(4,6));
	}
	
}