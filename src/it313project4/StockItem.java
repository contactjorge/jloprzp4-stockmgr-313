/**
 * Stock Item super class for candy bar, crisps, soda water child classes.
 *
 * @author Jorge Lopez
 * @version 1.0.0 June 12th, 2017
 * @version 1.0.19 November 11, 2017
 *
 **/
package it313project4;

public class StockItem {
	private String _id;
	private String _brandName;
	private String _description;
	private Double _price;
	private int _quantity;
	
	public void set_id () {
		this._id= "SN";
	}
	
	public String get_id() {
		return _id;
	}
	
	/**
	 *
	 * @param _brandName
	 */
	private void set_brandName(String _brandName) {
		this._brandName = _brandName;
	}
	
	public String get_brandName() {
		return _brandName;
	}
	
	/**
	 *
	 * @return
	 */
	private void set_description(String _description) {
		this._description = _description;
	}
	
	/**
	 *
	 * @return
	 */
	private String get_description() {
		return _description;
	}
	
	/**
	 *
	 * @return
	 */
	private Double get_price() {
		return _price;
	}
	
	private void set_price(Double _price) {
		this._price = _price;
	}
	
	private int get_quantity() {
		return _quantity;
	}
	
	public int	known_quantity() {
		return _quantity;
	}
	
	/**
	 *
	 */
	private void set_quantity() {
		this.addByOne();
	}
	
	public void addByOne() {
		_quantity++;
	}
	
	public void removeByOne () {
		while (_quantity > 0 ) {
			_quantity--;
		}
	}
	
	/**
	 *
	 * @param _brandName
	 * @param _description
	 * @param _price
	 */
	public StockItem(String _brandName, String _description, Double _price) {
		this.set_quantity();
		this.set_id();
		this._brandName = _brandName;
		this._description = _description;
		this._price = _price;
	
	}
	
	@Override
	public String toString() {
		return ", Brand Name = " + _brandName +
				", Description = '" + _description + '\'' +
				", Price = $" + _price +
				", Quantity = " + _quantity;
	}
}
