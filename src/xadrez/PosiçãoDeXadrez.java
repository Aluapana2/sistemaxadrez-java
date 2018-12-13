package xadrez;

import tabuleiro.Posição;

public class PosiçãoDeXadrez {

	private char coluna;
	private int linha;

	public PosiçãoDeXadrez(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ExceçãoXadrez("Erro instanciando PosiçãoDeXadrez. Valores válidos são de a1 até h8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Posição conversãoParaPosição() {
		return new Posição(8 - linha, coluna - 'a');
	}

	protected static PosiçãoDeXadrez conversãoParaPosiçãoDeXadrez(Posição posição) {
		return new PosiçãoDeXadrez((char) ('a' - posição.getColuna()), 8 - posição.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}

}
