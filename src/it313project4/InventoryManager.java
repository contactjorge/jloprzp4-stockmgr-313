/**
 * Inventory manager class to observe the items being purchased
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 16th, 2017
 * @version 1.0.10 November 15, 2017
 *
**/
package it313project4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Inventory Manager
 * All methods tested by hand
 * Methods ran through "User interface" still do not work.
 * Incomplete is the remove method. Was working then stopped.
 * Attempted to use the Observer Observable design pattern
 * Took a test this summer for a job using Subject-Observer design pattern
 * Did well on the PHP version but running into issue with the Java implementation.
 * Will be seeking further Software engineering courses to keep learning.
 * Design patterns are certainly being requested during job interviews.
 */
public class InventoryManager {
	private static final long $serialVersionUID = 4L;
	private ArrayList<StockItem> $col;// = new ArrayList<>(); //$col instance variable for the collection of Stock
	private ArrayList<StockItem> $baseCol;// = new ArrayList<>(); //$col instance variable for the collection of Stock
	
	private void setCol (ArrayList<StockItem> $col) {
		this.$col= $col;
	}
	
	public ArrayList<StockItem> getCol () {
		return $col;
	}
	
	public void setBaseCol (ArrayList<StockItem> $baseCol) {
		this.$baseCol = new ArrayList<>(this.$col);
	}
	
	/**
	 * Manually instantiationg objects into collection
	 * @param collection
	 * @return collection
	 * Used in $col and $baseCol. The idea with $baseCol was to have a placeholder collection
	 * with instantiated objects and zero qty. Felt it was easier to find objects
	 * as well as create a menu of basic items.
	 * $col is the main collection that will have items added to it.
	 */
	private ArrayList<StockItem> newItems (ArrayList<StockItem> collection) {
		ArrayList<StockItem> thisCol = new ArrayList<>();
		
		CandyBarItem peanutMMS = new CandyBarItem("MMS Peanut", "MARS M&M's Flagship", 0.5, 12, true, true); //Instantiate
		CandyBarItem hersheyAlmond = new CandyBarItem("Hershey's Almond", "Hershey's Almond Bar", 0.45, 2, true, true); //Instantiate
		CandyBarItem starBurst = new CandyBarItem("Starburst", "StarBurst Fruit Chews", 0.55, 2, false, false); //Instantiate
		SodaWaterItem coke = new SodaWaterItem("Coke", "Coca-Cola", 12, 0.40, true, true); //Instantiate
		SodaWaterItem cokeDiet = new SodaWaterItem("Coke Diet", "Coca-Cola", 12, 0.40, true, true); //Instantiate
		SodaWaterItem sprite = new SodaWaterItem("Sprite", "Lemon Lime Soda", 12, 0.40, true, true); //Instantiate
		CrispsItem laysFried = new CrispsItem("Lay's Potato Chips", "Lay's Potato Chips", 0.70, 16,	false); //Instantiate
		CrispsItem laysBaked = new CrispsItem("Lay's Baked Potato Chips", "Lay's Baked Potato Chips", 0.70, 16, true); //Instantiate
		CrispsItem doritos = new CrispsItem("Doritos Corn Chips", "Doritos Corn Chips", 0.70, 16, true); //Instantiate
		
		thisCol.add(peanutMMS);//add to collection
		thisCol.add(hersheyAlmond); //add to collection
		thisCol.add(starBurst); //add to collection
		thisCol.add(coke); //add to collection
		thisCol.add(cokeDiet); //add to collection
		thisCol.add(sprite); //add to collection
		thisCol.add(laysFried); //add to collection
		thisCol.add(laysBaked); //add to collection
		thisCol.add(doritos); //add to collection
		
		return thisCol;
	}
	
