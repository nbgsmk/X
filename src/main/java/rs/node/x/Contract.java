package rs.node.x;

public abstract class Contract {

	private int strajk;
	protected String skr;

	abstract void setSkr(String s);

	public Contract() {
	}

	public Contract(int strajk) {
		this.strajk = strajk;
	}

	public String getSkr() {
		return skr;
	}

	public int getStrajk() {
		return strajk;
	}



}
