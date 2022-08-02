package teste1;

import java.util.Scanner;	

public class mundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
int A, B, C;
	System.out.println("Digite o primeiro número: ");
	 A =entrada.nextInt();
	
	System.out.println("Digite o primeiro número: ");
	B=entrada.nextInt();
	
	A=A+B;
	B=A-B;
	A=A-B;
	
	
	System.out.println("O valor de A é " + A );
	System.out.println("O valor de B é " + B );
	 
String s1 = "yes";
String s2 = "yes";
String s3 = new String(s1);

s3.equals(s1);
System.out.println(s3==s1);
}}
