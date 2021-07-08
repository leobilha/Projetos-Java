package cadEstoque_Unisinos;

public class Cadastro {

	private Peca[] cadPeca;
	private int totalPeca = 0;
	Console c;

	public Cadastro() {
		this.cadPeca = new Peca[100];
		c = new Console();
		this.totalPeca = 0;
	}

	public void mostrarCadastro() {
		int opcao = 0;
		while (opcao != 3) {
			opcao = c.menuMostrar();
			switch (opcao) {
			case 1:
				for (int i = 0; i < totalPeca; i++){
					System.out.println(cadPeca[i]);
				}
			case 2:
				
			}
		}
		c.mostraMensagem("encerrando...");

	}

	public void inserePeca() {
		if (totalPeca < cadPeca.length - 1) {
			int opcao = 0;
			while (opcao != 5) {
				opcao = c.menuPeca();
				switch (opcao) {
				case 1:
					Peca p1;
					p1 = c.lePeca("Informe a peça ou opção 5 para sair: ");
					cadPeca[totalPeca] = p1;
					totalPeca++;
					c.mostraMensagem("Cadastro realizado com sucesso.\n");
					break;
				case 2:
					Peca p2;
					p2 = c.lePecaEsp("Informe a peça ou opção 5 para sair: ");
					cadPeca[totalPeca] = p2;
					totalPeca++;
					c.mostraMensagem("Cadastro realizado com sucesso.\n");
					break;
				case 3:
					Peca p3;
					p3 = c.lePecaEspPre("Informe a peça ou opção 5 para sair: ");
					cadPeca[totalPeca] = p3;
					totalPeca++;
					c.mostraMensagem("Cadastro realizado com sucesso.\n");
					break;
				case 4:
					Peca p4;
					p4 = c.lePecaExp("Informe a peça ou opção 5 para sair: ");
					cadPeca[totalPeca] = p4;
					totalPeca++;
					c.mostraMensagem("Cadastro realizado com sucesso.\n");
					break;
				}

			}
			c.mostraMensagem("encerrando...");
		}

	}

	public void remover() {
		int qual = c.leNum(0, totalPeca - 1, "Remover de qual posicao?");
		cadPeca[qual] = cadPeca[totalPeca - 1];
		totalPeca--;
	}
	
	
	

	public void executar() {
		int opcao = 0;
		while (opcao != 6) {
			opcao = c.menuPrincipal();

			switch (opcao) {
			case 1:
				mostrarCadastro();
				break;
			case 2:
				inserePeca();
				break;
			case 3:
				/*
				 * removePeca(); break; case 4: vendePeca(); break; case 5: mostraRelatorio();
				 * break;
				 */
			}
		}
		c.mostraMensagem("encerrando...");
	}

}
