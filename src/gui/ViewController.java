package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Operations;

public class ViewController implements Initializable{
	
	@FXML
	private TextField txtNumber1; 
	@FXML
	private TextField txtNumber2; 
	
	@FXML
	private Label labelResult; 
	
	@FXML
	private Button btSum;
	
	@FXML
	private Button btSub; 
	
	@FXML
	private Button btMul;
	
	@FXML 
	private Button btDiv;
	
	@FXML
	private Button btReset;
	
	
	@FXML
	public void onBtSumAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText()); 
			double number2 = Double.parseDouble(txtNumber2.getText()); 
			double sum =  Operations.somar(number1, number2); 
			labelResult.setText(String.format("%.2f", sum));
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error",  e.getMessage(), AlertType.ERROR);
		}
	}
		
	@FXML
	public void onBtSubAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText()); 
			double number2 = Double.parseDouble(txtNumber2.getText()); 
			double sub =  Operations.subtrair(number1, number2); 
			labelResult.setText(String.format("%.2f", sub));
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error",  e.getMessage(), AlertType.ERROR);
		}
	}
	
	@FXML
	public void onBtMulAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText()); 
			double number2 = Double.parseDouble(txtNumber2.getText()); 
			double mul =  Operations.multiplicar(number1, number2); 
			labelResult.setText(String.format("%.2f", mul));
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error",  e.getMessage(), AlertType.ERROR);
		}
	}
	
	@FXML
	public void onBtDivAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText()); 
			double number2 = Double.parseDouble(txtNumber2.getText()); 
			double div =  Operations.dividir(number1, number2); 
			labelResult.setText(String.format("%.2f", div));
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error",  e.getMessage(), AlertType.ERROR);
		}
	}
	
	@FXML
	public void onBtResetAction() {
		txtNumber1.setText("");
		txtNumber2.setText("");
		labelResult.setText("0");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 12); 
		Constraints.setTextFieldMaxLength(txtNumber2, 12);
	}
}
