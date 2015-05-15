package br.com.desafio1.calculadora;

public class Operacao {

	public float somar(float valor1, float valor2) {

		return valor1 + valor2;
	}

	public float subtrair(float valor1, float valor2) {
		return valor1 - valor2;
	}

	public float dividir(float valor1, float valor2) {
		float resultado = valor1 / valor2;
		return (Float.isInfinite(resultado)? 0 : resultado);
				
	}

	public float multiplicar(float valor1, float valor2) {
		return valor1 * valor2;
	}
	
}
