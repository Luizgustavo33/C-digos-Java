package pkgPassagem;


public class Passagem {
	private String cliente;
	private String destino;
	private int valor;
	private int taxas;
	private int total;
	
	public Passagem() {
	}

	public Passagem(String cliente, String destino,int valor, int taxas, int total ) {
		this.cliente = cliente;
		this.destino = destino;
		this.valor = valor;
		this.taxas = taxas;
		this.total = total;
		
		
	}
	
	public int getvalor() {
		return this.valor;
	}

	public void setvalor(int valor) {
		this.valor = valor;
	}

	public int gettaxas() {
		return this.taxas;
	}

	public void settaxas(int taxas) {
		this.taxas = taxas;
	}
	
	public int gettotal() {
		total = this.valor + this.taxas;
		return this.total;
	}

	public void settotal(int total) {
		this.total = total;}

	public String getcliente() {
		return this.cliente;
	}

	public void setcliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getdestino() {
		return this.destino;
	}

	public void setdestino(String destino) {
		this.destino = destino;
		
		
	}}

	
