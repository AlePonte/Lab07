package it.polito.tdp.poweroutages;
import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.poweroutages.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PowerOutagesController {

	
	private Model model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> boxRegion;

    @FXML
    private TextField txtYear;

    @FXML
    private TextField txtHours;

    @FXML
    private Button btnAnalisi;

    @FXML
    private TextArea txtArea;
    
    public void setModel (Model model){
  		this.model=model;
  		}
  

    @FXML
    void boxRegionAction(ActionEvent event) {

    }

    @FXML
    void doAnalisi(ActionEvent event) {

    }


    @FXML
    void initialize() {
        assert boxRegion != null : "fx:id=\"boxRegion\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert txtYear != null : "fx:id=\"txtYear\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert txtHours != null : "fx:id=\"txtHours\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert btnAnalisi != null : "fx:id=\"btnAnalisi\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        
        

    }
    
    
    
}
