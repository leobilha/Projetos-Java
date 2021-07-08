public class Pessoa{
    private String nome;
    private ContaCorrente conta;
    
    public Pessoa(String nome, ContaCorrente conta){
        this.nome = nome;
        this.conta = conta;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setConta(ContaCorrente conta){
        this.conta = conta;
    }
    
    public ContaCorrente getConta(){
        return conta;
    }
}









