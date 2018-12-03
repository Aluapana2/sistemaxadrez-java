package xadrez;

import tabuleiro.Posição;
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

	private void inicializadorDePartidaDeXadrez() {
		tabuleiro.posicionarPeça(new Torre(tabuleiro, Cor.BRANCO), new Posição(2, 1));
		tabuleiro.posicionarPeça(new Rei(tabuleiro, Cor.PRETO), new Posição(0, 4));
		tabuleiro.posicionarPeça(new Rei(tabuleiro, Cor.BRANCO), new Posição(7, 4));
	}
}
