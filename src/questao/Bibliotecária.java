package questao;
import java.util.ArrayList;

public class Bibliotecária {

	private Biblioteca biblioteca;
	public ArrayList< Usuário> lista_usuarios = new ArrayList<Usuário> ();
	
	public Bibliotecária(Biblioteca biblioteca){
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
			System.out.println("Livro já cadastrado");
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
			System.out.println("Livro não encontrado");
		}
	}
	
	public int estaNaListaUsuarios(Usuário user){
		for(int i = 0; i < lista_usuarios.size(); i++)
			if(user.askName().equals(lista_usuarios.get(i).askName()))
				return i;
		return -1;
	}
	
	public void addUsuario(Usuário user){
		if(estaNaListaUsuarios(user)!= -1){
			System.out.println("Usuário já cadastrado");
		}
		else{
			lista_usuarios.add(user.copyUsuario(user));
			System.out.println("Usuario " + user.askName() + " cadastrado com sucesso");
		}
	}
	
	public void removeUsuario(Usuário user){
		int aux = estaNaListaUsuarios(user);
		if(aux != -1){
			lista_usuarios.remove(aux);
			System.out.println("Usuário "+user.askName()+" removido");
		}
		else{
			System.out.println("Usuário "+user.askName() + " não encontrado no sistema");
		}
	}
	
	public void blockUsuario(Usuário user, int dias){
		int aux = estaNaListaUsuarios(user);
		if(aux !=1){
			Usuário aux2 = new Usuário(user.askName(), dias, user.askLivro());
			lista_usuarios.set(aux, aux2);
			System.out.println("Usuário " +user.askName()+ " bloqueado por " + dias+ " dias");
		}
		else System.out.println("Usuário" + user.askName()+ "não encontrado");
	}
		
}
