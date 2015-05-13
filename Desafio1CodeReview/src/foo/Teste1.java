package foo;

public class Teste1 {

	public static void main (String[] args) {

		MinhaClasse instancia1 = new MinhaClasse();
		MinhaClasse instancia2 = new MinhaClasse();

		System.out.println(instancia1.getVariavelInstancia());
		System.out.println(instancia1.getVariavelClasse());;
		
		instancia1.incVariavelInstancia();
		instancia1.incrementoVariavelClasse();
		
		System.out.println(instancia1.getVariavelInstancia());
		System.out.println(instancia1.getVariavelClasse());
		
		System.out.println(instancia2.getVariavelInstancia());
		System.out.println(instancia2.getVariavelClasse());
	}
	
}
