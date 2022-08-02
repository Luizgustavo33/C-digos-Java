package pkgexercris;

import java.util.Scanner;

public class exercris {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double pessoas;
		String nome;

		System.out.println("Digite o número de pessoas que vc quer registrar :");

		pessoas = sc.nextDouble();
		
		for (int i = 0; i < pessoas; i++) {
			System.out.println("Digite o nome da pessoa:");
			nome = sc.next();

			System.out.println(nome);
			
		}
		System.out.println("código finalizado");
	}

}
