package pacote;

public class PackageDataTest {
	
	public static void main(String[] args) {
		
		PackageData packageData = new PackageData();
		
		// Gera saída da representação String de packageData
		System.out.printf("After instantiation:%n%s%n", packageData);
		
		// Muda os dados de acesso de pacote no objeto packageData
		packageData.number = 77;
		packageData.string = "Goodbye";
		
		// Gera saída da representação String de packageData
		System.out.printf("%nAfter changing values:%n%s%n", packageData);
	}
}
