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
	
	private String new_id() {
		this._newID = "SW";
		return _newID;
	}
	
	public SodaWaterItem(String _brandName, String _description, int _fluidOunce, Double _price, boolean
			_caffeine, boolean _sweetened) {
		super(_brandName, _description, _price);
		this._newID = new_id();
		this._caffeine = _caffeine;
		this._sweetened = _sweetened;
		this._fluidOunce = _fluidOunce;
	}
	
	@Override
	public String toString () {
		return "SodaWaterItem: " + "ID = " + _newID +
				", " + super.toString() + Integer.toString(get_id()) +
				"\n" + "Fluid Ounce = " + _fluidOunce +
				", Has caffeine? " + _caffeine +
				", Is sweetened? " + _sweetened + "\n";
	}
}
