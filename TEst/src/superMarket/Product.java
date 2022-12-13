package superMarket;
public class Product {
	private String itemName;
	private double netQuantity;
	private double price;
	public Product(String itemName, double netQuantity, double price) {
		this.itemName = itemName;
		this.netQuantity = netQuantity;
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getNetQuantity() {
		return netQuantity;
	}
	public void setNetQuantity(double netQuantity) {
		this.netQuantity = netQuantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
