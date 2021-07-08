package cadEstoque_Unisinos;

public class PecaEspecialPremium extends PecaEspecial {

	public double peso;
	public double altura;

	public PecaEspecialPremium(int codigoPeca, String nomePeca, int categoriaPeca, double precoPeca, int quantidPeca,
			String observacoes, String restricao, double peso, double altura) {
		super(codigoPeca, nomePeca, categoriaPeca, precoPeca, quantidPeca, observacoes, restricao);
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
