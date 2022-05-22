package pacote;

public enum Book {

	// declara constantes do tipo enum
	JHTP("Java How to Program", "2015"),
	CHTP("C How to Program", "2013"),
	IW3HTP("Internet & World Wide Web How to Program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBHTP("Visual Basic How to Program", "2014"),
	CSHARPHTP("Visual C# How to Program", "2014");
	
	//  Campos de instância
	private final String title;
	private final String copyrigthYear;
	
	// Construtor enum
	Book(String title, String copyrigthYear) {
		this.title = title;
		this.copyrigthYear = copyrigthYear; 
	}
	
	// Acessor para título de campo
	public String getTitle() {
		return title;
	}
	
	// Acessor para o campo copyrigthYear
	public String getCopyrigthYear() {
		return copyrigthYear;
	}
}
