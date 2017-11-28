package it313project4;
// Source Code Cile: TransactionChecker.java
// For Project4b, Choice 2
// To be modified.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Observable;
import java.util.Scanner;

public class TransactionChecker extends Observable {
	Scanner _in;
	
	public TransactionChecker () {
	
	}
	
	public TransactionChecker(String fileName)
			throws FileNotFoundException {
		_in = new Scanner(new File(fileName));
		System.out.println("Terminate");
	}
	
	public void checkTransactions( ) {
		while(_in.hasNextLine( )) {
			String line = _in.nextLine( );
			String[ ] fields = line.split(",");
			System.out.printf("%s %s %.2f %s\n",
					fields[0], fields[1],
					Double.parseDouble(fields[2]), fields[3]);
		}
		_in.close( );
	}
	
}
