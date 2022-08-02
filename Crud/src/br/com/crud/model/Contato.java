package br.com.crud.model;

import java.util.Date;

public class Contato {
	
	public int id;
	private String nome;
	private int idade;
	private Date dataCadastro;
	
	public Contato() {}
	
	public Contato(int id, String nome, int idade, Date dataCadastro) {
		this.id= id;
		this.nome = nome;
		this.idade = idade;
		this.dataCadastro = dataCadastro;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getidade() {
		return idade;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
	public Date getdataCadastro() {
		return dataCadastro;
	}
	public void setdataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	}





