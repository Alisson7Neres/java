package excecao;

public class UsingExceptionsStack {
	
	public static void main(String[] args) {
		
		try {
			method1();
		} catch(Exception exception) { // captura a exceçao lançada em method1
			System.err.printf("%s%n%n", exception.getMessage());
			exception.printStackTrace();
			
			// obtém informações de rastreamento de pilha
			StackTraceElement[] stackTraceElements = exception.getStackTrace();
			
			System.out.printf("%nStack trace from getStackTrace:%n");
			System.out.println("Class\t\t\t\t\tFile\t\t\tLine\tMethod");
			
			// faz um loop por traceElements para obter a descrição da exceção
			for(StackTraceElement element : stackTraceElements) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());
			}
		}
	}
	
	// chama method2; lança exceções de volta para main
	public static void method1()throws Exception {
		method2();
	}
	
	// chama method3; lança exceções de volta para method1
	public static void method2() throws Exception {
		method3();
	}
	
	// lança Exception de bolta para method2
	public static void method3() throws Exception {
		throw new Exception("Exception throw in method3");
	}
}
