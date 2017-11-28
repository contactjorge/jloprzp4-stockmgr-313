/**
 * Inventory stock manager project for IT313
 * Create multiple Stock Item objects to be observed by
 * Stock manager class when the items purchased.
 *
 * This is both for Winter term project 4 and 5
 * The Autumn term used 4a and 4b
 * I was unable to finish these as the videos were taken down.
 * I also had a difficult time finding tutoring help.
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 16th, 2017
 * @version 1.0.10 November 11, 2017
 *w
 **/
package it313project4;

import java.io.FileNotFoundException;

/**
 * Main Class no Params
 */
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
