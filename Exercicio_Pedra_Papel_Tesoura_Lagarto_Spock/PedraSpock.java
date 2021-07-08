
public class PedraSpock {

	public static String leJogada(Jogador j) {
		String jogada;
		Teclado t= new Teclado();
		while(true) {
			jogada  = t.leString("Jogue " + j.getNome() + ":");
			
			if(jogada.equalsIgnoreCase("Pedra") || jogada.equalsIgnoreCase("Papel") ||
			   jogada.equalsIgnoreCase("Tesoura") || jogada.equalsIgnoreCase("Lagarto") ||
			   jogada.equalsIgnoreCase("Spock")) {
				
				return jogada;
			}
		}		
	}
	
	public static String avaliaJogada(String a, String b, Jogador j1, Jogador j2) {
		//verifica empate
		if(a.equalsIgnoreCase(b)) return "Empate";
		else {
			if(a.equalsIgnoreCase("Pedra")) {
				if(b.equalsIgnoreCase("Lagarto") || b.equalsIgnoreCase("Tesoura")) {  // j1 vence
					return j1.getNome();
				} else {
					return j2.getNome(); // j2 vence
				}
			} else {
				if(a.equalsIgnoreCase("Lagarto")) {
					if(b.equalsIgnoreCase("Papel") || b.equalsIgnoreCase("Spock")) {  // j1 vence
						return j1.getNome();
					} else {
						return j2.getNome(); // j2 vence
					}
				} else {
					if(a.equalsIgnoreCase("Spock")) {
						if(b.equalsIgnoreCase("Pedra") || b.equalsIgnoreCase("Tesoura")) {  // j1 vence
							return j1.getNome();
						} else {
							return j2.getNome(); // j2 vence
						}
					}
					else {
						if(a.equalsIgnoreCase("Tesoura")) {
							if(b.equalsIgnoreCase("Papel") || b.equalsIgnoreCase("Lagarto")) {  // j1 vence
								return j1.getNome();
							} else {
								return j2.getNome(); // j2 vence
							}
						} else {
							// neste caso, a jogou "Papel"
								if(b.equalsIgnoreCase("Pedra") || b.equalsIgnoreCase("Spock")) {  // j1 vence
									return j1.getNome();
								} else {
									return j2.getNome(); // j2 vence
								}						
						}
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Teclado t= new Teclado();
		
		Jogador j1 = new Jogador(0, t.leString("Nome do primeiro jogador?"));
		Jogador j2 = new Jogador(0, t.leString("Nome do segundo jogador?"));
		
		boolean jogar = true;
		
		String jogada1;
		String jogada2;
		String resp;
		
		while(jogar) {
			
			jogada1 = leJogada(j1);
			jogada2 = leJogada(j2);
			
			String vencedor = avaliaJogada(jogada1, jogada2, j1, j2);
			
			if(vencedor.equals("Empate")) {
				System.out.println("Ops, ninguem ganhou...");
			} else {
				System.out.println("Parabéns " + vencedor);
				if(vencedor.equalsIgnoreCase(j1.getNome())) {
					j1.adicionaPontos(3);
				}
				else {
					j2.adicionaPontos(3);
				}
			}

			
			resp = t.leString("Jogar de novo (S/N)?");
			if(resp.equalsIgnoreCase("S")) {
				jogar = true;
			}
			else {
				jogar = false;
			}
		}
		
		// finalizando: verificar o vencedor
		
		if(j1.getQuantidadePontos() > j2.getQuantidadePontos()) {
			System.out.println(j1.getNome() + " venceu!");
		} else {
			if(j1.getQuantidadePontos() < j2.getQuantidadePontos()) {
				System.out.println(j2.getNome() + " venceu!");
			} else {
				System.out.println("Empate!");
			}
		}
	}

}
