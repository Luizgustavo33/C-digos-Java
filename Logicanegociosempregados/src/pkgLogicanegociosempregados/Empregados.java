package pkgLogicanegociosempregados;

public class Empregados {

	String nome;
	int idade;
	double salariodomes;

	public Empregados() {
	}

	public Empregados(String nome, int idade, double salariodomes) {

		this.nome = nome;
		this.idade = idade;
		this.salariodomes = salariodomes;
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

	public double getsalariodomes() {
		return this.salariodomes;
	}

	public void setsalariodomes(double salariodomes) {
		this.salariodomes = salariodomes;

	}
}
