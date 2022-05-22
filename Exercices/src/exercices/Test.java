package exercices;

import java.security.SecureRandom;

public class Test {
	public static void main(String[] args) {
		  SecureRandom random = new SecureRandom();
		    int game = random.nextInt(3);
		    
			System.out.println(game);
		}
	}


