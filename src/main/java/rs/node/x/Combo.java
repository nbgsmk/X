package rs.node.x;

import javafx.collections.ObservableList;

import java.util.List;
import java.util.Random;

public class Combo {
	private ObservableList<Leg> legs;


	public Combo() {

	}


	private void random(){
		Random amt = new Random();
		Random strk = new Random();
		Random px = new Random();
		Leg l = new Leg(amt.nextInt(3), new Call(strk.nextInt(400)), px.nextInt(10));
		legs.add(l);
	}

}