	/**
	 * This was meant to be the interface that kicks off the user guided menu
	 * Works now - earlier version did not work
	 */
	public void firstInterface() {
		int mgrOption = 0;
		Scanner mgrInput = new Scanner(System.in);
		
		System.out.println("Stock inventory manager");
		System.out.println("Press (1) to add 48 quantity to all items.");
		System.out.println("Press (2) to remove an item.");
		System.out.println("Press (3) to find an item.");
		System.out.println("Press (4) to display all items.");
		System.out.print("Press (0) to quit.\n");
		
		if( mgrInput.hasNextInt() ) {
			mgrOption=mgrInput.nextInt();
			
			if (mgrOption == 1) {
				addStock();
			} else if (mgrOption == 2) {
				removeStock();
			} else if (mgrOption == 3) {
				findStock();
			} else if (mgrOption == 4) {
				displayAll();
			} else if (mgrOption == 0) {
				mgrInput.close();
			}
		} else{
				System.out.println("\nInvalid number selection\nPlease try again\n");
		}
	}
	
	/**
	 * If user selects to add items then this method adds the items
	 * Works now - earlier version did not work
	 * Made this a method that manually adds 48 items when called.
	 *
	 */
	private void addStock () {
		int selection = 0;
		Scanner mgrInputAddItem = new Scanner(System.in); //scanner to determine Item to change
		
		//Get the base collection to print out prompts
		
		System.out.println("Press (1) for Peanut M&M's");
		System.out.println("Press (2) for Hershey's Almond");
		System.out.println("Press (3) for Starburst");
		System.out.println("Press (4) for Coke");
		System.out.println("Press (5) for Diet Coke");
		System.out.println("Press (6) for Sprite");
		System.out.println("Press (7) for Lay's");
		System.out.println("Press (8) for Baked Lay's");
		System.out.println("Press (9) for Doritos");
		System.out.print("Press (0) to go back\n");
		
		int addIndex = 0;
		//Collect the users input
		if( mgrInputAddItem.hasNextInt() ) {
			addIndex=mgrInputAddItem.nextInt() - 1;
			StockItem item=this.$col.get(addIndex);
			System.out.print("How many " + item.get_brandName() + "s would you like to add?\n");
			int itemQty=0;
			
			if (mgrInputAddItem.hasNextInt()) {
				itemQty=mgrInputAddItem.nextInt();
				addItem(item, itemQty);
				System.out.print(itemQty + " " + item.get_brandName() + "Added.\n");
			} else {
				System.out.print("Enter numbers only\n");
			}
		} else {
			System.out.println("\nInvalid number selection\nPlease try again\n");
		}
		firstInterface();
	}
	
	/**
	 * User would be able to choose to remove items from stock
	 * number of items would then be passed to a removeItem method.
	 * this stopped working so I moved the algorithm into this method
	 *
	 * Works now - earlier version did not work
	 */
	private void removeStock () {
		int selection = 0;
		Scanner mgrInputItem = new Scanner(System.in); //scanner to determine Item to change
		
		//Get the base collection to print out prompts
		
		System.out.println("Press (1) for Peanut M&M's");
		System.out.println("Press (2) for Hershey's Almond");
		System.out.println("Press (3) for Starburst");
		System.out.println("Press (4) for Coke");
		System.out.println("Press (5) for Diet Coke");
		System.out.println("Press (6) for Sprite");
		System.out.println("Press (7) for Lay's");
		System.out.println("Press (8) for Baked Lay's");
		System.out.println("Press (9) for Doritos");
		System.out.print("Press (0) to go back\n");
		
		int deleteIndex = 0;
		//Collect the users input
		if( mgrInputItem.hasNextInt() ) {
			deleteIndex = mgrInputItem.nextInt() - 1;
			StockItem item = this.$col.get(deleteIndex);
			System.out.print("How many " + item.get_brandName() + "s would you like to remove?\n" );
			int itemQty = 0;
			if( mgrInputItem.hasNextInt() ) {
				itemQty= mgrInputItem.nextInt();
				if (item.known_quantity() > 0 ){
					for (int c = 0; c < itemQty; c++){
						item.removeByOne();
					}
					System.out.print(itemQty + " " + item.get_brandName() + "Removed.\n");
				} else {
					System.out.println("\nThere are no " + item.get_brandName() + " items in stock at this time.\n \n");
				}
			} else {
				System.out.print("Enter numbers only\n");
			}
			System.out.println(item);
		} else {
			System.out.println("\nInvalid number selection\nPlease try again\n");
		}
		firstInterface();
	}
	
