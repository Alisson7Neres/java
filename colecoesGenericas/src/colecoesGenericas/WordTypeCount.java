package colecoesGenericas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {

	public static void main(String[] args) {

		// cria HashMap para armazenar chaves de String e valores Integer
		Map<String, Integer> myApp = new HashMap<>();

		createMap(myApp); // cria mapa com base na entrada do usuário
		displayMap(myApp); // exibe o conteúdo do map
	}

	// cria mapa de entrada de usuário
	private static void createMap(Map<String, Integer> map) {
		Scanner scanner = new Scanner(System.in); // cria o scanner
		System.out.println("Enter a string:"); // solicita a entrada do usuário
		String input = scanner.nextLine();

		// toketiza a entrada
		String[] tokens = input.split(" ");

		// processamento de texto de entrada
		for (String token : tokens) {
			String word = token.toLowerCase(); // obtém a palavra em letras minúsculas

			// se o mapa contiver a palavra
			if (map.containsKey(word)) /* a palavra está no mapa */ {
				int count = map.get(word);
				map.put(word, count + 1); // incrementa a contagem
			} else
				map.put(word, 1); // adiciona nova palavra com uma contagem de 1 para mapa
		}
	}

	// exibe conteúdo do mapa
	private static void displayMap(Map<String, Integer> map) {
		Set<String> keys = map.keySet(); // obtém chaves

		// classifica as chaves
		TreeSet<String> sortedKeys = new TreeSet<>(keys);

		System.out.printf("%nMap contains:%nKey\t\tValue%n");

		// gera saída de cada chave no map
		for (String key : sortedKeys)
			System.out.printf("%-10s%10s%n", key, map.get(key));

		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(),map.isEmpty());
	}

}