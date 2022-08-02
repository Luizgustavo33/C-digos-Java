package pkgIMC;

public class IMC {

	public double IMCcal(double peso, double altura) {
		double CalIMC;
		CalIMC = peso / (altura * altura);

		if (CalIMC < 20) {
			System.out.println("Voc� est� abaixo do peso");
		} else if (CalIMC >= 20 && CalIMC <= 25) {
			System.out.println("Voc� est� com um peso normal");
		} else if (CalIMC >= 26.0 && CalIMC <= 30) {
			System.out.println("Voc� est� com sobre peso");
		} else if (CalIMC >= 31 && CalIMC <= 40) {
			System.out.println("Voc� est� obeso");
		} else if (CalIMC > 40) {
			System.out.println("Voc� est� obeso m�rbido");

		}

		return CalIMC;

	}

	public double Pesokids(int idade) {
		double pesoideal = 0.0;

		if (idade > 2 && idade < 11) {
			pesoideal = (idade * 2) + 9;
			System.out.println("Seu peso ideal �: " + pesoideal);
		} else {
			System.out.println("Use outro m�todo, voc� ultrapassou a idade limite");
		}

		return pesoideal;

	}

	public double PesoAdultoM(double altura) {
		double pesoideal = 0.0;
		int IMCM = 21;
		

		
			pesoideal = IMCM * (altura * altura);
			System.out.println("Seu peso ideal �:" + pesoideal);

		
		return pesoideal;

	}
	
	public double PesoAdultoH(double altura) {
		double pesoideal = 0.0;

		int IMCH = 22;
		

			pesoideal = IMCH * (altura * altura);
			System.out.println("Seu peso ideal �:" + pesoideal);
			return pesoideal;


		
	}

	public double PesoidosoM(double altura, int idade) {
		double pesoideal = 0.0;



			
				if (idade > 64 && idade < 70) {
					pesoideal = 26.5 * (altura * altura);
					System.out.println("Seu peso ideal �:" + pesoideal);
				} else if (idade > 70 && idade < 74) {
					pesoideal = 26.3 * (altura * altura);
					System.out.println("Seu peso ideal �:" + pesoideal);
				} else if (idade > 74 && idade < 80) {
					pesoideal = 26.1 * (altura * altura);
					System.out.println("Seu peso ideal �:" + pesoideal);
				} else if (idade > 80 && idade < 85) {
					pesoideal = 25.5 * (altura * altura);
					System.out.println("Seu peso ideal �:" + pesoideal);
				} else if (idade > 85) {
					pesoideal = 23.6 * (altura * altura);
					System.out.println("Seu peso ideal �:" + pesoideal);
				}
				else {
					System.out.println("Voc� n�o � idoso");}
				return pesoideal;

		}
		
		public double PesoidosoH(double altura, int idade) {
			double pesoideal = 0.0;


				
					if (idade > 64 && idade < 70) {
						pesoideal = 24.3 * (altura * altura);
						System.out.println("Seu peso ideal �:" + pesoideal);
					} else if (idade > 70 && idade < 74) {
						pesoideal = 25.1 * (altura * altura);
						System.out.println("Seu peso ideal �:" + pesoideal);
					} else if (idade > 74 && idade < 80) {
						pesoideal = 23.9 * (altura * altura);
						System.out.println("Seu peso ideal �:" + pesoideal);
					} else if (idade > 80 && idade < 85) {
						pesoideal = 23.7 * (altura * altura);
						System.out.println("Seu peso ideal �:" + pesoideal);
					} else if (idade > 85) {
						pesoideal = 23.1 * (altura * altura);
						System.out.println("Seu peso ideal �:" + pesoideal);
					}
					else {
						System.out.println("Voc� n�o � idoso");
						return pesoideal;


	}
			return pesoideal;}
}
