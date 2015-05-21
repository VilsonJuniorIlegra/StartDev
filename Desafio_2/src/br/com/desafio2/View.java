package br.com.desafio2;

import java.util.Scanner;

public class View {
	
	private Scanner entrada;
	private Pessoa[] pessoas;
	
	public View(){
		entrada = new Scanner(System.in);
		pessoas = new Pessoa[10];
	}
	
	public void executar(){
		String opcao = "";
		System.out.println("Gerenciador de Pessoas");

		while (opcao != "0") {
			System.out.println("Selecione a opção desejada:\n1. Cadastrar\n2. Editar\n3. Excluir\n4. Listar\n5. Sair");
			opcao = entrada.nextLine();

			if (opcao.equals("1")) {
				adicionar();
			}
			else if (opcao.equals("2")){
				editar();
			}
			else if(opcao.equals("3")){
				remover();
			}
			else if(opcao.equals("4")){
				listar();
			}
			else if(opcao.equals("0")){
				System.out.println("Você saiu do cadastro de pessoas!");
				return;
			}
			else{
				System.out.println("Esta opção é inválida!");
			}
		}
	}

	private void adicionar() {		
		System.out.println("Informe o nome da pessoa:");
		String nome = entrada.nextLine();
		System.out.println("Informe a idade da pessoa:");
		String nextLine = entrada.nextLine();
		if(isNumber){
		int idade = Integer.parseInt(nextLine);
		}
		int index = pesquisaPosicaoNula();
		pessoas[index] = new Pessoa(nome, idade);
	}
	
	private int pesquisaPosicaoNula(){
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] == null) {
				return i;
			}
		}
		return 99;
	}	

	private void editar() {
		System.out.println("Informe o nome da pessoa a ser alterada:");
		String nomeAlterado = entrada.nextLine();
		int i = pesquisaIndexPeloNome(nomeAlterado);
		System.out.println();
		/*
		for(int i = 0; i < pessoas.length; i++){
			if(nomeAlterado.equals(pessoas[i].getNome())){
				System.out.println("Informe o novo nome:");
				String novoNome = entrada.nextLine();
				pessoas[i].setNome(novoNome);
				System.out.println("E a nova idade:");
				int novaIdade = Integer.parseInt(entrada.nextLine());
				pessoas[i].setIdade(novaIdade);
				break;
			}
		}*/
	}

	private void remover() {
		System.out.println("Informe o nome a ser removido:");
		String nomeRemovido = entrada.nextLine();
		int i = pesquisaIndexPeloNome(nomeRemovido);
		pessoas[i] = null;
	}
	
	private int pesquisaIndexPeloNome(String nome){
		for(int i = 0; i < pessoas.length; i++){
			if(pessoas[i] != null && nome.equals(pessoas[i].getNome())){
				return i;
			}
		}
		return 99;
	}

	private void listar() {
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i] != null){
				System.out.println(pessoas[i]);
			}
		}
	}


}
