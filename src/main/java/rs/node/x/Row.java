package rs.node.x;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;

import java.io.IOException;

public class Row extends ListCell<Row_item> {
	// @FXML
	public Label lab1;
	// @FXML
	public Label lab2;
	// @FXML
	public Spinner<Integer> spin1;
	// @FXML
	public Spinner<Integer> spin2;
	// @FXML
	public RadioButton rb1;
	// @FXML
	public ToggleGroup tgr;
	// @FXML
	public RadioButton rb2;

	public Row() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("row.fxml"));
		loader.setRoot(this);
		loader.setController(this);
		try {
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public Label getLab1() {
		return lab1;
	}

	public Label getLab2() {
		return lab2;
	}

	public void setLab1(String s) {
		this.lab1.setText(s);
	}

	public void setLab2(String s) {
		this.lab2.setText(s);
	}
}
