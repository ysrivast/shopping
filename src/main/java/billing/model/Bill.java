package billing.model;

public class Bill {
	private String billId;
	private Double amount;
	private Byte itemType;

	public Bill() {
	}

	public Bill(String billId, Double amount, Byte itemType) {
		super();
		this.billId = billId;
		this.amount = amount;
		this.itemType = itemType;
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

	public Byte getItemType() {
		return itemType;
	}

	public void setItemType(Byte itemType) {
		this.itemType = itemType;
	}

}
