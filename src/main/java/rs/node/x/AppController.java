package rs.node.x;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import rs.node.x.customcontrol.CustomControl;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

	@FXML
	public ListView<Combo> lv_combo;
	public ObservableList<Combo> obs_combo;
	
	@FXML
	public ListView<Leg> lv_legs;
	public ObservableList<Leg> obs_legs;
	
	@FXML
	public Button b1;
	@FXML
	public Button b2;
	
	@FXML
	public ListView<CustomThing> lv_customthing;
	public ObservableList<CustomThing> obs_things;
	
	@FXML
	public ListView<Row> lv_rows;
	public ObservableList<Row> obs_rows;
	
	@FXML
	public Button b_kastom;
	
	
	private static int brojac;
	@FXML
	public VBox vb_kastom;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		obs_combo = FXCollections.observableArrayList();
		lv_combo.setItems(obs_combo);
		obs_combo.addAll(new Combo(), new Combo());
		lv_combo.setCellFactory(new Callback<ListView<Combo>, ListCell<Combo>>() {
			@Override
			public ListCell<Combo> call(ListView<Combo> param) {
				return new ComboCell();
			}
		});
		lv_combo.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				Combo c = obs_combo.get((Integer) newValue);
				obs_legs.clear();
				obs_legs.addAll(c.getLegs());
			}
		});

		
		obs_legs = FXCollections.observableArrayList();
		lv_legs.setItems(obs_legs);
		obs_legs.addAll(new Leg(4, new Put(120)), new Leg(7, new Call(119)));
		lv_legs.setCellFactory(new Callback<ListView<Leg>, ListCell<Leg>>() {
			@Override
			public ListCell<Leg> call(ListView<Leg> param) {
				return new LegCell();
			}
		});

		
		obs_things = FXCollections.observableArrayList();
		lv_customthing.setItems(obs_things);
		obs_things.addAll(new CustomThing("Cheese", 123), new CustomThing("Horse", 456), new CustomThing("Jam", 789));
		lv_customthing.setCellFactory(new Callback<ListView<CustomThing>, ListCell<CustomThing>>() {
			@Override
			public ListCell<CustomThing> call(ListView<CustomThing> param) {
				return new CustomListCell();
			}
		});




		obs_rows = FXCollections.observableArrayList();
		lv_rows.setItems(obs_rows);
		obs_rows.add(new Row());
		// lv_rows.setCellFactory(new Callback<ListView<Row>, ListCell<Row>>() {
		// 	@Override
		// 	public ListCell<Row> call(ListView<Row> param) {
		// 		return new RowController();
		// 	}
		// });
		
		
	}


	public void on_b1_click(ActionEvent actionEvent) {
		Combo c = new Combo();
		obs_combo.add(c);

	}

	public void on_b2_click(ActionEvent actionEvent) {
		Leg l = new Leg(17, new Call(400));
		l.setPrice(21);
		obs_legs.add(l);

		obs_rows.add(new Row());
	}
	
	
	public void on_b_kastom(ActionEvent actionEvent) {
		CustomControl customControl = new CustomControl();
		customControl.setText("Levo desno " + brojac++);
		vb_kastom.getChildren().add(customControl);
	}
}