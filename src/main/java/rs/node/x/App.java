package rs.node.x;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("app-view.fxml"));
		Scene scene = new Scene(fxmlLoader.load());
		stage.setTitle("Hello!");
		stage.setScene(scene);
		stage.show();
		
		// CustomControl customControl = new CustomControl();
		// customControl.setText("Hello!");
		//
		// stage.setScene(new Scene(customControl));
		// stage.setTitle("Custom Control");
		// stage.setWidth(300);
		// stage.setHeight(200);
		// stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}