package rs.node.x;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

	public ListView<Contract> lv_contract;
	public ObservableList<Contract> obs_contract;

	public ListView<Leg> lv_legs;
	public ObservableList<Leg> obs_legs;

	public Button b1;
	public Button b2;

	public ListView<CustomThing> lv_customthing;
	public ObservableList<CustomThing> obs_things;


	@FXML
	private Label welcomeText;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		obs_contract = FXCollections.observableArrayList();
		lv_contract.setItems(obs_contract);

		obs_legs = FXCollections.observableArrayList();
		lv_legs.setItems(obs_legs);

		obs_things = FXCollections.observableArrayList();
		lv_customthing.setItems(obs_things);
		obs_things.addAll(new CustomThing("Cheese", 123), new CustomThing("Horse", 456), new CustomThing("Jam", 789));

		lv_customthing.setCellFactory(new Callback<ListView<CustomThing>, ListCell<CustomThing>>() {
			@Override
			public ListCell<CustomThing> call(ListView<CustomThing> param) {
				return new CustomListCell();
			}
		});



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