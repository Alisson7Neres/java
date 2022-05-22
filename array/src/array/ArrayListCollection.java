
package array;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
	
	// Cria um novo ArrayList de strings com uma capacidade inicial de 10
	ArrayList<String> items = new ArrayList<String>();
	items.add("red"); // Anexa um item à lista
	items.add(0, "yellow"); // Insere "yellow" no índice 0
	
	// Cabeçalho
	System.out.printf(
			"Display list contents with counter-controlled loop:");
	
	// Exibe as cores na lista
	for(int i = 0; i < items.size(); i++) {
		System.out.printf(" %s", items.get(i));
	}
	
	// Exibe as cores usando for aprimorada no método display
	display(items,
			"%nDisplay list contents with enhanced for statement:");
	
	items.add("green"); // adiciona "green" ao fim da lista
	items.add("yellow"); // adiciona "yellow" ao fim da lista
	display(items, "List with two new elements:");
	items.remove("yellow"); // remove o primeiro "yellow"
	display(items, "Remove first instance of yellow:");
	items.remove(1); // remove o item no índice 1
	display(items, "Remove second list element (green):");
	// verifica se um valor está na List
	System.out.printf("\"red\" is %sin the list%n",
	items.contains("red") ? "": "not ");
	// exibe o número de elementos na List
	System.out.printf("Size: %s%n", items.size());
	
	}
	// Exibe elementos do ArrayList no console
	public static void display(ArrayList<String> items, String header) {
		System.out.printf(header); // Exibe o cabeçalho
		
		// Exibe cada elemento em itens
		for(String item : items) {
			System.out.printf(" %s", item);
		}
		System.out.println();
	}
}