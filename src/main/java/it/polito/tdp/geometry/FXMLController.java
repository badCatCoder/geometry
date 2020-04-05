package it.polito.tdp.geometry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {
	public rettangolo rect;
	public boolean initRettangolo() {

		String baseS = this.in_base.getText();
		if (baseS.length() == 0) {
			this.lblError.setText("Inserisi un valore per la base!");
			return false;
		}
		int base = 1;

		try {
			base = Integer.parseInt(baseS);
		} catch (NumberFormatException e) {
			this.lblError.setText("Devi inserire un numero per la base!");
			return false;
		}

		String altezzaS = this.in_altezza.getText();
		if (altezzaS.length() == 0) {
			this.lblError.setText("Inserisi un valore per l'altezza!");
			return false;
		}
		int altezza = 1;
		try {
			altezza = Integer.parseInt(altezzaS);
		} catch (NumberFormatException e) {
			this.lblError.setText("Devi inserire un numero per l'altezza!");
			return false;
		}

		rect.setBase(base);
		rect.setAltezza(altezza);
		return true;
	}

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Label txtBase;

	@FXML
	private TextField in_base;

	@FXML
	private Label txtAltezza;

	@FXML
	private TextField in_altezza;

	@FXML
	private Button btnPerimetro;

	@FXML
	private Label lblPerimetro;

	@FXML
	private Button btnArea;

	@FXML
	private Label lblArea;

	@FXML
	private Label lblError;

	@FXML
	void handlerCalcolaArea(ActionEvent event) {
		boolean ca = this.initRettangolo();
		if (!ca) {
			this.lblError.setText("");
			this.lblArea.setText("" + rect.calcolaArea());
		} else {
			this.lblError.setText("errore di calcolo");
		}

	}

	@FXML
	void handlerCalcolaPerimetro(ActionEvent event) {
		boolean cp = this.initRettangolo();
		if (!cp) {
			this.lblError.setText("");
			this.lblPerimetro.setText("" + rect.calcolaPerimetro());
		} else {
			this.lblError.setText("errore di calcolo");

		}
	}

	@FXML
	void initialize() {
		assert txtBase != null : "fx:id=\"txtBase\" was not injected: check your FXML file 'Scene.fxml'.";
		assert in_base != null : "fx:id=\"in_base\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtAltezza != null : "fx:id=\"txtAltezza\" was not injected: check your FXML file 'Scene.fxml'.";
		assert in_altezza != null : "fx:id=\"in_altezza\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnPerimetro != null : "fx:id=\"btnPerimetro\" was not injected: check your FXML file 'Scene.fxml'.";
		assert lblPerimetro != null : "fx:id=\"lblPerimetro\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnArea != null : "fx:id=\"btnArea\" was not injected: check your FXML file 'Scene.fxml'.";
		assert lblArea != null : "fx:id=\"lblArea\" was not injected: check your FXML file 'Scene.fxml'.";
		assert lblError != null : "fx:id=\"lblError\" was not injected: check your FXML file 'Scene.fxml'.";
	}
}
