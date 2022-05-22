package array;

import java.security.SecureRandom;

public class DeckOfCards {
	
	private Card[] deck; // Array de objetos Card
	private int currentCard; // Índice da próxima Card a ser distribuída (0-51)
	private static final int NUMBER_OF_CARDS = 52; // Número constate de Cards
	// Gerador de número aleatório
	private static final SecureRandom randomNumbers = new SecureRandom(); 
	
	// Construtor preenche baralho de cartas
	public DeckOfCards() {
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		deck = new Card[NUMBER_OF_CARDS]; // Cria array de objetos Card
		currentCard = 0; // A primeira Card distribuída seŕa o Deck[0]
		
		// Preenche baralho com objetos Card
		for(int count = 0; count < deck.length; count++) 
			deck[count] =
					new Card(faces[count % 13], suits[count / 13]);
		}
		
		// Embaralha as cartas com um algoritimo de uma passagem
		public void shuffle() {
			// A próxima chamada para o método dealCard deve começar no deck[0] novamente
			currentCard = 0;
			
			// Para cada Card, seleciona outra Card aleatória (0-51) e as compara
			for(int first = 0; first < deck.length; first++) {
				// Seleciona um número aleatório entre 0 e 51
				int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
				
				// Compara Card atual com Card aleatoricamente selecionada
				Card temp = deck[first];
				deck[first] = deck[second];
				deck[second] = temp;
			}
		}
		
		// Distribui uma Card
		public Card dealCard() {
			// Determina se ainda há Cards a serem distribuídas
			if(currentCard < deck.length)
				return deck[currentCard++];
			else
				return null; // Retorna nulo para indicar que todos as Cards foram distribuídas
		}
	}
