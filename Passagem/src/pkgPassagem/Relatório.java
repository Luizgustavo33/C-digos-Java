package pkgPassagem;

import java.util.Scanner;


public class Relat�rio {
	public static void main(String[] args) {


		  Passagem p = new Passagem();
	  
	  
	  p.setcliente("C�ssio");
	  p.setdestino("Amazonas");
	  p.setvalor(20);
	  p.settaxas(20);
	
	  System.out.println("Relat�rio do cliente: " +  p.getcliente());
	  
	  System.out.println(" Nome do cliente: " + p.getcliente() +
	 "\n Destino do cliente: " + p.getdestino() + "\n Valor da passagem: " +
	  p.gettaxas() + " \n Taxa da passagem: " + p.getvalor() + "\n Valor total passagem: " + p.gettotal()); 
	 }
}
