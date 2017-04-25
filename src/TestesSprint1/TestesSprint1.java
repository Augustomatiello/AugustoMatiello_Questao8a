package TestesSprint1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import questao.Biblioteca;
import questao.Bibliotecária;
import questao.Livro;
import questao.Usuário;


public class TestesSprint1 {

	Livro livro1, livro2, livro3, livro4, livro5,livro6;
	Usuário user1,user2,user3,user4,user5;
	Biblioteca a;
	Bibliotecária biu;
	
	@Before
	public void before(){
		 livro1 = new Livro("a", "b", 1);
		 livro2 = new Livro("b", "b", 2);
		 livro3 = new Livro("c", "b", 3);
		 livro4 = new Livro("d", "b", 4);
		 livro5 = new Livro("e", "b", 5);
		 livro6 = new Livro("f", "b", 6);
		
		 user1 = new Usuário("A", 0, null);
		 user2 = new Usuário("B", 0, null);
		 user3 = new Usuário("C", 0, null);
		 user4 = new Usuário("D", 0, null);
		 user5 = new Usuário("E", 0, null);
		
		
		 a = new Biblioteca("A");
		
		 biu = new Bibliotecária(a);
		
	}
	
	@Test
	public void testAddNewUser() {
		biu.addUsuario(user1);
		assertEquals(biu.lista_usuarios.get(0).askName(),user1.askName());
	}
	
	@Test
	public void testAdd2NewUser() {
		biu.addUsuario(user1);
		assertEquals(biu.lista_usuarios.get(0).askName(),user1.askName());
		biu.addUsuario(user2);
		assertEquals(biu.lista_usuarios.get(1).askName(),user2.askName());
	}
	@Test
	public void testAdd2EqualUser() {
		biu.addUsuario(user1);
		assertEquals(biu.lista_usuarios.get(0).askName(),user1.askName());
		biu.addUsuario(user1);
		assertEquals(biu.estaNaListaUsuarios(user1),0);
	}
	
	@Test
	public void testRemoveUser() {
		biu.addUsuario(user1);
		biu.addUsuario(user2);
		biu.addUsuario(user3);
		biu.removeUsuario(user1);
		assertEquals(biu.lista_usuarios.size(),2);
		assertEquals(biu.lista_usuarios.get(0).askName(),user2.askName());
		assertEquals(biu.lista_usuarios.get(1).askName(),user3.askName());
	}
	
	@Test
	public void testBlockUser() {
		biu.addUsuario(user1);
		biu.addUsuario(user2);
		biu.addUsuario(user3);
		biu.blockUsuario(user1, 3);
		assertEquals(biu.lista_usuarios.get(0).askTempoBloqueado(),3);
	}
	
}
