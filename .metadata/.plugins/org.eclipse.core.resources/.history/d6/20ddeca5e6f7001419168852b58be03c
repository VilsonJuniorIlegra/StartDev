package br.com.desafio1.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadora {
	
	public int valorTeste1 = 4;
	public int valorTeste2 = 4;
	public int resultadoEsperado;
	
	@Test
	public void testeSomar(){
		int resultadoSomaTeste = 8;
		
		this.resultadoEsperado = Calculadora.somar(valorTeste1, valorTeste2);
		
		assertEquals(resultadoSomaTeste, resultadoEsperado, 0);
	}
	
	@Test
	public void testeSubtrair(){
		int resultadoSubtraiTeste = 0;
		
		this.resultadoEsperado = Calculadora.subtrair(valorTeste1, valorTeste2);
		assertEquals(resultadoSubtraiTeste, resultadoEsperado, 0);
		
	}
	
	@Test
	public void testeDividir(){
		int resultadoDividiTeste = 1;
		
		this.resultadoEsperado = Calculadora.dividir(valorTeste1, valorTeste2);
		assertEquals(resultadoDividiTeste, resultadoEsperado, 0);
		
	}
	
	@Test
	public void testeMultiplicar(){
		int resultadoMultiplicaTeste = 16;
		
		this.resultadoEsperado = Calculadora.multiplicar(valorTeste1, valorTeste2);
		assertEquals(resultadoMultiplicaTeste, resultadoEsperado, 0);
		
	}
}