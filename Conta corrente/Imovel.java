public class Imovel{
    private String endereco;
    private double valorVenda, valorAluguel;
    
    public Imovel(String endereco, double valorVenda, double valorAluguel){
        this.endereco = endereco;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }
    
    public Imovel(double valorVenda, double valorAluguel){
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }
    
    public Imovel(String endereco){
        this.endereco = endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }
    
    public void setValorAluguel(double valorAluguel){
        this.valorAluguel = valorAluguel;
    }
    
    public double getValorVenda(){
        return valorVenda;
    }
    
    public double getValorAluguel(){
        return valorAluguel;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void imprimeInfo(){
        System.out.println("Endereço do imóvel: "+endereco);
        System.out.println("Valor de venda do imóvel: "+valorVenda);
        System.out.println("Valor de aluguel do imóvel: "+valorAluguel);
    }
    
    public double calculaImposto(){
        if(Teclado.leInt("Digite 1 para novo e 2 para velho:") == 1){
            //imóvel novo
            return valorVenda * 0.15;
        }else{
            //imóvel velho
            return valorAluguel * 0.1;
        }
    }
}





