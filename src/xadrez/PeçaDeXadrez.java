package xadrez;

import tabuleiro.Peça;
import tabuleiro.Tabuleiro;

public class PeçaDeXadrez extends Peça {

	private Cor cor;

	public PeçaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}
