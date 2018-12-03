package aplicação;

import xadrez.PeçaDeXadrez;

public class InterfaceUsuário {

	public static void imprimirTabuleiro(PeçaDeXadrez[][] peças) {
		for (int i = 0; i < peças.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < peças.length; j++) {
				imprimirPeça(peças[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	private static void imprimirPeça(PeçaDeXadrez peça) {
		if (peça == null) {
			System.out.print("-");
		} else {
			System.out.print(peça);
		}
		System.out.print(" ");
	}
}
