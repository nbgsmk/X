package rs.node.x;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class ComboCell extends ListCell<Combo> {
	private final HBox content;
	private final Text txt;


	public ComboCell() {
		super();
		this.txt = new Text();
		HBox hBox = new HBox(txt);
		content = new HBox(new Label("combo je: "), hBox);
		content.setSpacing(10);
	}

	@Override
	protected void updateItem(Combo combo, boolean empty) {
		super.updateItem(combo, empty);
		if (combo != null && !empty) { // <== test for null combo and empty parameter
			txt.setText(combo.getDescription());
			setGraphic(content);
		} else {
			setGraphic(null);
		}
	}
}
