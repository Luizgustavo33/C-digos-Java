package pkgAgencia;

public class Viagens {
	
	protected String localPartida;
	protected String destino;
	
	

public Viagens() {}

public Viagens(String localPartida, String destino ) {
	this.destino = destino;
	this.localPartida = localPartida;
	}

	public String getdestino() {
		return this.destino;
	}

	public void setdestino(String destino) {
		this.destino = destino;
	}
	
	public String getlocalPartida() {
		return this.localPartida;
	}

	public void setlocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}
	
}

