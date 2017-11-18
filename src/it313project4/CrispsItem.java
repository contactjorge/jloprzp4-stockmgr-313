/**
 * Candy Bar child class to of stock item.
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 19th, 2017
 * @version 1.0.7 November 11, 2017
 *
 **/
package it313project4;

public class CrispsItem extends StockItem {
	private int bagOunce;
	private boolean _baked;
	private String _newID;
	
	private int getBagOunce() {
		return bagOunce;
	}
	
	private void setBagOunce(int bagOunce) {
		this.bagOunce = bagOunce;
	}
	
	private void set_baked(boolean _baked) {
		this._baked = _baked;
	}
	
	private boolean is_baked() { return _baked; }
	
	public String prefix_id(String brand) {
		String prefix1 = "CP.";
		String prefix2 = "";
		if (_baked) {
			prefix2 = "BA";
		}
		else {
			prefix2 = "FR";
		}
		this._newID = prefix1 + brand.substring(0, 3).toUpperCase() + prefix2;
		return _newID;
	}
	
	public CrispsItem(String _brandName, String _description, Double _price, int bagOunce, boolean
			_baked) {
		super(_brandName, _description, _price);
		String brand = _brandName;
		this._baked = _baked;
		this.bagOunce = bagOunce;
		this._newID = prefix_id(brand);
		set_newID(this._newID);
	}
	
	@Override
	public String toString () {
		return "CrispsItem: " + super.toString() +
				", Bag Size = " + bagOunce + "Ounces" +
				", Baked of Fried? " + _baked;
	}
}
