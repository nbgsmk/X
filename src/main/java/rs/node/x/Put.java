package rs.node.x;

public class Put extends Contract {

	public Put(int strajk) {
		super(strajk);
	}

	@Override
	void setSkr(String s) {
		this.skr = "P";
	}

}
