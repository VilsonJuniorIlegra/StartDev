package br.com.desafio1.calculadora;

public class Operacao {

	public float somar(float valor1, float valor2) {

		return valor1 + valor2;
	}

	public float subtrair(float valor1, float valor2) {
		return valor1 - valor2;
	}

	public float dividir(float valor1, float valor2) {
		Float.isNaN(valor2);
		if(valor2 == 0){
			return 0;
		}
		return valor1 / valor2;
	}

	public float multiplicar(float valor1, float valor2) {
		return valor1 * valor2;
	}
	
}
