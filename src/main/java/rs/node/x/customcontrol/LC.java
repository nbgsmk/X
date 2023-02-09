package rs.node.x.customcontrol;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.HBox;
import rs.node.x.App;

import java.io.IOException;

/*

// Ovako moze da se koristi u main aplikaciji

		// CustomControl customControl = new CustomControl();
		// customControl.setText("Hello World!");
		//
		// stage.setScene(new Scene(customControl));
		// stage.setTitle("Custom Control");
		// stage.setWidth(300);
		// stage.setHeight(200);
		// stage.show();

// Ovako negde drugde u kodu, kao deo UI
		// // HBox hbox = new HBox();
		// CustomControl customControl = new CustomControl();
		// customControl.setText("Hello World!");
		// // hbox.getChildren().add(customControl);


 */

public class LC extends HBox {
	
	@FXML
	public Spinner<Integer> lc_spin;
	@FXML
	private TextField textField;
	
	public LC() {
		// FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("lc.fxml"));
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("lc.fxml"));
		fxmlLoader.setController(this);
		fxmlLoader.setRoot(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		
		lc_spin.setValueFactory(new SpinnerValueFactory<Integer>() {
			@Override
			public void decrement(int steps) {
			
			}
			
			@Override
			public void increment(int steps) {
			
			}
		});
		
		lc_spin.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(-3, 3, 0, 1));
		lc_spin.getValueFactory().setWrapAround(true);
		
		
	}
	
	public String getText() {
		return textProperty().get();
	}
	
	public void setText(String value) {
		textProperty().set(value);
	}
	
	public StringProperty textProperty() {
		return textField.textProperty();
	}
	
	@FXML
	protected void doSomething() {
		System.out.println("The button was clicked!");
	}
	
	@FXML
	public void skrol(ScrollEvent scrollEvent) {
		if (scrollEvent.getDeltaY() > 0) {
			lc_spin.increment();
		} else {
			lc_spin.decrement();
		}
		System.out.println("evo ga : " + lc_spin + " = " + lc_spin.getValueFactory().getValue());
		// leg.getContract().setStrajk(strajk.getValue());
	}
}