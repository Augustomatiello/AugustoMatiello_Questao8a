package questao;

public class Usuário {

	private String nome;
	private int tempoBloqueado;
	private Livro emprestado;
	
	public Usuário(String nome, int dias, Livro livro){
		this.nome = nome;
		tempoBloqueado = dias;
		emprestado = null;
	}
	
	public String askName(){
		return this.nome;
	}
	
	public int askTempoBloqueado(){
		return tempoBloqueado;
	}
	
	public Livro askLivro(){
		return emprestado;
	}
	
	public void bloqueiaPorTempo(int dias){
		tempoBloqueado = dias;
	}
	
	public void emprestarLivro(Livro livro){
		emprestado.copyLivro(livro);
	}
	
	public void devolverLivro(){
		emprestado = null;
	}
	
	public Usuário copyUsuario(Usuário aux){
		Usuário copia = new Usuário (aux.nome, aux.tempoBloqueado, aux.emprestado);
		return copia;
	}
}
