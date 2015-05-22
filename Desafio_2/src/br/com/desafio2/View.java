package br.com.desafio2;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class View {
	private Scanner entrada;
	private Pessoa[] pessoas;
	
	public View(){
		entrada = new Scanner(System.in);
		pessoas = new Pessoa[1];
	}
	
	public void executar(){
		String opcao = "";
		System.out.println("Gerenciador de Pessoas");

		while (opcao != "0") {
			System.out.println("Selecione a opção desejada:\n1. Cadastrar\n2. Editar\n3. Excluir\n4. Listar\n0. Sair");
			opcao = entrada.nextLine();

			if (opcao.equals("1")) {
				cadastrarPessoa();
			}
			else if (opcao.equals("2")){
				editarPessoa();
			}
			else if(opcao.equals("3")){
				removerPessoa();
			}
			else if(opcao.equals("4")){
				listarPessoa();
			}
			else if(opcao.equals("0")){
				sairDoPrograma();
				return;
			}
			else{
				System.out.println("Esta opção é inválida!");
			}
		}
	}

	private void cadastrarPessoa() {		
		String nome = informarNome();
		System.out.println("Informe a idade da pessoa:");
		int idade = Integer.parseInt(entrada.nextLine());
		
		boolean idadeValida = validarIdade(idade);
		boolean dentroDoLimite = ehPossivelAdicionarPessoa();
		
		if(idadeValida && dentroDoLimite){
			int index = pesquisaPosicaoNula();
			pessoas[index] = new Pessoa(nome, idade);
		}
		
	}
	
	private boolean ehPossivelAdicionarPessoa(){
		for(int i = 0; i < pessoas.length; i++){
			if (pessoas[i] == null) {
				return true;
			}
		}
		return false;
	}

	private boolean validarIdade(int idade) {
		boolean isValido = true;
		if(idade < 0){
			isValido = false;
			System.out.println("Número negativo é inválido.\n");
		}
		else if(idade > 120){
			isValido = false;
			System.out.println("A idade máxima é até 120.\n");
		}
		return isValido;
	}
	
	private int pesquisaPosicaoNula(){		
		for(int i = 0; i < pessoas.length; i++){
			if (pessoas[i] == null) {
				return i;
			}
		}
		return 99;
	}	

	private void editarPessoa() {
		String nomeAltera = informarNome();
		int i = pesquisaIndexPeloNome(nomeAltera);
		String novoNome = informarNome();
		pessoas[i].setNome(novoNome);
		System.out.println("E a idade:");
		int novaIdade = Integer.parseInt(entrada.nextLine());
		pessoas[i].setIdade(novaIdade);
	}

	private void removerPessoa() {
		String nomeRemove = informarNome();
		int i = pesquisaIndexPeloNome(nomeRemove);
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

	private String informarNome() {
		System.out.println("Informe o nome da pessoa:");
		String nome = entrada.nextLine();
		return nome;
	}
	
	private void listarPessoa() {
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i] != null){
				System.out.println(pessoas[i]);
			}
		}
	}

	private void sairDoPrograma() {
		System.out.println("Você saiu do cadastro de pessoas!");
		return;
	}
}
