package pacote;

public class PackageData {
	
	int number;
	String string;
	
	PackageData() {
		number = 0;
		string = "hello";
	}
	
	public String toString() {
		return String.format("Number: %d String: %s", number, string);
	}

}
