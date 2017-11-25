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

public class InventoryManager {
	private static final long serialVersionUID = 4L;
	private ArrayList<StockItem> $col = new ArrayList<>(); //$col instance variable for the collection of Stock
	
	private void set$col (ArrayList<StockItem> $col) {
		this.$col = $col; //mutator for the $col instance variable
	}
	//done
	
	private ArrayList<StockItem> getCol () {
		return $col; //getter for the $col instance variable
	}
	//done
	
	private boolean find (String theBrand) {
		
		//Loop until the length of the array
		for(StockItem item : this.$col)
		{
			if (item.get_brandName().equalsIgnoreCase( theBrand ) && item.known_quantity() > 0)
			{
				return true;
			}
		}
		return false;
	}
	//not tested

	
	private void displayItem (StockItem the_item) {
		//Display Quantity of Stock Items
		int count = 0;
		for (StockItem item : $col) {
			if (find(the_item.get_brandName())) {
				count++;
			}
		}
		
		System.out.print(count);
		System.out.print("There are " + count + " " + the_item);
	}
	
	private void displayAll () {
		//Display All Stock Items
		for(StockItem the_item : $col) {
			System.out.println(the_item);
		}
		
	}
	//done

private String getItembyID (StockItem purchasedItem) {
	
	StockItem pItem = purchasedItem;
	String itemID = purchasedItem.get_id();
	for (int i = 0; i < this.$col.size(); i++)
	{
		if ( itemID == pItem.get_id() )
		{
			System.out.println(this.$col.size());
			System.out.println(itemID);
			System.out.println(pItem.get_id());
			System.out.println(i);
			return itemID;
		}
	}
	return "Not found";
}
	//not tested
	
	private void addItem (StockItem the_purchasedItem, int quantity) {
		// Add current message to beginning of archive.
		int i = 0;
		while (i < quantity ) {
			the_purchasedItem.addByOne();
			this.$col.add(the_purchasedItem);
			i++;
		}
	}
	//done
	
	private void removeItem (StockItem purchasedItem, int itemQuantity) {
		
		ArrayList<StockItem> collection = this.$col;
		
		String itemID = getItembyID(purchasedItem);
		
		for ( int i = 0; i < itemQuantity; i++)
		{
			if ( itemID == purchasedItem.get_id() )
			{
			collection.remove(i);
			}
		}
		 //return the$collection;
	}
	//not tested
	
	public InventoryManager () {
		ArrayList<StockItem> col = new ArrayList<StockItem>();
		this.$col = col;
		
		CandyBarItem peanutMMS = new CandyBarItem("MMS Peanut", "MARS M&M's", 0.45, 12, true, true);
		CandyBarItem chocMMS = new CandyBarItem("MMS Chocolate", "MARS M&M's", 0.45, 12, false, true);
		CandyBarItem goobers = new CandyBarItem("Goobers", "Nestle' Goobers", 0.45, 12, true, true);
		CandyBarItem goodbar = new CandyBarItem("Mr. Goodbar", "Hershey's Mr. Goodbar", 0.45, 12, true, true);
		
		addItem(peanutMMS, 12);
		addItem(chocMMS, 12);
		addItem(goobers, 24);
		removeItem(peanutMMS, 3);
		getItembyID(peanutMMS);
		
		
	}
	
	@Override
	public String toString () {
		return "InventoryManager Collection = \n" + $col + "\n";
	}
}
