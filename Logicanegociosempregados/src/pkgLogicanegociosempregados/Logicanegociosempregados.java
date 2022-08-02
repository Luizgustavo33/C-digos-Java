package pkgLogicanegociosempregados;


public class Logicanegociosempregados extends Empregados{
	
	public   double calcularCustos(Empregados empregado) {
	      double custosempregado = 0;
			
	      if(empregado.getsalariodomes() < 10000){
	    	  custosempregado = 500;
	      }else{
	    	  custosempregado = 1000;
	      }
			
	      return custosempregado;
	   }
	}
	

	
