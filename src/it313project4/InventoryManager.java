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
	
	private void set_col (ArrayList<StockItem> _col) {
		this._col = _col; //mutator for the _col instance variable
	}
	//done
	
	private ArrayList<StockItem> get_col () {
		return _col; //getter for the _col instance variable
	}
	//done
	
	private void display (StockItem the_item) {
		//Display All Stock Items
		System.out.println(the_item);
	}
	
	private void displayAll () {
		//Display All Stock Items
		for(StockItem the_item : _col) {
			System.out.println(the_item);
		}
		
	}
	//done
	
	private String find (StockItem the_item) {
		
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
	//not tested
/**
	private int getItembyID (StockItem purchasedItem) {
		String itemID = purchasedItem.get_id();
		
		for(StockItem item : this._col)
		{
			if (itemID.equals(item.get_id()))
			{
				System.out.println(_col.indexOf(item));
				_col.indexOf(item);
			}
		}
		return -1;
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
	

	
	private int getItembyID (StockItem purchasedItem) {
		String itemID = purchasedItem.get_id();
		int i= 0;
		for(StockItem item : this._col )
		{
			if (itemID.equals(item.get_id()))
			{
				System.out.println(i);
				System.out.println(itemID);
				return i;
			}
			i++;
		}
		return -1;
	}
**/

private String getItembyID (StockItem purchasedItem) {
	String itemID = purchasedItem.get_id();
	int i = 0;
	
	for(StockItem item : this._col)
		{
			System.out.println(itemID);
			System.out.println(i);
			if (itemID.equals(item.get_id()))
			{
				
				return itemID  + " Found.";
			}
			i++;
		}
		return "Item not found";
	}
	//not tested
	
	private void addItem (StockItem the_purchasedItem, int quantity) {
		// Add current message to beginning of archive.
		int i = 0;
		while (i < quantity ) {
			the_purchasedItem.addByOne();
			this._col.add(the_purchasedItem);
			i++;
		}
	}
	//done
	
	private void removeItem (StockItem the_purchasedItem) {
		String itemID = getItembyID(the_purchasedItem);
			_col.remove(itemID); //return the_collection;
	}
	//not tested
	
	public InventoryManager () {
		this._col = _col;
	}
	
	@Override
	public String toString () {
		return "InventoryManager: \n" +
				"Collection = \n" + _col + "\n";
	}
}
