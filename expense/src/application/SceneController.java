package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SceneController {
	
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private Label get_from_add, get_from_edit;
	
	@FXML
	private TextField set_input_add, set_input_edit;
	
	@FXML
    private TextField usernameField, passwordField;
	
	//singup element
	@FXML
    private TextField email, user, phone, cpass, rpass;	
	
	@FXML
	private Label alert_message, wname, wbalance, wemail, wphone, wpass;
	
	@FXML
	private Label sport_input, enter_input, house_input,
	cloth_input, tran_input, food_input, shop_input, school_input;
	
	@FXML
	public void login(ActionEvent event) throws IOException {
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("log.fxml"));
	    Parent root = loader.load();

	    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	    
	}
	
//	private void checkLogin() throws IOException{
//		if(usernameField.getText().isEmpty() || passwordField.getText().isEmpty())
//		{
//			alert_message.setText("Invalid Input!");
//			System.out.print("djfvkjdnv");
//		}
//	}
	
	public boolean isNotEmpty(String text) {
	    return !text.isEmpty();
	}

	
	@FXML
	public void signup(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("regis.fxml"));
		Parent root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void wallet(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("wallet_page.fxml"));
		Parent root = loader.load();
		
		wname.setText(user.getText());
		wemail.setText(email.getText());
		wphone.setText(phone.getText());
		wpass.setText(cpass.getText());
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void main(ActionEvent event) throws IOException{
		if(usernameField.getText().isEmpty() || passwordField.getText().isEmpty()){
			alert_message.setText("Invalid Input!");
		}
//		else if(email.getText().isEmpty() || user.getText().isEmpty()
//				 || phone.getText().isEmpty() || cpass.getText().isEmpty()
//				 || rpass.getText().isEmpty()){
//			alert_message.setText("Invalid Input!");
//		}
		else {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("mainPage.fxml"));
			Parent root = loader.load();
			
			System.out.print(usernameField.getText());
			System.out.print(passwordField.getText());

			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
	
	@FXML
	public void rMain(ActionEvent event) throws IOException{
		if(email.getText().isEmpty() || user.getText().isEmpty()
				 || phone.getText().isEmpty() || cpass.getText().isEmpty()
				 || rpass.getText().isEmpty()){
			alert_message.setText("Invalid Input!");
		}
		else {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("mainPage.fxml"));
			Parent root = loader.load();
			

			System.out.print(email.getText());
			System.out.print(user.getText());
			System.out.print(phone.getText());
			System.out.print(cpass.getText());
			System.out.print(rpass.getText());

			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
	@FXML
	public void dMain(ActionEvent event) throws IOException{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("mainPage.fxml"));
			Parent root = loader.load();

			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
	
	@FXML
	public void front(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("front.fxml"));
		Parent root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void expense(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("expenseDetail.fxml"));
		Parent root = loader.load();
		
		SceneController controller = loader.getController();
		
//		controller.sport_input.setText("0");
//		controller.enter_input.setText("0");
//		controller.house_input.setText("0");
//		controller.cloth_input.setText("0");
//		controller.tran_input.setText("0");
//		controller.food_input.setText("0");
//		controller.shop_input.setText("0");
//		controller.school_input.setText("0");
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	@FXML
	public void add(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("add.fxml"));
		Parent root = loader.load();
		
		String buttonId = ((Button)event.getSource()).getId();
		SceneController controller = loader.getController();
		
		switch(buttonId) {
			case "add_sport":
				controller.setLabelTextAndInputAdd("Sport: ", "get_input_sport");
				break;
				
			case "add_enter":
				controller.setLabelTextAndInputAdd("Entertainment: ", "get_input_enter");
				break;
				
			case "add_house":
				controller.setLabelTextAndInputAdd("Housing: ", "get_input_house");
				break;
				
			case "add_cloth":
				controller.setLabelTextAndInputAdd("Clothing: ", "get_input_cloth");
				break;
				
			case "add_tran":
				controller.setLabelTextAndInputAdd("Transportation: ", "get_input_tran");
				break;
				
			case "add_food":
				controller.setLabelTextAndInputAdd("Food: ", "get_input_food");
				break;
				
			case "add_shop":
				controller.setLabelTextAndInputAdd("Shoping: ", "get_input_shop");
				break;
				
			case "add_school":
				controller.setLabelTextAndInputAdd("School fee: ", "get_input_school");
				break;
			default: 
				break;
		}
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void handleAddButton(ActionEvent event) {
		String inputID = set_input_add.getId();
		String inputText = set_input_add.getText();
	}
	
	@FXML
	public void handleEditButton(ActionEvent event) {
		String inputID = set_input_edit.getId();
		String inputText = set_input_edit.getText();
	}
	
	@FXML
	public void edit(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("edit.fxml"));
		Parent root = loader.load();
		
		String buttonId = ((Button)event.getSource()).getId();
		SceneController controller = loader.getController();
		
		switch(buttonId) {
			case "edit_sport":
				controller.setLabelTextAndInputEdit("Sport: ", "get_input_sport");
				break;
				
			case "edit_enter":
				controller.setLabelTextAndInputEdit("Entertainment: ", "get_input_enter");
				break;
				
			case "edit_house":
				controller.setLabelTextAndInputEdit("Housing: ", "get_input_house");
				break;
				
			case "edit_cloth":
				controller.setLabelTextAndInputEdit("Clothing: ", "get_input_cloth");
				break;
				
			case "edit_tran":
				controller.setLabelTextAndInputEdit("Transportation: ", "get_input_tran");
				break;
				
			case "edit_food":
				controller.setLabelTextAndInputEdit("Food: ", "get_input_food");
				break;
				
			case "edit_shop":
				controller.setLabelTextAndInputEdit("Shoping: ", "get_input_shop");
				break;
				
			case "add_school":
				controller.setLabelTextAndInputEdit("School fee: ", "get_input_school");
				break;
			default: 
				break;
		}
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
//	public void setLabelExpense(String text){
//		sport_input.setText(text); 
//		enter_input.setText(text);
//		house_input.setText(text);
//		cloth_input.setText(text);
//		tran_input.setText(text);
//		food_input.setText(text);
//		shop_input.setText(text);
//		school_input.setText(text);
//	}
	
	public void setLabelTextAndInputAdd(String text, String inputId) {
		get_from_add.setText(text);
		set_input_add.setId(inputId);
	}
	public void setLabelTextAndInputEdit(String text, String inputId) {
		get_from_edit.setText(text);
		set_input_edit.setId(inputId);
	}
}
