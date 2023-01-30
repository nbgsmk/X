package rs.node.x;

public class Call extends Contract {

	public Call(int strajk) {
		super(strajk);
	}

	@Override
	void setSkr(String s) {
		this.skr = "C";
	}

}
