package tabuleiro;

public class Peça {

	protected Posição posição;
	private Tabuleiro tabuleiro;

	public Peça(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
		posição = null;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
}
