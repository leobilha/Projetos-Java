
public class Jogador {

	private int quantidadePontos;
	private String nome;
	
	public Jogador(int quantidadePontos, String nome) {
		this.quantidadePontos = quantidadePontos;
		this.nome = nome;
	}

	public int getQuantidadePontos() {
		return quantidadePontos;
	}

	public void setQuantidadePontos(int quantidadePontos) {
		this.quantidadePontos = quantidadePontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionaPontos(int pontos) {
		this.quantidadePontos += pontos;
	}
}
