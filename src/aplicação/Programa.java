package aplicação;

import xadrez.PartidaDeXadrez;

public class Programa {

	public static void main(String[] args) {

		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		InterfaceUsuário.imprimirTabuleiro(partidaDeXadrez.pegarPeças());

	}

}
