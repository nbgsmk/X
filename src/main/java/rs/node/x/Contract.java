package rs.node.x;

public class Contract {
	private int strajk;
	private String shortName;

	public Contract() {
	}

	public Contract(int strajk) {
		this.strajk = strajk;
	}

	public String getShortName() {
		return shortName;
	}

	protected void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getStrajk() {
		return strajk;
	}

}
