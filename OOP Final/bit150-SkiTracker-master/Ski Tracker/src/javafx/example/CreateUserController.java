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
import models.User;

public class CreateUserController {
	
	public static String getFname() {
		return fname;
	}

	public static void setFname(String fname) {
		CreateUserController.fname = fname;
	}

	public static String getlName() {
		return lName;
	}

	public static void setlName(String lName) {
		CreateUserController.lName = lName;
	}

	public static String getEmailAdress() {
		return emailAdress;
	}

	public static void setEmailAdress(String emailAdress) {
		CreateUserController.emailAdress = emailAdress;
	}

	public static String getComfirmPassword() {
		return comfirmPassword;
	}

	public static void setComfirmPassword(String comfirmPass) {
		CreateUserController.comfirmPassword = comfirmPass;
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
	private static String fname; 
	private static String lName;
	private static String uname;
	private static String pass;
	private static String emailAdress;
	private static String comfirmPassword;
//	private Static String

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
		boolean validUser = true;
		
		setUname(username.getText());
		setPass(password.getText());
		setEmailAdress(email.getText());
		setFname(firstName.getText());
		setlName(lastName.getText());
		setComfirmPassword(confirmPass.getText());
		
		
		
		User a = new User(getUname(), getPass(), getFname(), getlName(), getEmailAdress());
		
		//Check for existing user
		if (controllers.GUIController.users.containsKey(a.getUsername())) {
			System.out.println("username already exists try again");
			validUser = false;
			userAlreadyExists.setVisible(true); 
		}
		//check for duplicate email
		if (controllers.GUIController.users.keySet().contains(getEmailAdress())) {
			System.out.println("email adress is in use already");
		// i would like to have a dialoge pop up that says would you like to continue if we have time
		} 
		//check for matching passwords
		if (!getComfirmPassword().equals(getPass())) {
			System.out.println("The passwords dont match try again");
			passwordsDontMatch.setVisible(true);
			validUser = false;
		}
		if (validUser) {
			controllers.GUIController.users.put(getUname(), a);
			System.out.println(GUIController.users);
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
		
		
//		String passw = password.getText();
//		System.out.println(un);
		
	}

	
}
