/**
 * Soda water child class to of stock item.
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 19th, 2017
 * @version 1.0.7 November 11, 2017
 *
 **/
package it313project4;

/**
 *
 */
public class SodaWaterItem extends StockItem{
	private int _fluidOunce;
	private boolean _caffeine;
	private boolean _sweetened;
	private String _newID;
	
	private boolean is_caffeine() {
		return _caffeine;
	}
	
	private void set_caffeine(boolean _caffeine) {
		this._caffeine = _caffeine;
	}
	
	private boolean is_sweetened() {
		return _sweetened;
	}
	
	private void set_sweetened(boolean _sweetened) {
		this._sweetened = _sweetened;
	}
	
	private int get_fluidOunce() {
		return _fluidOunce;
	}
	
	private void set_fluidOunce(int _fluidOunce) {
		this._fluidOunce = _fluidOunce;
	}
	
	private String prefix_id(String brand) {
		String prefix1 = "SW.";
		String prefix2 = "";
		String prefix3 = "";
		if (_sweetened) {
			prefix2 = "S";
		}
		else {
			prefix2 = "D";
		}
		if (_caffeine) {
			prefix3 = "C";
		}
		else {
			prefix3 = "F";
		}
		this._newID = prefix1+ brand.substring(0, 3).toUpperCase() + prefix2 + prefix3;
		return _newID;
	}
	
	
	public SodaWaterItem(String _brandName, String _description, int _fluidOunce, Double _price, boolean
			_caffeine, boolean _sweetened) {
		super(_brandName, _description, _price);
		String brand = _brandName;
		this._caffeine = _caffeine;
		this._sweetened = _sweetened;
		this._fluidOunce = _fluidOunce;
		
		this._newID = prefix_id(brand);
	}
	
	@Override
	public String toString () {
		return "SodaWaterItem: " + "ID = " + _newID +
				", Fluid Ounce = " + _fluidOunce +
				", " + super.toString() +
				", Has caffeine? " + _caffeine +
				", Is sweetened? " + _sweetened;
	}
}
