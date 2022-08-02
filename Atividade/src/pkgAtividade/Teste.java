package pkgAtividade;

public class Teste {

	public static void main(String[] args) {
	    	Empregado empregado = new Empregado();

	        Empregado empregado1 = new Empregado("Joao", 12, 5);
	        Empregado empregado2 = new Empregado("Maria", 40, 42.00);
	        Empregado empregado3 = new Empregado("Pedro", 10, 50.00);
	        Empregado empregado4 = new Empregado("Ana", 17, 100.00);
	        
	        
	        
	        

	        if(empregado1.calculaSalarioMensal()>empregado2.calculaSalarioMensal() &&  empregado1.calculaSalarioMensal() > empregado3.calculaSalarioMensal()  && empregado1.getalarioPorHora() > 	 empregado4.calculaSalarioMensal()
) {
	              System.out.println("O empregado1 tem o maior salário, sendo ele de:" + empregado1.calculaSalarioMensal() + " reais.");}

	else if 
    (empregado2.calculaSalarioMensal()>empregado1.calculaSalarioMensal() 
    		&&  empregado2.calculaSalarioMensal() > empregado3.calculaSalarioMensal()  
    		&& empregado2.calculaSalarioMensal() > 	 empregado4.calculaSalarioMensal()) {
          System.out.println("O empregado2 tem o maior salário, sendo ele de:" + empregado2.calculaSalarioMensal() + " reais.");}
	else if 
    (empregado3.calculaSalarioMensal()>empregado1.calculaSalarioMensal() &&  empregado3.getalarioPorHora() > empregado2.calculaSalarioMensal()  && empregado3.calculaSalarioMensal() > 	 empregado4.calculaSalarioMensal()
) {
          System.out.println("O empregado3 tem o maior salário, sendo ele de:" + empregado3.calculaSalarioMensal() + " reais.");}
	else 
 {
    System.out.println("O empregado4 tem o maior salário, sendo ele de: " + empregado4.calculaSalarioMensal() + " reais.");}
	        
	       
	        
	        System.out.println(" Nome de empregado: " + empregado1.getnome() + "\n Salário por hora do empregado: "+  empregado1.getalarioPorHora() +"\n Horas trabalhadas: "+ empregado1.gethorasTrabalhadasNoMes() + "\n Salário com ajuste de 20%: "+ empregado1.calculaSalarioMensal() * 1.2 + "reais" );
	        
	        

}
	
	
	
	

		// TODO Auto-generated method stub
		
	}

