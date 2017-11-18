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

public class InventoryManager {
	private static final long serialVersionUID = 4L;
	
	private ArrayList<StockItem> _col = new ArrayList<>(); //_col instance variable for the collection of Stock
	
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
	private ArrayList<StockItem> get_col () {
		return _col; //getter for the _col instance variable
	}
	
	/**
	 *
	 */
	public void displayAll () {
		//Display All Stock Items
		for(StockItem the_item : _col) {
			System.out.println(the_item);
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
	
	/**
	 *
	 * @return
	 */
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
	
	private void addItem (StockItem the_purchasedItem, int quantity) {
		// Add current message to beginning of archive.
		int i = 1;
		do {
			the_purchasedItem.addByOne();
			this._col.add(the_purchasedItem);
			i++;
		}
		while (i < quantity );
	}
	
	/**
	 *
	 * @param purchasedItem
	 */
	public void removeItem (StockItem the_purchasedItem) {
		_col.remove(the_purchasedItem); //return the_collection;
	}
	
	public InventoryManager () {
		this._col = _col;
		
		CandyBarItem peanutMMS = new CandyBarItem("MMS Peanut", "MARS M&M's", 0.45, 12, true, true);
		CandyBarItem chocMMS = new CandyBarItem("MMS Chocolate", "MARS M&M's", 0.45, 12, false, true);
		CandyBarItem goobers = new CandyBarItem("Goobers", "Nestle' Goobers", 0.45, 12, true, true);
		CandyBarItem goodbar = new CandyBarItem("Mr. Goodbar", "Hershey's Mr. Goodbar", 0.45, 12, true, true);
		CrispsItem doritos = new CrispsItem("Doritos", "Frito Lay Cheesey Corn Crisps", 0.80, 24, false);
		SodaWaterItem coke = new SodaWaterItem("Coke", "Flagship coca-cola product", 8, 0.80, true, true);
		
		System.out.println("Instantiate 1");
		System.out.print("-------------------\n");
		System.out.println(peanutMMS);
		System.out.println(chocMMS);
		System.out.println(goobers);
		System.out.println(goodbar);
		System.out.println(doritos);
		System.out.println(coke);
		
		addItem(peanutMMS, 32);
		addItem(chocMMS, 32);
		addItem(goobers, 12);
		addItem(goodbar, 12);
		
		addItem(doritos, 24);
		addItem(coke, 1);
		addItem(coke, 1);
		
		removeItem(peanutMMS);
		removeItem(peanutMMS);
		removeItem(chocMMS);
		
		System.out.print("\n");
		System.out.println("Instantiate several");
		System.out.print("-------------------\n");
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
				"Collection = \n" + _col + "\n";
	}
}
