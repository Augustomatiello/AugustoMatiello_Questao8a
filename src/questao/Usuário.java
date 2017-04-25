package questao;

public class Usu�rio {

	private String nome;
	private int tempoBloqueado;
	private Livro emprestado;
	
	public Usu�rio(String nome, int dias, Livro livro){
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
	
	public Usu�rio copyUsuario(Usu�rio aux){
		Usu�rio copia = new Usu�rio (aux.nome, aux.tempoBloqueado, aux.emprestado);
		return copia;
	}
}
