package it.polito.tdp.anagrammi.controller;



import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	Model model;

    
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInsert;

    @FXML
    private Button btnCalcolaAnagrammi;

    @FXML
    private TextArea txtResultCorretti;

    @FXML
    private TextArea txtResultErrati;

    @FXML
    private Button btnReset;

    @FXML
    void doCalcolaAnagrammi(ActionEvent event) {
    	
    	txtResultCorretti.clear();
    	txtResultErrati.clear();
    	String parola = txtInsert.getText();
    	
    	List <String> anagrammi = new ArrayList<String>(model.cercaAnagrammi(parola));
    	
    	String corrette = "";
    	String errate = "";
    	for(String a : anagrammi) {
    		if(model.dizionarioModel(a))
    			corrette += a+"\n";
    		else 
    			errate += a+"\n";}
    	txtResultCorretti.appendText(corrette.trim());
    	txtResultErrati.appendText(errate.trim());
    	

    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtResultCorretti.clear();
    	txtResultErrati.clear();
    	txtInsert.clear();

    }
    
    
public void setModel(Model model) {
		this.model = model;
	}

    @FXML
    void initialize() {
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcolaAnagrammi != null : "fx:id=\"btnCalcolaAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResultCorretti != null : "fx:id=\"txtResultCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResultErrati != null : "fx:id=\"txtResultErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";
         model = new Model();
    }
}

