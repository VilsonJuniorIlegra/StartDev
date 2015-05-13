package foo;

public class MinhaClasse {

	// variavel de CLASSE
	private static int variavelClasse = 5;
	
	// variavel de INSTANCIA
	private int variavelInstancia = 10;

	public int getVariavelInstancia() {
		return variavelInstancia;
	}
	
	public static int getVariavelClasse() {
		return variavelClasse;
	}
	
	public void incVariavelInstancia() {
		this.variavelInstancia++;
	}
	
	public static void incrementoVariavelClasse() {
		MinhaClasse.variavelClasse++;
	}
}
