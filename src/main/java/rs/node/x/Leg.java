package rs.node.x;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Leg extends ListCell<CustomThing> {
	private HBox content;
	private Text name;
	private Text price;

	public Leg() {
		super();
		name = new Text();
		price = new Text();
		VBox vBox = new VBox(name, price);
		content = new HBox(new Label("[Graphic]"), vBox);
		content.setSpacing(10);
	}

	@Override
	protected void updateItem(CustomThing item, boolean empty) {
		super.updateItem(item, empty);
		if (item != null && !empty) { // <== test for null item and empty parameter
			name.setText(item.getName());
			price.setText(String.format("%d $", item.getPrice()));
			setGraphic(content);
		} else {
			setGraphic(null);
		}
	}
}