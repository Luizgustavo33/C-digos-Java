package pkgprovinha;

import java.util.Scanner;

public class prova {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//Var para arays
					int i = 0;
					int j = 0;
					int l = 0;
					int k = 0;
					
					
			//arrays 
					float[] temp = new float[10];
					float[] temp1 = new float[10];
					float[] temp2 = new float[10];
					float[] temp3 = new float[10];
			
					float media = 0;
			
					do {
			            System.out.println("Escreva a temperatura: ");
			            temp[i] = sc.nextFloat();
			
			            if (temp[i] < 18) {
			
			                //System.out.println("A temperatura é abaixo de 18°" );
			                System.out.println("A temperatura é: " + temp[i] + "°");
			                temp1[j] = temp[i];
			                j++;
			            } else if (temp[i] > 17 && temp[i] < 30) {
			
			                //System.out.println("As temperatur está entre 18° e 30° são" );
			                System.out.println("A temperatura é: " + temp[i] + "°");
			                temp2[k] = temp[i];
			                k++;
			            } else {
			
			                //System.out.println("A temperatur é maior que 30°" );
			                System.out.println("A temperatura é: " + temp[i] + "°");
			
			                temp3[l] = temp[i];
			                l++;
			            }
			
			            media = (media + temp[i]); //media temp
			
			            i++;
			        } while (i < 10);
			        
			        int m = j ;
			        int n = k ;
			        int o = l ;
			        
			        j=0;
			        System.out.println("Essas são as temperaturas abaixo de 18 graus:");
			        for (i = 0; i < m ; i++) {
			
			            System.out.printf("%.2f",temp1[j]);
			            System.out.println("°");
			            j++;
			        }
			        k = 0;
			        System.out.println("Essas são as temperaturas entre de 18 e 30 graus:");
			
			        for (i = 0; i < n ; i++) {
			
			            System.out.printf("%.2f",temp2[k]);
			            System.out.println("°");
			            k++;
			        }
			        l = 0;
			        System.out.println("Essas são as temperaturas acima de 30 graus:");
			        
			        for (i = 0; i < o ; i++) {
			
			            System.out.printf("%.2f",temp3[l]);
			            System.out.println("°");
			           l++;
			        }
			        
			        System.out.printf("A média das temperaturas em graus é : %.2f", media / 10);
			
			        sc.close();
		}
System.out.println("\nFim do Programa");

}}




