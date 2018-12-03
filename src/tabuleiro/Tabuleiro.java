package tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peça[][] peças;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas<1 || colunas<1) {
			throw new ExceçãoTabuleiro("Erro ao criar tabuleiro: precisa haver ao menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peça[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}


	public Peça peça(int linha, int coluna) {
		if (!posiçãoExiste(linha, coluna)) {
			throw new ExceçãoTabuleiro("Posição fora do tabuleiro");
		}
		return peças[linha][coluna];
	}

	public Peça peça(Posição posição) {
		if (!posiçãoExiste(posição)) {
			throw new ExceçãoTabuleiro("Posição fora do tabuleiro");
		}
		return peças[posição.getLinha()][posição.getColuna()];
	}

	public void posicionarPeça(Peça peça, Posição posição) {
		if (háPeça(posição)) {
			throw new ExceçãoTabuleiro("Já existe uma peça na posição " + posição);
		}
		peças[posição.getLinha()][posição.getColuna()] = peça;
		peça.posição = posição;
	}

	private boolean posiçãoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posiçãoExiste(Posição posição) {
		return posiçãoExiste(posição.getLinha(), posição.getColuna());
	}

	public boolean háPeça(Posição posição) {
		if (!posiçãoExiste(posição)) {
			throw new ExceçãoTabuleiro("Posição fora do tabuleiro");
		}
		return peça(posição) != null;

	}

}
