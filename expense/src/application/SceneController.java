package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class SceneController {
	
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private Label get_from_add, get_from_edit;
	
	@FXML
	public void login(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("log.fxml"));
		Parent root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
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
		FXMLLoader loader = new FXMLLoader(getClass().getResource("waller_page.fxml"));
		Parent root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void main(ActionEvent event) throws IOException{
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
				controller.setLabelTextAdd("Sport: ");
				break;
				
			case "add_enter":
				controller.setLabelTextAdd("Entertainment: ");
				break;
				
			case "add_house":
				controller.setLabelTextAdd("Housing: ");
				break;
				
			case "add_cloth":
				controller.setLabelTextAdd("Clothing: ");
				break;
				
			case "add_tran":
				controller.setLabelTextAdd("Transportation: ");
				break;
				
			case "add_food":
				controller.setLabelTextAdd("Food: ");
				break;
				
			case "add_shop":
				controller.setLabelTextAdd("Shoping: ");
				break;
				
			case "add_school":
				controller.setLabelTextAdd("School fee: ");
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
	public void edit(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("edit.fxml"));
		Parent root = loader.load();
		
		String buttonId = ((Button)event.getSource()).getId();
		SceneController controller = loader.getController();
		
		switch(buttonId) {
			case "edit_sport":
				controller.setLabelTextEdit("Sport: ");
				break;
				
			case "edit_enter":
				controller.setLabelTextEdit("Entertainment: ");
				break;
				
			case "edit_house":
				controller.setLabelTextEdit("Housing: ");
				break;
				
			case "edit_cloth":
				controller.setLabelTextEdit("Clothing: ");
				break;
				
			case "edit_tran":
				controller.setLabelTextEdit("Transportation: ");
				break;
				
			case "edit_food":
				controller.setLabelTextEdit("Food: ");
				break;
				
			case "edit_shop":
				controller.setLabelTextEdit("Shoping: ");
				break;
				
			case "add_school":
				controller.setLabelTextEdit("School fee: ");
				break;
			default: 
				break;
		}
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void setLabelTextAdd(String text) {
		get_from_add.setText(text);
	}
	public void setLabelTextEdit(String text) {
		get_from_edit.setText(text);
	}
}
