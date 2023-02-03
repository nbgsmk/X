package rs.node.x;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class RowController extends ListCell<Row> implements Initializable {
	@FXML
	public AnchorPane panel;
	@FXML
	public Label lab1;
	@FXML
	public Label lab2;
	@FXML
	public Spinner<Integer> spin1;
	@FXML
	public Spinner<Integer> spin2;
	@FXML
	public RadioButton rb1;
	@FXML
	public ToggleGroup tgr;
	@FXML
	public RadioButton rb2;
	FXMLLoader loader;
	
	public RowController() {
		// loader = new FXMLLoader(App.class.getResource("row.fxml"));
	
	}
	
	@Override
	protected void updateItem(Row row, boolean empty) {
		super.updateItem(row, empty);
		if (row != null && !empty) {
			FXMLLoader loader = new FXMLLoader(App.class.getResource("row.fxml"));
			// loader.setController(this);
			try {
				loader.load();
				// loader.setRoot(this);
			} catch (IOException e) {
				e.printStackTrace();
			}
			lab1.setText(row.getIme());
			lab2.setText(row.getPrezime());
			setGraphic(panel);
		} else {
			setGraphic(null);
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
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lab1.setText("row.getIme()");
	}
}
