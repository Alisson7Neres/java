package colecoesGenericas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
	
	public static void main(String[] args) {
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		// Cria e exibe uma lista contendo os elementos do Array suits
		List<String> list = Arrays.asList(suits);
		System.out.printf("Unsorted array elements: %s%n", list);
		
		Collections.sort(list);
		System.out.printf("Sorted array elements: %s%n", list);
	}

}
