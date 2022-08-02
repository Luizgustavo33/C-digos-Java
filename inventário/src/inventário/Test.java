package inventário;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);

		int maxsize, menuChoice;

		maxsize = getNumProducts(in);

		if (maxsize == 0) {
			System.out.println("Não há produtos! ");
		} else {
			Produto[] produto = new Produto[maxsize];
			addToInventory(produto, in);

			do {
				menuChoice = getMenuOption(in);
				executeMenuChoice(menuChoice, produto, in);
			} while (menuChoice != 0);

		}
	}

	public void getNumProducts(Scanner sc, int maxsize ) {
		System.out.println("Digite o número de produtos que deseja armazenar: ");
		maxsize = sc.nextInt();

	}

	public static void addToInventory(int maxsize, Scanner sc) {
		String tempName;
		int tempNumber = 0;
		int tempQty = 0;
		float tempPrice = 0;

		int[] Produto = new int[maxsize];
		
		System.out.println("Digite o nome do produto: ");
		tempName = sc.next();
		System.out.println("Digite o número do Item: ");
		tempNumber = sc.nextInt();
		System.out.println("Digite o preço do Item: ");
		tempPrice = sc.nextFloat();
		System.out.println("Digite o quantidade de Itens: ");
		tempQty = sc.nextInt();

		for (int i = 0; i < Produto.length; i++) {
			Produto p = new Produto();
			p.setNomeProduto(tempName);
			p.setNumItem(tempNumber);
			p.setPreUnidade(tempPrice);
			p.setNumEstoque(tempQty);
			p.setValorInvent(tempPrice * tempQty);

			System.out.println(" Nome do Item: " + p.getNomeProduto() + "\n Número do Item: " + p.getNumItem()
					+ "\n Preço da Unidade: " + p.getPreUnidade() + " \n Número de estoques: " + p.getNumEstoque()
					+ "\n Valor do inventário: " + p.getValorInvent());
		}

	}
}*/


  Scanner sc = new Scanner(System.in);
  
  String tempName; int tempNumber = 0; int tempQty = 0; float tempPrice = 0;
 int maxsize = 0; int[] Produto = new int[maxsize];
  
 System.out.println("Digite o número de produtos que deseja armazenar: ");
  maxsize = sc.nextInt();
  
 
  
  if (maxsize == 0) System.out.println("Não há produtos! ");
  
  else Produto = new int[maxsize];
  
  for(int i = 0; i < Produto.length; i++){ Produto p = new Produto();
  
  System.out.println("Digite o nome do produto: "); tempName = sc.next();
  System.out.println("Digite o número do Item: "); tempNumber = sc.nextInt();
  System.out.println("Digite o preço do Item: "); tempPrice = sc.nextFloat();
  System.out.println("Digite o quantidade de Itens: "); tempQty = sc.nextInt();
  
  p.setNomeProduto(tempName); p.setNumItem(tempNumber);
  p.setPreUnidade(tempPrice); p.setNumEstoque(tempQty);
  p.setValorInvent(tempPrice * tempQty);
  
  System.out.println(" Nome do Item: " + p.getNomeProduto() +
 "\n Número do Item: " + p.getNumItem() + "\n Preço da Unidade: " +
  p.getPreUnidade() + " \n Número de estoques: " + p.getNumEstoque() +
  "\n Valor do inventário: " + p.getValorInvent());
 }}}

/*
 * } private static void getNumProducts(String[] args) {
 * 
 * 
 * int maxsize = 0; Scanner sc = new Scanner(System.in); maxsize = sc.nextInt();
 * int[] Produto = new int[maxsize];
 * 
 * for(int i = 0; i < Produto.length; i++){ Produto p = new Produto(); }
 */

