package PkgCarro;

public class Carro {
	int potencia;
	int velocidade = 0;
	String nome;
	void acelera(int i, int j) {
		velocidade = velocidade + potencia;
	}
	void frear() {
		velocidade = velocidade / 2;
	}

	int getVelocidade() {
		return velocidade;
	}
	void imprimir() {
	System.out.println("O carro " + nome + " esta a velocidade de " + getVelocidade() + "/h");
	}
}

