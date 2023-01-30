package rs.node.x;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class Combo {
	private final ObservableList<Leg> legs = FXCollections.observableArrayList();


	public Combo() {
		randomLeg();
		randomLeg();

	}


	private void randomLeg(){
		Random amt = new Random();
		Random strk = new Random();
		Random px = new Random();
		Leg l = new Leg(amt.nextInt(3), new Call(strk.nextInt(400)), px.nextInt(10));
		legs.add(l);
	}


	public String getDescription(){
		String s = "";
		for (Leg l : legs){
			s += l.getContract().getSkr();
			s += " ";
			s += l.getContract().getStrajk();

		}
		return s;
	}

	public ObservableList<Leg> getLegs() {
		return legs;
	}
}
