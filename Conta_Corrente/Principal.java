public class Principal{
    public static void main(String[] args){
        int numero = Teclado.leInt("Digite o número da conta corrente:");
        double saldo = Teclado.leDouble("Digite o saldo atual da conta corrente");
        ContaCorrente c = new ContaCorrente(numero, saldo);

        while(true){
            System.out.println("1) Efetuar um saque");
            System.out.println("2) Efetuar um depósito");
            System.out.println("3) Imprimir informações da conta");
            System.out.println("4) Sair do menu");
            int op = Teclado.leInt("Digite a opção desejada:");
            if(op == 4)
                break;
            if(op == 1)
                c.efetuaSaque(Teclado.leDouble("Digite o valor a ser sacado:"));
            else if(op == 2)
                c.efetuaDeposito(Teclado.leDouble("Digite o valor a ser depositado:"));
            else if(op == 3)
                c.imprimeInformacoes();
            else
                System.out.println("Opção inválida!");
        }
    }
}