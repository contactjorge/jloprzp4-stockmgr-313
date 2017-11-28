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
 * Sub class for Item based on chips or crisps
 */
public class CrispsItem extends StockItem {
	private int $bagOunce;
	private boolean $baked;
	private String $newID;
	
	/**
	 * @return $bagOunce var
	 */
	private int getBagOunce() {
		return $bagOunce;
	}
	
	private void setBagOunce(int bagOunce) {
		this.$bagOunce = bagOunce;
	}
	
	private void set_baked(boolean _baked) {
		this.$baked = _baked;
	}
	
	private boolean is_baked() { return $baked; }
	
	/**
	 * @param brand
	 * @return prefix for new id
	 */
	public String prefix_id(String brand) {
		String prefix1 = "CP.";
		String prefix2 = "";
		if ($baked) {
			prefix2 = "BA";
		}
		else {
			prefix2 = "FR";
		}
		this.$newID = prefix1 + brand.substring(0, 3).toUpperCase() + prefix2;
		return $newID;
	}
	
	/**
	 * NoArg Contructor
	 */
	public CrispsItem () {
		$baked = false;
		$bagOunce = 0;
		$newID = "";
	}
	
	/**
	 * Constructor with args
	 * @param _brandName
	 * @param _description
	 * @param _price
	 * @param _bagOunce
	 * @param _baked
	 */
	public CrispsItem(String _brandName, String _description, Double _price, int _bagOunce, boolean
			_baked) {
		super(_brandName, _description, _price);
		String brand = _brandName;
		this.$baked = _baked;
		this.$bagOunce = _bagOunce;
		this.$newID = prefix_id(brand);
		set_newID(this.$newID);
	}
	
	@Override
	public String toString () {
		return "CrispsItem: " + super.toString() +
				", Bag Size = " + $bagOunce + "Ounces" +
				", Baked of Fried? " + $baked;
	}
}
