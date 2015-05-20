package br.com.desafio2;

import java.util.Scanner;

public class Start {
	
	
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[10];

		Scanner entrada = new Scanner(System.in);
		System.out.println("Gerenciador de Pessoas");
		System.out.println("Para cadastrar digite 1, para editar digite 2, para excluir digite 3 e para sair digite 0.");
		
		System.out.println("Informe o nome da pessoa: ");
		String nome = entrada.nextLine();
		System.out.println("Informe a idade da pessoa: ");
		int idade = Integer.parseInt(entrada.nextLine());
		
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setIdade(idade);
			
		for(int i = 0; i < 10; i++){
			if(pessoas[i] == null){
				pessoas[i] = p;
				System.out.println(p);
				break;
				
			}
		}
		
		
		
		
	}

}
