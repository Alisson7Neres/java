package array;

public class InitArrayMult {
	
	public static void main(String[] args) {
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
		
		System.out.println("Values in array1 by now are");
		outputArray(array1); // exibe array2 por linha
		
		System.out.printf("%nValues in array2 by row are%n");
		outputArray(array2); // exibe array2 por linha
		
		
	}
	public static void outputArray(int[][] array) {
		
		for(int row = 0; row < array.length; row++) {
			for(int column = 0; column < array[row].length; column++) {
				System.out.printf("%d ", array[row][column]);
				
			}
			System.out.println();
		}
	}
}
