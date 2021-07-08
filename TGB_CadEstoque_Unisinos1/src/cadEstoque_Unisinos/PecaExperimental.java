package cadEstoque_Unisinos;

public class PecaExperimental extends Peca {

	public int validade;

	public PecaExperimental(int codigoPeca, String nomePeca, int categoriaPeca, double precoPeca, int quantidPeca,
			int validade) {
		super(codigoPeca, nomePeca, categoriaPeca, precoPeca, quantidPeca);
		this.validade = validade;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}
}
