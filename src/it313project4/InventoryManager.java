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
	private static final long $serialVersionUID = 4L;
	private ArrayList<StockItem> $col = new ArrayList<>(); //$col instance variable for the collection of Stock
	private StockItem $item = new StockItem(); //$col instance variable for the collection of Stock
	
	private void setCollection (ArrayList<StockItem> $col) {
		this.$col = $col; //mutator for the $col instance variable
	}
	
	private ArrayList<StockItem> getCollection () {
		return $col; //getter for the $col instance variable
	}
	
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

	private String findItembyID (StockItem purchasedItem) {
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
	
	private void addItem (StockItem purchasedItem, int quantity) {
		// Add current message to beginning of archive.
		ArrayList<StockItem> collection = this.$col;
		String itemID = findItembyID(purchasedItem);
		
		System.out.println("How many " + purchasedItem + "\'s would you like to add?");
		int i = 0;
		while (i < quantity ) {
			purchasedItem.addByOne();
			this.$col.add(purchasedItem);
			i++;
		}
	}
	
	private void removeItem (StockItem purchasedItem, int itemQuantity) {
		// Add current message to beginning of archive.
		ArrayList<StockItem> collection = this.$col;
		String itemID = findItembyID(purchasedItem);
		
		for ( int i = 0; i < itemQuantity; i++)
		{
			if ( itemID == purchasedItem.get_id() )
			{
				collection.remove(i);
			}
		}
	}
	
	public void newItems () {
		
		System.out.println("Initializing Items to the inventory:"); //Greeting message
		
		CandyBarItem peanutMMS = new CandyBarItem("MMS Peanut", "MARS M&M's Flagship", 0.5, 12, true, true); //Instantiate
		this.$col.add(peanutMMS); //add to collection
		System.out.println("Initializing Peanut M&M's..."); //Show init printout
		
		CandyBarItem hersheyAlmond = new CandyBarItem("Hershey's Almond", "Hershey's Almond Bar", 0.45, 2, true, true); //Instantiate
		this.$col.add(hersheyAlmond); //add to collection
		System.out.println("Initializing Hershey's Almond..."); //Show init printout
		
		CandyBarItem starBurst = new CandyBarItem("Starburst", "StarBurst Fruit Chews", 0.55, 2, false, false); //Instantiate
		this.$col.add(starBurst); //add to collection
		System.out.println("Initializing StarBurst..."); //Show init printout
		
		SodaWaterItem coke = new SodaWaterItem("Coke", "Coca-Cola", 12, 0.40, true, true); //Instantiate
		this.$col.add(coke); //add to collection
		System.out.println("Initializing Coke..."); //Show init printout
		
		SodaWaterItem cokeDiet = new SodaWaterItem("Coke Diet", "Coca-Cola", 12, 0.40, true, true); //Instantiate
		this.$col.add(cokeDiet); //add to collection
		System.out.println("Initializing Diet Coke..."); //Show init printout
		
		SodaWaterItem sprite = new SodaWaterItem("Sprite", "Lemon Lime Soda", 12, 0.40, true, true); //Instantiate
		this.$col.add(sprite); //add to collection
		System.out.println("Initializing Sprite..."); //Show init printout
		
		CrispsItem laysFried = new CrispsItem("Lay's Potato Chips", "Lay's Potato Chips", 0.70, 16,	false); //Instantiate
		this.$col.add(laysFried); //add to collection
		System.out.println("Initializing Lay's chips..."); //Show init printout
		
		CrispsItem laysBaked = new CrispsItem("Lay's Baked Potato Chips", "Lay's Baked Potato Chips", 0.70, 16, true); //Instantiate
		this.$col.add(laysBaked); //add to collection
		System.out.println("Initializing Lay's Baked Chips..."); //Show init printout
		
		CrispsItem doritos = new CrispsItem("Doritos Corn Chips", "Doritos Corn Chips", 0.70, 16, true); //Instantiate
		this.$col.add(doritos); //add to collection
		System.out.println("Initializing Doritos..."); //Show init printout
	}
	
	public InventoryManager () {
		newItems();
		displayAll();
		
	}
	
	@Override
	public String toString () {
		return "InventoryManager Collection = \n" + $col + "\n";
	}
}
