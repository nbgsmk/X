package rs.node.x;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

	public ListView<Contract> lv_contract;
	public ObservableList<Contract> obs_contract;

	public ListView<Leg> lv_legs;
	public Button b1;
	public Button b2;



	@FXML
	private Label welcomeText;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		obs_contract = FXCollections.observableArrayList();
		lv_contract.setItems(obs_contract);

	}


	public void on_b1_click(ActionEvent actionEvent) {
		Contract c = new Contract();
		obs_contract.add(c);

	}

	public void on_b2_click(ActionEvent actionEvent) {
	}


	@FXML
	protected void onHelloButtonClick() {
		welcomeText.setText("Welcome to JavaFX Application!");
	}

}