package pkgAgencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int x = 0;

		String nome1;
		int idade1;
		long CPF1;
		String localPartida1;
		String Destino1;

		Scanner sc = new Scanner(System.in);
		int[] Clientes = new int[x];

		System.out.println("Bem vindo ao sistema de cadastro da Recode Viagens! ");
		System.out.println("__________________________________________________ \n");

		System.out.println("Digite a quantidade de pessoas que deseja cadastrar:");
		x = sc.nextInt();

		Clientes = new int[x];

		for (int i = 0; i < Clientes.length; i++) {
			Cliente cliente = new Cliente();
			Viagens viagens = new Viagens();

			System.out.println("Digite o nome da pessoa: ");
			nome1 = sc.next();
			System.out.println("Digite a idade da pessoa: ");
			idade1 = sc.nextInt();
			System.out.println("Digite o CPF da pessoa: ");
			CPF1 = sc.nextLong();
			System.out.println("Digite o local de partida da pessoa: ");
			localPartida1 = sc.next();
			System.out.println("Digite o destino da pessoa: ");
			Destino1 = sc.next();

			cliente.setnome(nome1);
			cliente.setidade(idade1);
			cliente.setCPF(CPF1);
			viagens.setlocalPartida(localPartida1);
			viagens.setdestino(Destino1);

			int z = 1;
			System.out.println(" Pessoa cadastrada n°" + z);
			System.out.println("");
			z++;

			System.out.println(" Nome: " + cliente.getnome() + "\n Idade: " + cliente.getidade() + "\n CPF: "
					+ cliente.getCPF() + "\n Local de embarque: " + viagens.getlocalPartida() + "\n Local de destino: "
					+ viagens.getdestino() + "\n");

		}

		sc.close();

	}

}
