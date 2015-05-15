package br.com.desafio1.calculadora;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class OperacaoTest {

	@Test
	public void testeSomar(){
		Operacao calculadoraTest = new Operacao();				
		assertEquals(8, calculadoraTest.somar(4,4), 0);
	}
	
	@Test
	public void testeSubtrair(){
		Operacao calculadoraTest = new Operacao();				
		assertEquals(3, calculadoraTest.subtrair(5, 2), 0);
		
	}
	
	@Test
	public void testeDividir(){
		Operacao calculadoraTest = new Operacao();
		assertEquals(2,	calculadoraTest.dividir(4, 2), 0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testeDividirPorZero(){
		int v1 = 2/0;
		}	
	
	
	@Test
	public void testeMultiplicar(){
		Operacao calculadoraTest = new Operacao();
		assertEquals(10, calculadoraTest.multiplicar(5, 2), 0);
		
	}
	
	@Test
	public void testeCapturaDeDadosFuncionaSuccess(){
		Operacao calculadoraTest = new Operacao();
		
	}
	
	@Test
	public void testeCapturaDeDadosFuncionaFailed(){}
	
	

}
