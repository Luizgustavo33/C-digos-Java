package pkgRefatoracaoParte1;

import java.util.Calendar;
import java.util.Scanner;

public class Mensalidade {		
static Calendar calendario;
public static void main(String[] args) {
double mensalidade = 0;
double novamensalidade = 0;
int mes = 0;
int mesAtual = 0;
Scanner sc = new Scanner(System.in);

for (int i = 0;i < 3; i++)
{
System.out.println("Valor da mensalidade: ");
mensalidade = sc.nextInt();
System.out.println("Mes de referencia: ");
mes= sc.nextInt();
calendario = Calendar.getInstance();
mesAtual = calendario.get(Calendar.MONTH) + 1;
if(mes<mesAtual)
novamensalidade = mensalidade * 1.10;
else if(mes > mesAtual)
novamensalidade = mensalidade;
System.out.println("RESULTADO");
System.out.println("Mes atual: " + mesAtual);
System.out.println("Referência: " + mes);
System.out.println("Mensalidade: " + mensalidade);
System.out.println("Novo valor: " + novamensalidade) ;
;
}
System.out.println("PROGRAMA FINALIZADO");
sc.close();
}}
