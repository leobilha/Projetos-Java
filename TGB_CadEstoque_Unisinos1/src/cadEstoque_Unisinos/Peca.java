package cadEstoque_Unisinos;

public class Peca {

	private int codigoPeca;
	private String nomePeca;
	private int categoriaPeca;
	private double precoPeca;
	private int quantidPeca;

	public Peca(int codigoPeca, String nomePeca, int categoriaPeca, double precoPeca, int quantidPeca) {
		this.codigoPeca = codigoPeca;
		this.nomePeca = nomePeca;
		this.categoriaPeca = categoriaPeca;
		this.precoPeca = precoPeca;
		this.quantidPeca = quantidPeca;
	}

	public int getCodigoPeca() {
		return codigoPeca;
	}

	public void setCodigoPeca(int codigoPeca) {
		this.codigoPeca = codigoPeca;
	}

	public String getNomePeca() {
		return nomePeca;
	}

	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}

	public int getCategoriaPeca() {
		return categoriaPeca;
	}

	public void setCategoriaPeca(int categoriaPeca) {
		this.categoriaPeca = categoriaPeca;
	}

	public double getPrecoPeca() {
		return precoPeca;
	}

	public void setPrecoPeca(double precoPeca) {
		this.precoPeca = precoPeca;
	}

	public int getQuantidPeca() {
		return quantidPeca;
	}

	public void setQuantidPeca(int quantidPeca) {
		this.quantidPeca = quantidPeca;
	}
	
	@Override
	public String toString() {
		return "Peça [Código= " + codigoPeca + ", Nome= " + nomePeca + "Categoria= " + categoriaPeca + "Preço= " + precoPeca + "Quantidade= " + quantidPeca + "]";
	}




	

}
