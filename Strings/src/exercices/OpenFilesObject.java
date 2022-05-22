package exercices;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import classeString.Account;

public class OpenFilesObject {

	private static ObjectInputStream oldmast;
	private static ObjectInputStream trans;
	private static ObjectOutputStream outNewMaster;
	private static ObjectInputStream inOldMaster;
	private static ObjectInputStream inTransaction;
	private static Account account;

	public static void main(String[] args) {
		try {
			open();
		} catch (NoSuchFieldException e) {
			System.err.println("Metódo não encontrado");
		}
	}

	public static void open() throws NoSuchFieldException {
		try {
			oldmast = new ObjectInputStream(Files.newInputStream(Paths.get("oldmast.ser")));
			trans = new ObjectInputStream(Files.newInputStream(Paths.get("trans.ser")));
			outNewMaster = new ObjectOutputStream(Files.newOutputStream(Paths.get("newmaster.ser")));

			Account account = (Account) inOldMaster.readObject();
			TransactionRecord transactionRecord = (TransactionRecord) inTransaction.readObject();
			outNewMaster.writeObject(account);
		} catch (ClassNotFoundException | IOException e) {
			System.err.println("Error ao abrir o arquivo");
			System.err.println("Classe não encontrada");
		}
	}

}
