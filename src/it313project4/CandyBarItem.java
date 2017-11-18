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
	private boolean _nuts;
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
	
	public boolean is_nuts () {
		return _nuts;
	}
	
	public void set_nuts (boolean _nuts) {
		this._nuts=_nuts;
	}
	
	public void set_newID(String _newID) {
		this._newID = _newID;
	}
	
	private String prefix_id(String brand) {
		String prefix1 = "CB.";
		String prefix2 = "";
		String prefix3 = "";
		if (_nuts) {
			prefix2 = "N";
		}
		else {
			prefix2 = "R";
		}
		
		if (_chocolate) {
			prefix3 = "CH";
		}
		else {
			prefix3 = "NC";
		}
		this._newID = prefix1 + brand.substring(0, 2).toUpperCase() + prefix2 + prefix3;
		return _newID;
	}
	
	public String get_newID() {
		return _newID;
	}
	
	public CandyBarItem(String _brandName, String _description, Double _price, int _barOunce, boolean _nuts, boolean
			_chocolate) {
		super(_brandName, _description, _price);
		String brand = _brandName;
		this._barOunce = _barOunce;
		this._chocolate = _chocolate;
		this._nuts = _nuts;
		this._newID = prefix_id(brand);
		set_newID(this._newID);
	}
	
	@Override
	public String toString () {
		return "CandyBarItem: " + super.toString() +
				", " + "Bar ounce = " + _barOunce +
				", Has Nuts? " + _chocolate +
				", Chocolate? " + _chocolate;
	}
	

}
