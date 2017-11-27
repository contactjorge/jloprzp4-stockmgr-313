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
	private ArrayList<StockItem> $col;// = new ArrayList<>(); //$col instance variable for the collection of Stock
	private ArrayList<StockItem> $baseCol;// = new ArrayList<>(); //$col instance variable for the collection of Stock
	
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
	
	private void setCol (ArrayList<StockItem> $col) {
		this.$col= $col;
	}
	
	public void setBaseCol (ArrayList<StockItem> $baseCol) {
		this.$baseCol = new ArrayList<>(this.$col);
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
		
		System.out.println("\nAdding " + quantity + " " + selectItem.get_brandName() + ".\n");
		int i = 0;
		while (i < quantity ) {
			selectItem.addByOne();
			this.$col.add(selectItem);
			i++;
		}
	}
	
	private void removeItem (StockItem purchasedItem, int quantity) {
		// Add current message to beginning of archive.
		StockItem selectItem = findItembyID(purchasedItem);
		System.out.println("Removing " + quantity + " " + selectItem + "\'s.");
		for ( int i = 0; i < quantity; i++)
		{
			if ( selectItem.get_id() == purchasedItem.get_id() )
			{
				this.$col.remove(i);
			}
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
	}
	
	public InventoryManager () {
		//ArrayList<StockItem> collection = new ArrayList<>();

	}
	
	@Override
	public String toString () {
		return "InventoryManager Collection = \n" + $col + "\n";
	}
}
