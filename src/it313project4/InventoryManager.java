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
		//ArrayList<StockItem> items = new ArrayList<>();
		
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
			if (itemID.equalsIgnoreCase(item.get_id()))
			{
				return item.toString() + " Found.";
			}
		}
		return "Item not found";
	}
	
	/**
	 *
	 * @param the_collection
	 */
	public void displayItem (ArrayList<StockItem> the_collection) {
		//Display All Stock Items
		System.out.println(the_collection.toString());
	}
	
	/**
	 *
	 * @return
	 */
	public StockItem getPurchasedItem () {
		//Get the purchased Item
		return purchasedItem;
	}
	
	/**
	 *
	 * @param the_collection
	 */
	public void removePurchasedItem (ArrayList<StockItem> the_collection) {
		this._col = the_collection;
		//return the_collection;
	}
	
	public InventoryManager () {
		
		CandyBarItem goodbarLot = new CandyBarItem("001", "Mr. Goodbar", "Hershey's Mr. Goodbar", 0.45, 12, true, 32);
		CandyBarItem mmsLot = new CandyBarItem("002", "Peanut M&Ms", "Mars M&M's Peanut", 0.45, 12, true, 32);
		CrispsItem doritosLot = new CrispsItem("001", "Doritos", "Frito Lay Cheesey Corn Crisps", 0.80, 24, false, 16);
		CrispsItem laysLot = new CrispsItem("002", "Lay's", "Frito Lay Flagship product", 0.80, 24, false, 12);
		SodaWaterItem cokeLot = new SodaWaterItem("001", "Coke", "Flagship coca-cola product", 8, 0.80, true,
				true, 36);
		SodaWaterItem cokeDietLot = new SodaWaterItem("002", "Diet Coke", "Flagship diet coca-cola product", 8, 0.80,
				false, true, 36);
		SodaWaterItem cokeDietFreeLot = new SodaWaterItem("003", "Sprite", "Lemon lime coca-cola product", 8, 0.80,
				false, false, 36);
		SodaWaterItem spriteLot = new SodaWaterItem("004", "Sprite", "Lemon lime coca-cola product", 8, 0.80, false,
				true, 36);
		SodaWaterItem spriteDietLot = new SodaWaterItem("005", "Diet Sprite", "Lemon lime coca-cola product", 8, 0.80,
				false, false, 36);
		
		
		
		this.addItem(goodbarLot);
		this.addItem(mmsLot);
		this.addItem(doritosLot);
		this.addItem(laysLot);
		this.addItem(cokeLot);
		this.addItem(cokeLot);
		this.addItem(cokeDietLot);
		this.addItem(cokeDietFreeLot);
		this.addItem(spriteLot);
		this.addItem(spriteDietLot);
		
		int i = 0;
		while (i < 33){
			mmsLot.removeByOne();
			i++;
		}
		
		displayAll();
		System.out.println("Do you have Diet Sprite? " + this.find(spriteDietLot));
		System.out.println("Do you have M&Ms? " + this.find(mmsLot));
		System.out.println("Do you have lays? " + this.find(laysLot));
		System.out.println("Do you have Coke? " + this.find(cokeLot));
		System.out.println("Do you have CB001? " + this.getItembyID( "001"));
	}
	
	@Override
	public String toString () {
		return "InventoryManager: \n" +
				"Collection = \n" + _col + "\n" +
				"Purchased Item = \n" + purchasedItem + "\n";
	}
}
