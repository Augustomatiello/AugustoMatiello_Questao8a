package questao;
import java.util.ArrayList;

public class Bibliotec�ria {

	private Biblioteca biblioteca;
	public ArrayList< Usu�rio> lista_usuarios = new ArrayList<Usu�rio> ();
	
	public Bibliotec�ria(Biblioteca biblioteca){
		biblioteca.copyBiblioteca(biblioteca.nome, biblioteca.listaLivros);
	}
	
	public int estaNaBiblioteca(Livro livro){
		int aux = biblioteca.estaNaBiblioteca(livro.askTitulo());
		if(aux != -1)
			return aux;
		return -1;
	}
	
	
	public void insereLivro(Livro livro){
		if(estaNaBiblioteca(livro) != -1){
			System.out.println("Livro j� cadastrado");
		}
		else{ 
			biblioteca.insereLivro(livro);
			System.out.println("Livro inserido");
		}
	}
	
	public void removeLivro(Livro livro){
		if(estaNaBiblioteca(livro) != -1){
			biblioteca.removeLivro(livro);
			System.out.println("Livro removido");
		}
		else{ 
			System.out.println("Livro n�o encontrado");
		}
	}
	
	public int estaNaListaUsuarios(Usu�rio user){
		for(int i = 0; i < lista_usuarios.size(); i++)
			if(user.askName().equals(lista_usuarios.get(i).askName()))
				return i;
		return -1;
	}
	
	public void addUsuario(Usu�rio user){
		if(estaNaListaUsuarios(user)!= -1){
			System.out.println("Usu�rio j� cadastrado");
		}
		else{
			lista_usuarios.add(user.copyUsuario(user));
			System.out.println("Usuario " + user.askName() + " cadastrado com sucesso");
		}
	}
	
	public void removeUsuario(Usu�rio user){
		int aux = estaNaListaUsuarios(user);
		if(aux != -1){
			lista_usuarios.remove(aux);
			System.out.println("Usu�rio "+user.askName()+" removido");
		}
		else{
			System.out.println("Usu�rio "+user.askName() + " n�o encontrado no sistema");
		}
	}
	
	public void blockUsuario(Usu�rio user, int dias){
		int aux = estaNaListaUsuarios(user);
		if(aux !=1){
			Usu�rio aux2 = new Usu�rio(user.askName(), dias, user.askLivro());
			lista_usuarios.set(aux, aux2);
			System.out.println("Usu�rio " +user.askName()+ " bloqueado por " + dias+ " dias");
		}
		else System.out.println("Usu�rio" + user.askName()+ "n�o encontrado");
	}
		
}
