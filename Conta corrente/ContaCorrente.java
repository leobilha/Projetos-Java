public class ContaCorrente{
    private int numero;
    private double saldo;
    
    public ContaCorrente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public ContaCorrente(int numero){
        this.numero = numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Número da conta: "+numero);
        System.out.println("Saldo da conta: "+saldo);
    }
    
    public void efetuaDeposito(double valor){
        if(valor < 0)
            System.out.println("ERRO: depósito negativo =(");
        else
            this.saldo += valor;
    }
    
    public void efetuaSaque(double saque){
        if(saque < 0)
            System.out.println("ERRO: saque negativo =(");
        else if(saque > this.saldo)
            System.out.println("ERRO: saldo insifuciente =(");
        else
            this.saldo -= saque;
    }
    
    public String toString(){
        String retorno = "Número da conta: "+numero;
        retorno += "\n";
        retorno += "Saldo da conta: "+saldo;
        retorno += "\n";
        return retorno;
    }
}




