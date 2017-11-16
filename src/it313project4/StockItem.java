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
	
	private String get_id() {
		return _id;
	}
	
	private void set_id(String _id) { this._id = _id; }
	
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
	
	public int	know_quantity() {
		return _quantity;
	}
	
	/**
	 *
	 * @param quantity
	 * @return
	 */
	private void set_quantity(int quantity) {
		//
		this._quantity = quantity;
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
	public StockItem(String _brandName, String _description, Double _price, int _quantity) {
		/* this._id = _id; */
		this._brandName = _brandName;
		this._description = _description;
		this._price = _price;
		this._quantity = _quantity;
		int new_quantity = _quantity;
		set_quantity(new_quantity);
		
	}
	
	@Override
	public String toString() {
		return ", Brand Name = " + _brandName +
				", Description = '" + _description + '\'' +
				", Price = $" + _price +
				", Quantity = " + _quantity;
	}
}
