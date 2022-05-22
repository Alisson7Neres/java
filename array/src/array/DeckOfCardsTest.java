package array;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // Coloca Cards em ordem aleatória

		// Imprime todas as 52 cartas na ordem em que elas são distribuídas
		for(int i = 1; i <= 52; i++) {
			
			// Distribui e exibe uma Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if(i % 4 == 0) // Gera uma nova linha após cada quarta carta
				System.out.println();
		}
	}
}
