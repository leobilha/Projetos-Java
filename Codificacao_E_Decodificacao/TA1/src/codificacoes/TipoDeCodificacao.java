package codificacoes;

import java.util.Arrays;

public enum TipoDeCodificacao {
    Golomb(0,"Golomb"),
    EliasGamma(1,"Elias-Gamma"),
    Fibonacci(2,"Fibonacci"),
    Unary(3,"Unaria"),
    Delta(4,"Delta");

    private final String nome;
    private final int identificador;

    TipoDeCodificacao(int identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public static TipoDeCodificacao getValueByName(String nome) {
        return Arrays.stream(TipoDeCodificacao.values())
                .filter(codingType -> codingType.getNome().equals(nome))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("CodingType not found: " + nome));
    }
}
