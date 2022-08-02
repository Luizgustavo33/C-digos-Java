	package pkgIMC;
	
	public class GastoEner {

	public double CalcularTBM(int idade, double peso, String sexo) {
		double TMB = 0;
	
	

		System.out.println("Escreva Mulher ou Homem para o seu sexo: ");

		switch (sexo) {

		case "Mulher":

			if (idade > 9 && idade < 19) {
				TMB = 12.2 * peso + 746;
				System.out.println("Sua TMB (taxa metabólica basal) é:  " + TMB);

			} else if (idade > 17 && idade < 31) {
				TMB = 14.7 * peso + 496;
				System.out.println("Sua TMB (taxa metabólica basal) é:  " + TMB);
			}

			else if (idade > 30 && idade < 61) {
				TMB = 8.7 * peso + 829;
				System.out.println("Sua TMB (taxa metabólica basal) é:  " + TMB);
			}

			else if (idade > 60) {
				TMB = 10.5 * peso + 596;
				System.out.println("Sua TMB (taxa metabólica basal) é:  " + TMB);
			}

			break;

		case "Homem":

			if (idade > 9 && idade < 19) {
				TMB = 17.5 * peso + 651;
				System.out.println("Sua TMB (taxa metabólica basal) é:  " + TMB);
			} else if (idade > 17 && idade < 31) {
				TMB = 15.3 * peso + 679;
				System.out.println("Sua TMB (taxa metabólica basal) é:  " + TMB);
			}

			else if (idade > 30 && idade < 61) {
				TMB = 8.7 * peso + 879;
				System.out.println("Sua TMB (taxa metabólica basal) é:  " + TMB);
			}

			else if (idade > 60) {
				TMB = 13.5 * peso + 487;
				System.out.println("Sua TMB (taxa metabólica basal) é:  " + TMB);
			}

			break;

		}
		return TMB;}
		
		public double CalcularNDE(double TMB,  int t) {
			double cal = 0;


		System.out.println("Em qual dessas descrições você se encaixa mais(Digite o número)? \n "
				+ "1)Mulher e Homem: Fica a maior parte do tempo sentada e não pratica atividades físicas programadas. \n"
				+ "2)Mulher:Dia-a-dia movimentado – dirige, cozinha, caminha até o ponto de ônibus, mas sem atividades físicas programadas OU dia-a-dia sedentário e exercícios físicos três vezes por semana, cerca de 30 minutos por dia. \n"
				+ "3)Mulher:Dia-a-dia movimentado e atividades físicas três vezes por cerca de 30 minutos por dia. \n"
				+ "4)Mulher: De uma a duas horas e meia de atividades físicas diárias. \n"
				+ "5)Mulher: Atividade física diária por mais de três horas. \n"
				+ "6)Homem:Dia-a-dia movimentado – dirige, cozinha, caminha até o ponto de ônibus, mas sem atividades físicas programadas OU dia-a-dia sedentário e exercícios físicos três vezes por semana, cerca de 30 minutos por dia. \n"
				+ "7)Homem:Dia-a-dia movimentado e atividades físicas três vezes por semana, cerca de 30 minutos por dia. \n"
				+ "8)Homem:De uma a duas horas e meia de atividades físicas diárias. \n"
				+ "9)Homem: Atividade física diária por mais de três horas. ");

		switch (t) {

		case 1:
			cal = 1.2 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;

		case 2:
			cal = 1.3 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;
		case 3:
			cal = 1.45 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;
		case 4:
			cal = 1.5 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;
		case 5:
			cal = 1.7 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;
		case 6:
			cal = 1.4 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;
		case 7:
			cal = 1.5 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;
		case 8:
			cal = 1.6 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;
		case 9:
			cal = 1.8 * TMB;
			System.out.println("Você precisa ingerir: " + cal + "calorias ");

			break;

		}

		return cal;

	

}}
