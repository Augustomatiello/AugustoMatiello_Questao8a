package questao;
import java.util.ArrayList;


public class Biblioteca {

	public String nome;
	public ArrayList< Livro> listaLivros = new ArrayList< Livro>();
	
	public Biblioteca (String nome){
		this.nome = nome;
	}
	
	public void insereLivro(Livro livro){
		listaLivros.add(livro);
	}
	
	public Livro buscaLivro(String titulo){
		int aux = estaNaBiblioteca(titulo);
		return listaLivros.get(aux);
	}
	
	public int estaNaBiblioteca(String titulo){
		for(int i = 0; i <listaLivros.size(); i++)
			if(titulo.equals(listaLivros.get(i).askTitulo()))
				return i;
		return -1;
	}
	
	public void removeLivro(Livro livro){
		listaLivros.remove(estaNaBiblioteca(livro.askTitulo()));
	}
	
	public Biblioteca copyBiblioteca(String nome, ArrayList <Livro> lista){
		Biblioteca copy = new Biblioteca(this.nome);
		copy.listaLivros = (ArrayList<Livro>)this.listaLivros.clone();
		return copy;
	}
	
}
