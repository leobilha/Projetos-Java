package cadEstoque_Unisinos;

public class Console {

	Teclado t;

	public Console() {
		t = new Teclado();
	}

	public int menuPrincipal() {
		int op;
		while (true) {
			System.out.println("Bem vindo ao Controle de Estoque!\n" + "Escolha uma das opções abaixo: \n"
					+ "1. Mostrar cadastro\n" + "2. Inserir nova peça no cadastro\n" + "3. Remover peça\n"
					+ "4. Vender peça\n" + "5. Mostrar relatório de vendas\n" + "6. Sair do programa\n");
			op = t.leInt("Opcao:");
			if (op >= 1 && op <= 6) {
				return op;
			} else {
				System.out.println("Essa opção não existe!");
			}
		}
	}
	
	public int menuMostrar() {
		int op;
		while (true) {
			System.out.println("Listar cadastro\n" + "1- Mostrar todo o cadastro\n" + "2- Filtrar cadastro\n" + "3- Sair" + "\n");
			op = t.leInt("Opção: ");
			if (op >= 1 & op <= 3) {
				return op;
			} else {
				System.out.println("Essa opção não existe! \n");
			}
		}
	}

	public int menuPeca() {
		int op;
		while (true) {
			System.out.println("Qual o tipo de peça que queres guardar? \n" + "1- Peça normal \n"
					+ "2- Peça Especial \n" + "3- Peça Especial Premium \n" + "4- Peça Experimental \n" + "5- Sair" + "\n");
			op = t.leInt("Opção: ");
			if (op >= 1 && op <= 5) {
				return op;
			} else {
				System.out.println("Essa opção não existe!");
			}
		}
	}
	
	public int menuRemover() {
		int op;
		while (true) {
			System.out.println("Remover cadastro\n" + "1- Código \n"
					+ "2- Nome \n" + "3- Categoria \n" + "\n");
			op = t.leInt("Opção: ");
			if (op >= 1 && op <= 4) {
				return op;
			} else {
				System.out.println("Essa opção não existe!");
			}
		}
	}

	public int leNum(int limInf, int limSup, String msg) {
		int valor;
		do {
			valor = t.leInt(msg);
		} while (valor < limInf || valor > limSup);
		return valor;
	}

	public String leStr(String msg) {
		return t.leString(msg);
	}

	public void mostraMensagem(String msg) {
		System.out.println(msg);
	}

	public Peca lePeca(String msg) {
		System.out.println(msg);
		return new Peca(verificaCodigo(), leStr("Nome: "), verificaCategoria(), verificaPreco(), verificaQuantidade());
	}

	public PecaEspecial lePecaEsp(String msg) {
		System.out.println(msg);
		return new PecaEspecial(verificaCodigo(), leStr("Nome: "), verificaCategoria(), verificaPreco(),
				verificaQuantidade(), leStr("Observações: "), leStr("Retrição: "));
	}

	public PecaEspecialPremium lePecaEspPre(String msg) {
		System.out.println(msg);
		return new PecaEspecialPremium(verificaCodigo(), leStr("Nome: "), verificaCategoria(), verificaPreco(),
				verificaQuantidade(), leStr("Observações: "), leStr("Retrição: "), t.leDouble("Peso: "),
				t.leDouble("Altura: "));
	}

	public PecaExperimental lePecaExp(String msg) {
		System.out.println(msg);
		return new PecaExperimental(verificaCodigo(), leStr("Nome: "), verificaCategoria(), verificaPreco(),
				verificaQuantidade(), t.leInt("Validade: "));
	}

	public int verificaCodigo() {
		int cod;
		while (true) {
			cod = t.leInt("Código: ");
			if (cod < 0) {
				System.out.println("Código não pode ser negativo!");
			} else {
				break;
			}
		}
		return cod;
	}

	public double verificaPreco() {
		double preco;
		while (true) {
			preco = t.leDouble("Preço: ");
			if (preco < 0) {
				System.out.println("Preço não pode ser negativo!");
			} else {
				break;
			}
		}
		return preco;
	}

	public int verificaCategoria() {
		int categoriaPeca;
		while (true) {
			categoriaPeca = t.leInt("Categoria: ");
			if (categoriaPeca < 1 || categoriaPeca > 20) {
				System.out.println("Categoria tem que estar entre 1 e 20!");
			} else {
				break;
			}
		}
		return categoriaPeca;
	}

	public int verificaQuantidade() {
		int quantidPeca;
		while (true) {
			quantidPeca = t.leInt("Quantidade: ");
			if (quantidPeca < 0) {
				System.out.println("Quantidade não pode ser negativo!");
			} else {
				break;
			}
		}
		return quantidPeca;
	}

}
