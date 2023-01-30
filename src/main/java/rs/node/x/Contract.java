package rs.node.x;

public class Contract {
	private int strajk;
	protected String shortName;

	public Contract() {
	}

	public Contract(int strajk) {
		this.strajk = strajk;
	}

	public String getShortName() {
		return shortName;
	}

	public int getStrajk() {
		return strajk;
	}

}
