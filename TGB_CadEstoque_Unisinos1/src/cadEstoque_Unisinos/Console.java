package cadEstoque_Unisinos;

public class Console {

	Teclado t;

	public Console() {
		t = new Teclado();
	}

	public int menuPrincipal() {
		int op;
		while (true) {
			System.out.println("Bem vindo ao Controle de Estoque!\n" + "Escolha uma das op��es abaixo: \n"
					+ "1. Mostrar cadastro\n" + "2. Inserir nova pe�a no cadastro\n" + "3. Remover pe�a\n"
					+ "4. Vender pe�a\n" + "5. Mostrar relat�rio de vendas\n" + "6. Sair do programa\n");
			op = t.leInt("Opcao:");
			if (op >= 1 && op <= 6) {
				return op;
			} else {
				System.out.println("Essa op��o n�o existe!");
			}
		}
	}
	
	public int menuMostrar() {
		int op;
		while (true) {
			System.out.println("Listar cadastro\n" + "1- Mostrar todo o cadastro\n" + "2- Filtrar cadastro\n" + "3- Sair" + "\n");
			op = t.leInt("Op��o: ");
			if (op >= 1 & op <= 3) {
				return op;
			} else {
				System.out.println("Essa op��o n�o existe! \n");
			}
		}
	}

	public int menuPeca() {
		int op;
		while (true) {
			System.out.println("Qual o tipo de pe�a que queres guardar? \n" + "1- Pe�a normal \n"
					+ "2- Pe�a Especial \n" + "3- Pe�a Especial Premium \n" + "4- Pe�a Experimental \n" + "5- Sair" + "\n");
			op = t.leInt("Op��o: ");
			if (op >= 1 && op <= 5) {
				return op;
			} else {
				System.out.println("Essa op��o n�o existe!");
			}
		}
	}
	
	public int menuRemover() {
		int op;
		while (true) {
			System.out.println("Remover cadastro\n" + "1- C�digo \n"
					+ "2- Nome \n" + "3- Categoria \n" + "\n");
			op = t.leInt("Op��o: ");
			if (op >= 1 && op <= 4) {
				return op;
			} else {
				System.out.println("Essa op��o n�o existe!");
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
				verificaQuantidade(), leStr("Observa��es: "), leStr("Retri��o: "));
	}

	public PecaEspecialPremium lePecaEspPre(String msg) {
		System.out.println(msg);
		return new PecaEspecialPremium(verificaCodigo(), leStr("Nome: "), verificaCategoria(), verificaPreco(),
				verificaQuantidade(), leStr("Observa��es: "), leStr("Retri��o: "), t.leDouble("Peso: "),
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
			cod = t.leInt("C�digo: ");
			if (cod < 0) {
				System.out.println("C�digo n�o pode ser negativo!");
			} else {
				break;
			}
		}
		return cod;
	}

	public double verificaPreco() {
		double preco;
		while (true) {
			preco = t.leDouble("Pre�o: ");
			if (preco < 0) {
				System.out.println("Pre�o n�o pode ser negativo!");
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
				System.out.println("Quantidade n�o pode ser negativo!");
			} else {
				break;
			}
		}
		return quantidPeca;
	}

}
