package billing.model;

public class Product {

	private String productID;
	private String productName;
	private Byte productType;
	private Double unitPrice;

	public Product(String productID, String productName, Byte productType,
			Double unitPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productType = productType;
		this.unitPrice = unitPrice;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Byte getProductType() {
		return productType;
	}

	public void setProductType(Byte productType) {
		this.productType = productType;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double priceForQuantity(int quantity) {
		return this.unitPrice * quantity;
	}

}
