package array;

public class Card {
	
	public final String face; // face da carta ("Ace", "Deuce", ...)
	public final String suit; // naipe da carta ("Hearts", "Diamonds", ...)
	
	// construtor de dois argumentos inicializa face e naipe da carta
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace; // inicializa face da carta
		this.suit = cardSuit; // inicializa naipe da carta
	}
	
	public String toString() {
		return face + "of" + suit;
	}

}
