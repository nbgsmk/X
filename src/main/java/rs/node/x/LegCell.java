package rs.node.x;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class LegCell extends ListCell<Leg> {
	private HBox content;
	private Text t_amt;
	private Text t_tip;
	private Text t_px;

	public LegCell() {
		super();
		t_amt = new Text();
		t_tip = new Text();
		t_px = new Text();
		HBox hBox = new HBox(t_amt, t_tip, t_px);
		content = new HBox(new Label("[Graphic]"), hBox);
		content.setSpacing(10);
	}

	@Override
	protected void updateItem(Leg item, boolean empty) {
		super.updateItem(item, empty);
		if (item != null && !empty) { // <== test for null item and empty parameter
			t_amt.setText(String.valueOf(item.getAmount()));
			t_tip.setText(item.getContract().getShortName() + " " + item.getContract().getStrajk());
			t_px.setText(String.format(" @ %d $", item.getPrice()));
			setGraphic(content);
		} else {
			setGraphic(null);
		}
	}
}