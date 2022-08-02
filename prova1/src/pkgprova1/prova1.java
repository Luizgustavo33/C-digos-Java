package pkgprova1;
import java.util.Scanner;

public class prova1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double superior = 30.0;
	        double inferior = 18.0;
	        double entre = 0.0;
	        int num, cont;

	        //Entrada de dados
	        cont = 1;
	        do {
	            System.out.println("digite a temperatura");
	            num = sc.nextInt();

	            if (num < 18.0) {
	                inferior = 18.0;
	            } else if (num >= 18.0 && num <= 30.0) {

	                entre = 0.0;
	            } else if (num >= 30.0);
	            superior = 30.0;

	            cont = cont + 1;

	        } while (cont <= 10);

	        System.out.println("-----------------------------------------------------------");
	        System.out.println("A temperatura em celsius inferior a 18 é " + inferior);
	        System.out.println("-----------------------------------------------------------");
	        System.out.println("A temperatura em celsius entre 18 e 30 é " + entre);
	        System.out.println("-----------------------------------------------------------");
	        System.out.println("A temperatura em celsius superior a 40 é " + superior);
	        System.out.println("-----------------------------------------------------------");
	    }
	}


