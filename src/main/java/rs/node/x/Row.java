package rs.node.x;

public class Row {
	private String ime = "a";
	private String prezime = "b";
	private Integer godine = 2;


	/*

	https://docs.oracle.com/javase/8/javafx/fxml-tutorial/custom_control.htm

	 */

	public Row() {
	}
	
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public Integer getGodine() {
		return godine;
	}
	
	public void setGodine(Integer godine) {
		this.godine = godine;
	}
}
