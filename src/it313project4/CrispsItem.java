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
	
	/**
	 *
	 * @return
	 */
	private int getBagOunce() {
		return bagOunce;
	}
	
	/**
	 *
	 * @param bagOunce
	 */
	private void setBagOunce(int bagOunce) {
		this.bagOunce = bagOunce;
	}
	
	/**
	 *
	 * @param _baked
	 */
	private void set_baked(boolean _baked) {
		this._baked = _baked;
	}
	
	/**
	 *
	 * @return
	 */
	private boolean is_baked() { return _baked; }
	
	/**
	 *
	 * @param the_id
	 * @return
	 */
	private String new_id() {
		this._newID = "CP";
		return _newID;
	}
	
	/**
	 *
	 * @param _id
	 * @param _brandName
	 * @param _description
	 * @param _price
	 * @param bagOunce
	 * @param _baked
	 * @param quantity
	 */
	public CrispsItem(String _brandName, String _description, Double _price, int bagOunce, boolean
			_baked) {
		super(_brandName, _description, _price);
		this._newID = new_id();
		this.bagOunce = bagOunce;
		this._baked = _baked;
	}
	
	@Override
	public String toString () {
		return "CrispsItem: " +
				"ID = " + _newID + Integer.toString(get_id()) +
				", " + super.toString() +
				"\n" + "Bag Size = " + bagOunce + "Ounces" +
				", Baked of Fried? " + _baked + "\n";
	}
}
