package br.com.crud.factory;

import br.com.crud.dao.ContatoDAO;
import br.com.crud.model.Contato;
import java.util.Date;

public class Teste {
	public static void main(String[] args) {
		
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		
		contato.setidade(15);
		contato.setnome("Neymar");
		contato.setdataCadastro(new Date());
		
		contatoDAO.save(contato);
		
		Contato contato1 = new Contato();
		contato1.setId(1);
		contato1.setidade(23);
		contato1.setnome("Jão");
		contato1.setdataCadastro(new Date());

		contatoDAO.uptade(contato1);

		contatoDAO.removeById(1);
		for (Contato c : contatoDAO.getContatos()) {
			System.out.println("NOME:" + c.getnome());
		}

	}
}
