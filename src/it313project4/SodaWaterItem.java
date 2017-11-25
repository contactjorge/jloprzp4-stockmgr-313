/**
 * Soda water child class to of stock item.
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 19th, 2017
 * @version 1.0.7 November 11, 2017
 *
 **/
package it313project4;

public class SodaWaterItem extends StockItem{
	private int $fluidOunce;
	private boolean $caffeine;
	private boolean $sweetened;
	private String $newID;
	
	private boolean is_caffeine() {
		return $caffeine;
	}
	
	private void set_caffeine(boolean _caffeine) {
		this.$caffeine = _caffeine;
	}
	
	private boolean is_sweetened() {
		return $sweetened;
	}
	
	private void set_sweetened(boolean _sweetened) {
		this.$sweetened = _sweetened;
	}
	
	private int get_fluidOunce() {
		return $fluidOunce;
	}
	
	private void set_fluidOunce(int _fluidOunce) {
		this.$fluidOunce = _fluidOunce;
	}
	
	private String prefix_id() {
		String prefix1 = "SW.";
		String prefix2 = "";
		String prefix3 = "";
		if (this.$sweetened) {
			prefix2 = "S";
		}
		else {
			prefix2 = "D";
		}
		if (this.$caffeine) {
			prefix3 = "C";
		}
		else {
			prefix3 = "F";
		}
		this.$newID = prefix1+ get_brandName().substring(0, 3).toUpperCase() + prefix2 + prefix3;
		return $newID;
	}
	
	public SodaWaterItem(String _brandName, String _description, int _fluidOunce, Double _price, boolean
			_caffeine, boolean _sweetened) {
		super(_brandName, _description, _price);
		String brand = _brandName;
		this.$caffeine = _caffeine;
		this.$sweetened = _sweetened;
		this.$fluidOunce = _fluidOunce;
		this.$newID = prefix_id();
		set_newID(this.$newID);
	}
	
	@Override
	public String toString () {
		return "SodaWaterItem: " + super.toString() +
				", Fluid Ounce = " + $fluidOunce +
				", Has caffeine? " + $caffeine +
				", Is sweetened? " + $sweetened;
	}
}
