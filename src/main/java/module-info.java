module rs.node.x {
	requires javafx.controls;
	requires javafx.fxml;


	opens rs.node.x to javafx.fxml;
	exports rs.node.x;
}