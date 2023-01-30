package rs.node.x;

public class Leg {
	private int amount;
	private Contract contract;
	private int price;

	private Leg() {
		super();
	}

	public Leg(int amount, Contract contract) {
		this.amount = amount;
		this.contract = contract;
	}

	public Leg(int amount, Contract contract, int price) {
		this.amount = amount;
		this.contract = contract;
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Contract getContract() {
		return contract;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
