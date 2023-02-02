package rs.node.x;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Row_item {
	// private StringProperty ime;
	// private StringProperty prezime;
	// private IntegerProperty godine;


	/*

	https://docs.oracle.com/javase/8/javafx/fxml-tutorial/custom_control.htm

	 */

	public Row_item() {
	}

	public int getGodine(int god){
		return godine.get();
	}

	public void setGodine(int god){
		godine.set(god);
	}



}
