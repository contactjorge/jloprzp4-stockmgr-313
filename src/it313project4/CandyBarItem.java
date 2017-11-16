/**
 * Candy Bar child class to of stock item.
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 19th, 2017
 * @version 1.0.7 November 11, 2017
 *
 **/
package it313project4;

public class CandyBarItem extends StockItem {
	private int _barOunce;
	private boolean _chocolate;
	private String _newID;
	
	private int get_barOunce() {
		return _barOunce;
	}
	
	private void set_barOunce(int _barOunce) {
		this._barOunce = _barOunce;
	}
	
	private boolean is_chocolate() {
		return _chocolate;
	}
	
	private void set_chocolate(boolean _chocolate) {
		this._chocolate = _chocolate;
	}
	
	private String new_id (String the_id) {
		String appendID = "CB" + the_id;
		return appendID;
	}
	
	public CandyBarItem(String _id, String _brandName, String _description, Double _price, int _barOunce, boolean
			_chocolate, int _quantity) {
		super(_brandName, _description, _price, _quantity);
		this._newID = new_id(_id);
		this._barOunce = _barOunce;
		this._chocolate = _chocolate;
		
	}
	
	@Override
	public String toString () {
		return "CandyBarItem: " +
				"ID = " + _newID +
				", " + super.toString() +
				"\n" + "Bar ounce = " + _barOunce +
				", Chocolate? " + _chocolate + "\n";
	}
}
