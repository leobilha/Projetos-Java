public class TesteAssociacao{
    public static void main(String[] args){
        Pessoa p = new Pessoa("Barrios", new ContaCorrente(1234, 2000000));
        System.out.println("Nome da pessoa: "+p.getNome());
        System.out.println("Saldo da conta da pessoa: "+p.getConta().getSaldo());
        System.out.println("Número da conta da pessoa: "+p.getConta().getNumero());
        p.getConta().setSaldo(3000000);
        System.out.println(p.getConta());
    }
}