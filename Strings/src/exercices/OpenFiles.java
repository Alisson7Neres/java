package exercices;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

import classeString.Account;

public class OpenFiles {

	private static Scanner inOldMaster;
	private static Scanner inTransaction;
	private static Formatter outNewMaster;

	public static void main(String[] args) throws IOException {

		openFile();

	}

	public static void openFile() throws IOException {

		try {
			inOldMaster = new Scanner(Paths.get("oldmast.txt"));
			inTransaction = new Scanner(Paths.get("inTransaction.txt"));
			outNewMaster = new Formatter("outNewMaster.txt");
		} catch (NoSuchFileException exception) {
			System.err.printf("Arquivo inexistente!");
		}
		Account account = new Account();
		account.setAccount(inOldMaster.nextInt());
		account.setFirstName(inOldMaster.next());
		account.setLastName(inOldMaster.next());
		account.setBalance(inOldMaster.nextDouble());
		
		TransactionRecord transactionRecord = new TransactionRecord();
		transactionRecord.account.setInTransaction(inTransaction.nextInt());
		outNewMaster.format("%d %s %s %.2f%n", 
				account.getAccount(), account.getFirstName(),
				account.getLastName(), account.getBalance());
	}
	
}
