package javafx.example;

import java.io.IOException;

import controllers.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CreateUserController {
	
	private static String uname;
	private static String pass;

	@FXML
	private Pane Pane2;
	@FXML
	public  TextField lastName;
	

	@FXML
	private  Button createNewAccountBTN;

	@FXML
	private  MenuButton preferedResort;

	@FXML
	private Pane inputBoxes;

	@FXML
	private MenuItem Brighton;

	@FXML
	private MenuItem Solitude;

	@FXML
	private MenuItem Alta;

	@FXML
	private MenuItem Snowbird;

	@FXML
	private MenuItem none;

	@FXML
	private MenuItem cherryPark;
	@FXML
	private ImageView backButtonImage;

	@FXML
	private  Text userAlreadyExists;
	@FXML
	private Text emailTaken;

	@FXML
	private Text passwordsDontMatch;

	@FXML
	public  TextField firstName;

	@FXML
	public  TextField password;

	@FXML
	public  TextField confirmPass;

	@FXML
	private MenuItem parkCity;

	@FXML
	private MenuItem deerValley;

	@FXML
	public  TextField email;

	@FXML
	private AnchorPane MainPage;

	@FXML
	public  TextField username;
	@FXML
	private Button backButton;

	MenuBar menuBar = new MenuBar();

	@FXML
	void newAcctCreate(ActionEvent event) {
		
		Parent dashboard = null;
//		String uname = username.getText();
//		String pas = password.getText();
//		String firstname = firstName.getText();
//		String lname = lastName.getText();
//		String emai = email.getText();

		GUIController.createNewUser();
		try {

			dashboard = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));

		} catch (IOException e) {
			System.out.println("it no work  instead it failed");
			e.printStackTrace();
		}

		Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		primaryStage.setScene(new Scene(dashboard));
//		GUIController.createNewUser();
		
		
	}

	@FXML
	void selectResort(ActionEvent event) {
		event.getSource();

	}

	@FXML
	void backToMain(ActionEvent event) {
		Parent dashboard = null;
		try {

			dashboard = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));

		} catch (IOException e) {
			System.out.println("it no work  instead it failed");
			e.printStackTrace();
		}

		// Here I want to swap the screen!

		Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		primaryStage.setScene(new Scene(dashboard));
	}
	@FXML
	  void getInput(ActionEvent event) {
		setUname(username.getText());
		setPass(password.getText());
		System.out.println(getUname());
		System.out.println(getPass());
		
		
		
//		String passw = password.getText();
//		System.out.println(un);
		
	}

	public static String getUname() {
		return uname;
	}

	public  void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