	/**
	 * Finds the stock. Was working but may have stopped as the application
	 * grew more complex
	 * Works now - earlier version did not work
	 */
	private void findStock() {
		Scanner mgrInputItem = new Scanner(System.in); //scanner to find item in inventory
		
		//Get the base collection to print out prompts
		System.out.println("Press (1) for Peanut M&M's");
		System.out.println("Press (2) for Hershey's Almond");
		System.out.println("Press (3) for Starburst");
		System.out.println("Press (4) for Coke");
		System.out.println("Press (5) for Diet Coke");
		System.out.println("Press (6) for Sprite");
		System.out.println("Press (7) for Lay's");
		System.out.println("Press (8) for Baked Lay's");
		System.out.println("Press (9) for Doritos");
		System.out.print("Press (0) to go back\n");
		
		//Collect the users input
		if (mgrInputItem.hasNextInt())
		{
			int findIndex = mgrInputItem.nextInt() - 1;
			StockItem item = this.$col.get(findIndex);
			//Find the item if quantity is greater than 0
			if (item.known_quantity() > 0) {
				System.out.println("\nYou've selected the following item: " + findItembyID(item).get_brandName() + ".");
				System.out.println("===========================================");
				System.out.print(findItembyID(item) + "\n");
			} else {
				System.out.print( "\nThere are no " + item.get_brandName() + " items in the inventory.\n" );
			}
		} else {
			System.out.println("\nInvalid number selection\nPlease try again\n");
		}
		firstInterface();
	}
	
	/**
	 * @param selectedItem
	 * @return returns the item found by ID
	 * Works!
	 */
	private StockItem findItembyID (StockItem selectedItem) {
		
		StockItem findItem = selectedItem;
		String itemID = findItem.get_id();
		
		for (int i = 0; i < $col.size(); i++)
		{
			if ( itemID == findItem.get_id() )
			{
				return findItem;
			}
		}
		return selectedItem;
	}
	
	/**
	 * This works and adds the item to the collection
	 * then updates quantity to the items using item's method.
	 * Have a similar method to remove and was using that with removeItem()
	 * That method stopped working
	 * @param purchasedItem
	 * @param quantity
	 */
	private void addItem (StockItem purchasedItem, int quantity) {
		// Add current message to beginning of archive.
		
		StockItem selectItem = findItembyID(purchasedItem);
		
		System.out.print("Adding " + quantity + " " + purchasedItem.get_brandName() + ".\n");
		int i = 0;
		while (i < quantity ) {
			selectItem.addByOne();
			this.$col.add(purchasedItem);
			i++;
		}
	}
	
	/**
	 * Displays all items in the collection
	 * tested and works
	 */
	private void displayAll () {
		//Display All Stock Items
		
		System.out.println("All Items");
		System.out.println("----------");
		StockItem item = new StockItem();
		int itemCount = 0;
		int itemQuantity = 0;
		//System.out.println(this.$baseCol.size());
		
		for (int c = 0; c < this.$baseCol.size(); c++) {
			item = findItembyID(this.$col.get(c));
			if (item.known_quantity() > 0) {
				System.out.println(item.display());
				itemCount++;
				itemQuantity = itemQuantity + item.known_quantity();
			}
		}
		System.out.println("Individual stock items: " + itemCount);
		System.out.println("Total items in stock: " + itemQuantity);
		firstInterface();
	}
	
	/**
	 * NoArg constructor. Not sure if I needs to have a similar one with constuctors.
	 *
	 *
	 */
	public InventoryManager () {
		this.$col = newItems($col);;
		this.$baseCol = newItems($baseCol);
		
	}
	
	@Override
	public String toString () {
		return "InventoryManager Collection = \n" + $col + "\n";
	}
}
