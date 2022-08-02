package pkgAgencia;

public class Cliente {
	private String nome;
	private int idade;
	private long CPF;
	
	public Cliente() {}
	
	public Cliente(String nome, int idade, long CPF) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		
	}
	
	public String getnome() {
		return this.nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}
	
	
	public int getidade() {
		return this.idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}
	
	public long getCPF() {
		return this.CPF;
	}

	public void setCPF(long CPF) {
		this.CPF = CPF;
	}
	

}
