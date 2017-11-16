/**
 * Inventory manager class to observe the items being purchased
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 16th, 2017
 * @version 1.0.10 November 11, 2017
 *
**/
package it313project4;

import java.util.ArrayList;
//import java.util.Observable;

public class InventoryManager{
	public ArrayList<StockItem> _col = new ArrayList<>(); //_col instance variable for the collection of Stock Items
	public StockItem purchasedItem; //Individual Item
	
	// Getter for stock item as it is purchased.
	
	/**
	 *
	 * @param _col
	 */
	private void set_col (ArrayList<StockItem> _col) {
		this._col = _col; //mutator for the _col instance variable
	}
	
	/**
	 *
	 * @return
	 */
	public ArrayList<StockItem> get_col () {
		return _col; //getter for the _col instance variable
	}
	
	/**
	 *
	 * @param purchasedItem
	 */
	public void setPurchasedItem (StockItem purchasedItem) {
		//Set the purchased Item
		this.purchasedItem = purchasedItem;
	}
	
	/**
	 *
	 * @param purchasedItem
	 */
	public void addItem (StockItem purchasedItem) {
		// Add current message to beginning of archive.
		this._col.add(purchasedItem);
	}
	
	/**
	 *
	 */
	public void displayAll () {
		//Display All Stock Items
		for(StockItem the_item : _col) {
			System.out.println(the_item.toString());
		}
		
	}
	
	/**
	 *
	 * @param the_item
	 * @return
	 */
	public String find (StockItem the_item) {
		
		//Loop until the length of the array
		for(StockItem item : _col)
		{
			if (the_item.get_brandName().equalsIgnoreCase( item.get_brandName()) && the_item.known_quantity() > 0)
			{
					return "Yes.\n";
			}
		}
		return "No we do not.\n";
	}
	
	public String getItembyID (String itemID) {
		for(StockItem item : _col)
		{
			System.out.println(item.toString());
			if (itemID.equals(item.get_id()))
			{
				return item.toString() + " Found.";
			}
		}
		return "Item not found";
	}
	
	/**
	 *
	 * @return
	 */
	public StockItem getPurchasedItem () {
		
		return purchasedItem;//Return the purchased Item
	}
	
	/**
	 *
	 * @param the_collection
	 */
	public void removePurchasedItem (ArrayList<StockItem> the_collection) {
		
		this._col = the_collection; //return the_collection;
		
	}
	
	public InventoryManager () {
		CandyBarItem peanutMMS = new CandyBarItem("MMS Peanut", "MARS M&M's", 0.45, 12, true, true);
		CandyBarItem chocMMS = new CandyBarItem("MMS Chocolate", "MARS M&M's", 0.45, 12, false, true);
		CandyBarItem goobers = new CandyBarItem("Goobers", "Nestle' Goobers", 0.45, 12, true, true);
		CandyBarItem goodbar = new CandyBarItem("Mr. Goodbar", "Hershey's Mr. Goodbar", 0.45, 12, true, true);
		CrispsItem doritos = new CrispsItem("Doritos", "Frito Lay Cheesey Corn Crisps", 0.80, 24, false);
		SodaWaterItem coke = new SodaWaterItem("Coke", "Flagship coca-cola product", 8, 0.80, true, true);
		
		System.out.println("Instantiate 1");
		System.out.println(peanutMMS);
		System.out.println(chocMMS);
		System.out.println(goobers);
		System.out.println(goodbar);
		System.out.println(doritos);
		System.out.println(coke);
		
		peanutMMS.addByOne();
		peanutMMS.addByOne();
		peanutMMS.addByOne();
		peanutMMS.addByOne();
		peanutMMS.addByOne();
		peanutMMS.addByOne();
		
		goodbar.addByOne();
		goodbar.addByOne();
		goodbar.addByOne();
		goodbar.addByOne();

		chocMMS.addByOne();
		chocMMS.addByOne();
		chocMMS.addByOne();
		chocMMS.addByOne();
		
		goobers.addByOne();
		goobers.addByOne();
		goobers.addByOne();
		goobers.addByOne();
		
		doritos.addByOne();
		doritos.addByOne();
		doritos.addByOne();
		doritos.addByOne();
		
		coke.addByOne();
		coke.addByOne();
		coke.addByOne();
		
		
		System.out.println("Instantiate several");
		System.out.println(peanutMMS);
		System.out.println(chocMMS);
		System.out.println(goobers);
		System.out.println(goodbar);
		System.out.println(doritos);
		System.out.println(coke);
	}
	
	@Override
	public String toString () {
		return "InventoryManager: \n" +
				"Collection = \n" + _col + "\n" +
				"Purchased Item = \n" + purchasedItem + "\n";
	}
}
