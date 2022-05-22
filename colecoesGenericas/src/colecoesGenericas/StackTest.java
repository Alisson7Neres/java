package colecoesGenericas;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		// cria uma Stack
		Stack<Number> stack = new Stack<>();
		
		// utiliza método push
		
		stack.push(12L);
		System.out.println("Pushed 12L");
		printStack(stack);
		stack.push(34567);
		System.out.println("Pushed 34567");
		printStack(stack);
		stack.push(1.0F);
		System.out.println("Pushed 1.0F");
		printStack(stack);
		stack.push(1234.5678);
		System.out.println("Pushed 1234.5678");
		printStack(stack);
		
		// remove itens de pilha
		try {
			Number removeObject = null;
			
			// remove elementos da pilha
			while(true) {
				removeObject = stack.pop(); // utiliza o método pop
				System.out.printf("Popped %s%n ", removeObject);
				printStack(stack);
			}
		} catch (EmptyStackException emptyStackException) {
			emptyStackException.printStackTrace();
		}
	}
	
	private static void printStack(Stack<Number> stack) {
		if(stack.isEmpty())
			System.out.printf("stack is empty%n%n"); // a pilha está vazia
		else
			System.out.printf("stack contains: %s (top)%n", stack);
	}
}
