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
				mgrInput.hasNext();
			}
		} else{
				System.out.println("\nInvalid number selection\nPlease try again\n");
		}
	}
	
	private void addStock () {
		StockItem theItem = new StockItem();
		for (int i=0; i < this.$baseCol.size(); i++) {
			theItem = this.$col.get(i);
			addItem(theItem, 48);
		}
		
		firstInterface();
	}
	
	private void removeStock () {
		int itemQty = 0;
		int deleteItem = 0;
		int selection = 0;
		StockItem item = new StockItem();
		Scanner mgrInputItem = new Scanner(System.in); //scanner to determine Item to change
		Scanner mgrInputQty = new Scanner(System.in);
		
		//Get the base collection to print out prompts
		for (int i = 0; i < this.$baseCol.size(); i++) {
			selection = i + 1;
			System.out.println("Press (" + selection + ") for " + this.$baseCol.get(i).get_brandName() + "." );
		}
		System.out.print("Press (0) to go back\n");
		
		//Collect the users input
		if( mgrInputItem.hasNextInt() ) {
			deleteItem = mgrInputItem.nextInt();
			System.out.println(deleteItem);
		} else {
			System.out.println("\nInvalid number selection\nPlease try again\n");
		}
		
		int opt = deleteItem - 1;
		item = this.$col.get(opt);
		
		System.out.print("How many " + item.get_brandName() + "s would you like to remove?\n" );
		
		if( mgrInputQty.hasNextInt() ) {
			itemQty = mgrInputQty.nextInt();
			if (item.known_quantity() > 0 ){
				int i = 1;
				while (i < itemQty){
					item.removeByOne();
					i++;
				}
				System.out.print(itemQty + " " + item.get_brandName() + "Removed.\n");
			} else {
				System.out.println("\nThere are no " + item.get_brandName() + " items in stock at this time.\n \n");
			}
		} else {
			System.out.print("Enter numbers only\n");
		}
		firstInterface();
	}
	
	private void findStock() {
		int selection = 0;
		StockItem item = new StockItem();
		
		//Get the base collection to print out prompts
		for (int i = 0; i < this.$baseCol.size(); i++) {
			selection = i + 1;
			System.out.println("Press (" + selection + ") for " + this.$baseCol.get(i).get_brandName() + "." );
		}
		System.out.print("Press (0) to go back\n");
		if (item.known_quantity() > 0) {
			System.out.println("\nYou've selected the following item: " + findItembyID(item).get_brandName() + ".");
			System.out.println("===========================================");
			System.out.print(findItembyID(item) + "\n");
		} else {
			System.out.print( "\nThere are no " + item.get_brandName() + " items in the inventory.\n" );
		}
	}
	
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
	
	private void addItem (StockItem purchasedItem, int quantity) {
		// Add current message to beginning of archive.
		
		StockItem selectItem = findItembyID(purchasedItem);
		
		System.out.print("Adding " + quantity + " " + selectItem.get_brandName() + ".\n");
		int i = 0;
		while (i < quantity ) {
			selectItem.addByOne();
			this.$col.add(selectItem);
			i++;
		}
	}
	
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
	
	public InventoryManager () {
		this.$col = newItems($col);;
		this.$baseCol = newItems($baseCol);
		
	}
	
	@Override
	public String toString () {
		return "InventoryManager Collection = \n" + $col + "\n";
	}
}
