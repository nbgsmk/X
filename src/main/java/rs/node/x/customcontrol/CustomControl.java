package rs.node.x.customcontrol;

import java.io.IOException;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import rs.node.x.App;

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

public class CustomControl extends HBox {
	@FXML private TextField textField;
	
	public CustomControl() {
		// FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom_control.fxml"));
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("custom_control.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
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
}