/*
 * try { do {
 * System.out.println("Quantos produtos você deseja armazenar no inventário:");
 * maxsize = sc.nextInt(); if (maxsize == 0)
 * System.out.println("Não há produtos! "); else Product = new int[maxsize];
 * 
 * for
 * 
 * if (maxsize < 0) System.out.println("Valor negativo, digite novamente: ");
 * 
 * } while (maxsize <= 0);
 * 
 * }
 * 
 * catch (Exception e) { System.out.println("Tipo incorreto de dados!  ");
 * sc.nextLine(); }
 * 
 * 
 * 
 * 
 * 
 * /* System.out.println("INVENTÁRIO DE PRODUTOS ALEATÓRIOS \n");
 * 
 * Produto p1 = new Produto(); p1.setAtivo(false); p1.setNomeProduto("Dvd");
 * p1.setNumItem(1); p1.setPreUnidade(1.50); p1.setNumEstoque(10);
 * 
 * System.out.println("Valor do ativo: " + p1.getAtivo() + " \n Nome do Item: "
 * + p1.getNomeProduto() + "\n Número do Item: " + p1.getNumItem() +
 * "\n Preço da Unidade: " + p1.getPreUnidade() + " \n Número de estoques: " +
 * p1.getNumEstoque());
 * 
 * System.out.println();
 * 
 * // New Constructor 2 Produto p2 = new Produto(); p2.setNomeProduto("CD");
 * p2.setNumItem(2); p2.setPreUnidade(1.25); p2.setNumEstoque(25);
 * 
 * System.out.println(" Nome do Item: " + p2.getNomeProduto() +
 * "\n Número do Item: " + p2.getNumItem() + "\n Preço da Unidade: " +
 * p2.getPreUnidade() + " \n Número de estoques: " + p2.getNumEstoque());
 * 
 * System.out.println();
 * 
 * // New Constructor 3 Produto p3 = new Produto(); p3.setNomeProduto("Disket");
 * p3.setNumItem(3); p3.setPreUnidade(3); p3.setNumEstoque(12);
 * 
 * System.out.println(" Nome do Item: " + p3.getNomeProduto() +
 * "\n Número do Item: " + p3.getNumItem() + "\n Preço da Unidade: " +
 * p3.getPreUnidade() + " \n Número de estoques: " + p3.getNumEstoque());
 * 
 * System.out.println();
 * 
 * // New Constructor 4 Produto p4 = new Produto();
 * p4.setNomeProduto("Pendrive"); p4.setNumItem(4); p4.setPreUnidade(10);
 * p4.setNumEstoque(15);
 * 
 * System.out.println();
 * 
 * System.out.println(" Nome do Item: " + p4.getNomeProduto() +
 * "\n Número do Item: " + p4.getNumItem() + "\n Preço da Unidade: " +
 * p4.getPreUnidade() + " \n Número de estoques: " + p4.getNumEstoque());
 * 
 * System.out.println();
 * 
 * Produto p5 = new Produto("CaboUsb", 5, 10.5, 6, false);
 * 
 * System.out.println(" Nome do Item: " + p5.getNomeProduto() +
 * "\n Número do Item: " + p5.getNumItem() + "\n Preço da Unidade: " +
 * p5.getPreUnidade() + " \n Número de estoques: " + p5.getNumEstoque());
 * 
 * System.out.println();
 * 
 * Produto p6 = new Produto("Fone", 6, 20, 14, true);
 * System.out.println(" Nome do Item: " + p6.getNomeProduto() +
 * "\n Número do Item: " + p6.getNumItem() + "\n Preço da Unidade: " +
 * p6.getPreUnidade() + " \n Número de estoques: " + p6.getNumEstoque());
 * 
 * System.out.println();
 * 
 * 
 * 
 * Produto p7 = new Produto();
 * 
 * System.out.println("Digite o nome do produto: "); tempName = sc.next();
 * System.out.println("Digite o número do Item: "); tempNumber = sc.nextInt();
 * System.out.println("Digite o preço do Item: "); tempPrice = sc.nextFloat();
 * System.out.println("Digite o quantidade de Itens: "); tempQty = sc.nextInt();
 * 
 * p7.setNomeProduto(tempName);
 * p7.setNumItem(tempNumber);
 * p7.setPreUnidade(tempPrice); 
 * p7.setNumEstoque(tempQty);
 * p7.setValorInvent(tempPrice * tempQty);
 * 
 * System.out.println(" Nome do Item: " + p7.getNomeProduto() +
 * "\n Número do Item: " + p7.getNumItem() + "\n Preço da Unidade: " +
 * p7.getPreUnidade() + " \n Número de estoques: " + p7.getNumEstoque() +
 * " \n Valor do inventário: " + p7.getValorInvent());
 * 
 * System.out.println();
 * 
 * Produto p8 = new Produto();
 * 
 * System.out.println("Digite o nome do produto: "); tempName = sc.next();
 * System.out.println("Digite o número do Item: "); tempNumber = sc.nextInt();
 * System.out.println("Digite o preço do Item: "); tempPrice = sc.nextFloat();
 * System.out.println("Digite o quantidade de Itens: "); tempQty = sc.nextInt();
 * 
 * p8.setNomeProduto(tempName); p8.setNumItem(tempNumber);
 * p8.setPreUnidade(tempPrice); p8.setNumEstoque(tempQty);
 * p8.setValorInvent(tempPrice * tempQty);
 * 
 * System.out.println(" Nome do Item: " + p8.getNomeProduto() +
 * "\n Número do Item: " + p8.getNumItem() + "\n Preço da Unidade: " +
 * p8.getPreUnidade() + " \n Número de estoques: " + p8.getNumEstoque() +
 * "\n Valor do inventário: " + p8.getValorInvent());
 */
