package questao;

public class Livro {

	private String titulo;
	private String autor;
	private int num_catalogo;
	private boolean emprestado;
	
	public Livro (String titulo, String autor, int num){
		this.titulo = titulo;
		this.autor = autor;
		this.num_catalogo = num;
		emprestado = false;
	}
	
	public String askTitulo(){
		return this.titulo;
	}
	
	public String askAutor(){
		return this.autor;
	}
	
	public int askNumCatalogo(){
		return this.num_catalogo;
	}
	
	public void emprestouLivro(){
		this.emprestado = true;
	}
	
	public void devolveuLivro(){
		this.emprestado = false;
	}
	
	public Livro copyLivro(Livro livro){
		Livro copia = new Livro(livro.askTitulo(), livro.askAutor(), livro.askNumCatalogo());
		return copia;
	}
}
