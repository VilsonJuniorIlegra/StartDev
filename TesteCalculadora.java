package br.com.desafio1.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadora {

	@Test
	public void testeSomar(){
		int valorTeste1 = 4;
		int valorTeste2 = 4;
		int resultadoSomaTeste = 8;
		
		
		int resultadoEsperado = Calculadora.somar(valorTeste1, valorTeste2);
		
		assertEquals(resultadoSomaTeste, resultadoEsperado, 0);
	}

}
