package Motos;

import javax.swing.JOptionPane;

import Entidades.Honda;
import Entidades.Suzuki;
import Entidades.Yamaha;

public class Motos {

	
	public static void main()
	{
		// TODO Auto-generated method stub
		while (true)
		{
			try
			{
				String nome = JOptionPane.showInputDialog("Informe a marca [Cancelar] para sair: ");
				if (nome.equalsIgnoreCase("Honda"))
				{
					Honda moto = new Honda();
					Dadosmoto(moto);
				} 
				
				else if (nome.equalsIgnoreCase("Yamaha")) 
				{
					Yamaha moto = new Yamaha();
					Dadosmoto(moto);
				} 
				else if (nome.equalsIgnoreCase("Suzuki"))
				{
					Suzuki moto = new Suzuki();
					Dadosmoto(moto);
				}
			} 
			catch (Exception e)
			{
				break;
			}
		}
		System.out.println("\nPROGRAMA FINALIZADO!");
	}

	private static void Dadosmoto(Honda moto) {
		// TODO Auto-generated method stub
		
	}

	private static void Dadosmoto(Suzuki moto) {
		// TODO Auto-generated method stub
		
	}

	private static void Dadosmoto(Yamaha moto) {
		// TODO Auto-generated method stub
		
	}}

	
		