/**
 * Inventory stock manager project for IT313
 * Create multiple Stock Item objects to be observed by
 * Stock manager class when the items purchased.
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 16th, 2017
 * @version 1.0.10 November 11, 2017
 *w
 **/
package it313project4;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
	// write your code here
		InventoryManager inv = new InventoryManager();
		inv.firstInterface();
		//TransactionsLogger logger = new TransactionsLogger("items.txt");
		//TransactionChecker checker = new TransactionChecker(); //Add () for new class object
		
		//ArrayList<StockItem> items = inv.getCol();
		//logger.setItems(items);
		//checker.addObserver(logger);
		//checker.checkTransactions(); //Throws exception added
		
	}
}
