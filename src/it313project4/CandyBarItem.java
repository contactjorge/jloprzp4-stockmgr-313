/**
 * Candy Bar child class to of stock item.
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 19th, 2017
 * @version 1.0.7 November 11, 2017
 *
 **/
package it313project4;

/**
 * Candybar Item child of Item
 */
public class CandyBarItem extends StockItem {
	private int $barOunce;
	private boolean $chocolate;
	private boolean $nuts;
	private String $newID;
	
	private int get_barOunce() {
		return $barOunce;
	}
	
	private void set_barOunce(int _barOunce) {
		this.$barOunce = _barOunce;
	}
	
	private boolean is_chocolate() {
		return $chocolate;
	}
	
	private void set_chocolate(boolean _chocolate) {
		this.$chocolate = _chocolate;
	}
	
	public boolean is_nuts () {
		return $nuts;
	}
	
	public void set_nuts (boolean _nuts) {
		this.$nuts=_nuts;
	}
	
	private String prefix_id(String brand) {
		String prefix1 = "CB.";
		String prefix2 = "";
		String prefix3 = "";
		if ($nuts) {
			prefix2 = "N";
		}
		else {
			prefix2 = "R";
		}
		
		if ($chocolate) {
			prefix3 = "CH";
		}
		else {
			prefix3 = "NC";
		}
		this.$newID = prefix1 + brand.substring(0, 2).toUpperCase() + prefix2 + prefix3;
		return $newID;
	}
	
	/**
	 * NoArg constructor
	 */
	public CandyBarItem () {
		$barOunce = 0;
		$chocolate = false;
		$nuts = false;
		$newID = "";
	}
	
	/**
	 * Constructor with Arguments
	 * @param _brandName
	 * @param _description
	 * @param _price
	 * @param _barOunce
	 * @param _nuts
	 * @param _chocolate
	 */
	public CandyBarItem(String _brandName, String _description, Double _price, int _barOunce, boolean _nuts, boolean
			_chocolate) {
		super(_brandName, _description, _price);
		String brand = _brandName;
		this.$barOunce = _barOunce;
		this.$chocolate = _chocolate;
		this.$nuts = _nuts;
		this.$newID = prefix_id(brand);
		set_newID(this.$newID);
	}
	
	@Override
	public String toString () {
		return "CandyBarItem: " + super.toString() +
				", " + "Bar ounce = " + $barOunce +
				", Has Nuts? " + $chocolate +
				", Chocolate? " + $chocolate;
	}
	

}
