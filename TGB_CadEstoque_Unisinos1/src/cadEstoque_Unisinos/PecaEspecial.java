package cadEstoque_Unisinos;

public class PecaEspecial extends Peca {

	public String observacoes;
	public String restricao;

	public PecaEspecial(int codigoPeca, String nomePeca, int categoriaPeca, double precoPeca, int quantidPeca,
			String observacoes, String restricao) {
		super(codigoPeca, nomePeca, categoriaPeca, precoPeca, quantidPeca);
		this.observacoes = observacoes;
		this.restricao = restricao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getRestricao() {
		return restricao;
	}

	public void setRestricao(String restricao) {
		this.restricao = restricao;
	}

}
