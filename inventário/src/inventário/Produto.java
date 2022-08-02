package inventário;

public class Produto {
	// Declarações de campo de instância
	private int NumItem;
	private String NomeProduto;
	private int NumEstoque;
	private double PreUnidade;
	private boolean Ativo;
	private float ValorInvent;
	private int deduzirinvent;
	private int addinvent;

	

	

	
//Criar um inventário e incluir dados nele.
	public Produto() {
	}

	public Produto(String NomeProduto, int NumItem, double PreUnidade, int NumEstoque, boolean booliano, int addinvent, int deduzirinvent) {
		this.NumItem = NumItem;
		this.NomeProduto = NomeProduto;
		this.NumEstoque = NumEstoque;
		this.PreUnidade = PreUnidade;
		this.Ativo = booliano;
		this.addinvent = addinvent;
		this.deduzirinvent = deduzirinvent;
		
		
	}

	public double getNumItem() {
		return this.NumItem;
	}

	public void setNumItem(int NumItem) {
		this.NumItem = NumItem;
	}

	public double getNumEstoque() {
		return this.NumEstoque;
	}

	public void setNumEstoque(int NumEstoque) {
		this.NumEstoque = NumEstoque;
	}

	public double getPreUnidade() {
		return this.PreUnidade;
	}

	public void setPreUnidade(double PreUnidade) {
		this.PreUnidade = PreUnidade;
	}

	public String getNomeProduto() {
		return this.NomeProduto;
	}

	public void setNomeProduto(String NomeProduto) {
		this.NomeProduto = NomeProduto;
	}
	public boolean getAtivo() {
		return this.Ativo;
	}

	public void setAtivo (boolean Ativo) {
		this.Ativo = Ativo;
	}
	public float getValorInvent() {
		return this.ValorInvent;
	}

	public void setValorInvent (float ValorInvent) {
		this.ValorInvent = ValorInvent;
	}
	
	public int getaddinvent() {
		return this.addinvent;
	}

	public void setaddinvent (int addinvent) {
		this.addinvent = addinvent;
	}
	public int getdeduzirinvent() {
		return this.deduzirinvent;
	}

	public void setdeduzirinvent (int deduzirinvent) {
		this.deduzirinvent = deduzirinvent;
	}
	

	}


// this.NumItem=NumItem;this.NomeProduto=NomeProduto;this.NumEstoque=NumEstoque;this.PreUnidade=PreUnidade;}

// Produto produto = new Produto();
