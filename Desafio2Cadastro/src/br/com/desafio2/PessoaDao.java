package br.com.desafio2;

public interface PessoaDao {
	public Pessoa getByName(String nome);

	public void save(Pessoa pessoa);

	public void update(Pessoa pessoa);

	public void deleteByName(String nome);
	
	public Pessoa[] getAll();


}
