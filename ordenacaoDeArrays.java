import java.util.Arrays;

public class OrdenacaoDeArrays {
	public static void main(String[] args) {
	 int[] adr = {10,32,23,11,400};
	 // Ordenar por onderm crescente
    Arrays.sort(adr);
	 
	 System.out.printf("adr[] : %s", Arrays.toString(adr));
	
  // Ordenar por onderm decrescente
  
   Arrays.sort(adr, Collections.reverseOrder());
   
   // adr[] : [10, 11, 23, 32, 400]
	 
	 System.out.printf("\nadr[] : %s", Arrays.toString(adr));
   
   // adr[] : [400, 32, 23, 11, 10]
  }
}
