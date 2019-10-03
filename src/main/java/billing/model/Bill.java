package billing.model;

import java.util.List;

public class Bill {
	private String billId;
	private Double amount;
	private List<Product> cart;

	public Bill() {
	}

	public Bill(String billId, Double amount, List<Product> cart) {
		this.billId = billId;
		this.amount = amount;
		this.cart = cart;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public List<Product> getCart() {
		return cart;
	}

	public void setCart(List<Product> cart) {
		this.cart = cart;
	}

	public Double getTotalAmount() {
		double sum = 0.0;
		for (Product product : cart) {
			sum = +product.getUnitPrice();
		}
		return sum;
	}

	public Double getTotalForProduct(Byte productType) {
		double sum = 0.0;
		for (Product product : cart) {
			if (productType.equals(product.getProductType())) {
				sum = +product.getUnitPrice();
			}
		}
		return sum;
	}

	public Double getTotalExceptProduct(Byte productType) {
		double sum = 0.0;
		for (Product product : cart) {
			if (!productType.equals(product.getProductType())) {
				sum = +product.getUnitPrice();
			}
		}
		return sum;
	}

}
