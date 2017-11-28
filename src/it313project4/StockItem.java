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
	private String $id;
	private String $brandName;
	private String $description;
	private Double $price;
	private int $quantity;
	
	/**
	 * set's id to generic prefix
	 */
	public void set_id () {
		this.$id= "SN";
	}
	
	
	/**
	 * Did I need the setter?
	 * @param _brandName
	 */
	private void setBrandName(String _brandName) {
		this.$brandName = _brandName;
	}
	
	/**
 	 * Did I need the setter?
	 * @param _description
	 */
	private void setDescription(String _description) {
		this.$description = _description;
	}
	
	/**
	 * Did I need the setter?
	 * @param _price
	 */
	private void setPrice(Double _price) {
		this.$price = _price;
	}
	
	/**
	 * @param _quantity
	 */
	private void setQuantity(int _quantity) {
		this.$quantity = _quantity;
	}
	
	
	/**
	 * getter for $id
	 * @return $id
	 */
	public String get_id() {
		return $id;
	}
	
	/**
	 * @return
	 */
	private String get_description() {
		return $description;
	}
	
	/**
	 * @return
	 */
	private Double get_price() {
		return $price;
	}
	
	/**
	 * @return
	 */
	private int get_quantity() {
		return $quantity;
	}
	
	
	/**
	 * @return
	 */
	public String get_brandName() {
		return $brandName;
	}
	
	/**
	 * @return
	 */
	public int	known_quantity() {
		return $quantity;
	}
	
	/**
	 *
	 */
	public void addByOne() {
		$quantity++;
	}
	
	/**
	 *
	 */
	public void removeByOne () {
		while ($quantity > 0 ) {
			$quantity--;
		}
	}
	
	/**
	 * @param newID
	 */
	public void set_newID(String newID) {
		 this.$id = newID;
	}
	
	/**
	 * @return
	 */
	public String display () {
		return "Item ID: " + $id +
				" BrandName: " + $brandName +
				" Quantity: " +	$quantity;
	}
	
	/**
	 * NoArg constructor.
	 */
	public StockItem() {
		$id = "";
		$quantity = 0;
		$brandName = "";
		$description = "";
		$price = 0.0;
	}
	
	/**
	 *
	 * Constructor with Arg
	 * @param _brandName
	 * @param _description
	 * @param _price
	 */
	public StockItem(String _brandName, String _description, Double _price) {
		this.set_id();
		this.$quantity = 0;
		this.$brandName = _brandName;
		this.$description = _description;
		this.$price = _price;
	}
	
	@Override
	public String toString() {
		return "ID = " + $id +
			", Brand Name = " + $brandName +
			", Description = '" + $description + '\'' +
			"\n" + "Price = $" + $price +
			", Quantity = " + $quantity;
	}
}
