package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.peças.Rei;
import xadrez.peças.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		inicializadorDePartidaDeXadrez();
	}

	public PeçaDeXadrez[][] pegarPeças() {
		PeçaDeXadrez[][] mat = new PeçaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PeçaDeXadrez) tabuleiro.peça(i, j);
			}
		}
		return mat;
	}

	private void posicionarNovaPeça(char coluna, int linha, PeçaDeXadrez peça) {
		tabuleiro.posicionarPeça(peça, new PosiçãoDeXadrez(coluna, linha).conversãoParaPosição());
	}

	private void inicializadorDePartidaDeXadrez() {
		posicionarNovaPeça('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		posicionarNovaPeça('e', 8, new Rei(tabuleiro, Cor.PRETO));
		posicionarNovaPeça('e', 1, new Rei(tabuleiro, Cor.BRANCO));
	}
}
