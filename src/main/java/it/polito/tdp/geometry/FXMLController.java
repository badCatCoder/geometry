package it.polito.tdp.geometry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {
	private rettangolo rect;

	public boolean initRettangolo() {
		String altezzaS = this.in_altezza.getText();
		float altezza;
		try {
			altezza = Float.parseFloat(altezzaS);
		} catch (NullPointerException e) {
			this.lblError.setText("Inserisi un valore!");
			return false;
		} catch (NumberFormatException e) {
			this.lblError.setText("Devi inserire un numero!");
			return false;
		}

		String baseS = this.in_base.getText();
		float base;
		try {
			base = Float.parseFloat(baseS);
		} catch (NullPointerException e) {
			this.lblError.setText("Inserisi un valore!");
			return false;
		} catch (NumberFormatException e) {
			this.lblError.setText("Devi inserire un numero!");
			return false;
		}
		rect.setAltezza(altezza);
		rect.setBase(base);
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
		if(this.initRettangolo()) {
			this.lblError.setText("");
			this.lblArea.setText(""+rect.calcolaArea());
		}
	}

	@FXML
	void handlerCalcolaPerimetro(ActionEvent event) {
		if(this.initRettangolo()) {
			this.lblError.setText("");
			this.lblPerimetro.setText(""+rect.calcolaPerimetro());
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
