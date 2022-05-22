package colecoesGenericas;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		// cria e exibe uma List<String>
		String[] colors = {"red", "white", "blue", "green", "gray",
				"orange", "tan", "white", "cyan", "peach", "gray", "orange"};
		List<String> list = Arrays.asList(colors);
		
		System.out.printf("List: %s%n", list);
		
		// elimina duplicatas, então imprime os valores únicos
		printNonDuplicates(list);
	}
	
	public static void printNonDuplicates(Collection<String> values) {
		
		// cria uma HashSet
		Set<String> set = new HashSet<>(values);
		
		System.out.printf("%nNonDuplicates are: ");
		
		for (String value : set) {
			System.out.printf("%s ", value);
			
		}
		System.out.println();
	}
}
