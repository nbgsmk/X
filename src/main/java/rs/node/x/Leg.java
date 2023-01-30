package rs.node.x;

public class Leg {
	private int amount;
	private String tip;
	private Contract contract;
	private int price;

	public Leg() {
		super();
	}

	public Leg(int amount, String tip) {
		super();
		this.amount = amount;
		this.tip = tip;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
