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
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DashboardController {
   
	
	@FXML
	private Pane SubMenuPane;

	@FXML
	private MenuItem Brighton;

	@FXML
	private MenuItem Solitude;

	@FXML
	private Button newUserLink;

	@FXML
	private MenuItem Alta;

	@FXML
	private MenuButton ResortButton;

	@FXML
	private MenuItem Snowbird;

	@FXML
	private HBox Title;
	
	  @FXML
	    private GridPane entertainment;

	    @FXML
	    private GridPane Transportation;
	    
	    @FXML
	    private GridPane food;

	@FXML
	private Pane Login;

	@FXML
	private Button SortButton;

	@FXML
	private MenuItem none;

	@FXML
	private MenuItem cherryPark;

	@FXML
	private ImageView ImageBox;

	@FXML
	private Button UtahAttractionsButton;

	@FXML
	private Label ContactUS;

	@FXML
	private Pane OtherInfo;

	@FXML
	public static TextField Username;

	@FXML
	private MenuItem parkCity;

	@FXML
	private MenuItem deerValley;

	@FXML
	private Button WeatherButton;

	@FXML
	private Label UserLoginText;

	@FXML
	private Button SubmitButton;

	@FXML
	private AnchorPane MainPage;

	@FXML
	public static PasswordField Password;
	
	 @FXML
	    private Button AcctBTN;

	@FXML
	public static Label date;
	
	 @FXML
	    private Label currentUser;

	@FXML
	void createAccount(ActionEvent event) {
		Parent login = null;
		try {

			login = FXMLLoader.load(getClass().getResource("createUser.fxml"));

		} catch (IOException e) {
			System.out.println("login  failed");
			e.printStackTrace();
		}

		// Here I want to swap the screen!

		Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		primaryStage.setScene(new Scene(login));
	}

	@FXML
	void SubmitButtonClick(ActionEvent event) {
		String uname = Username.getText();
		String pass = Username.getText();
		Username.clear();
		Password.clear();
		System.out.println("Login success");
		GUIController.login();
	}

	@FXML
	void weatherBtnClick(ActionEvent event) {
		Parent weatherView = null;
		try {

			weatherView = FXMLLoader.load(getClass().getResource("weatherView.fxml"));

		} catch (IOException e) {
			System.out.println("weather failed");
			e.printStackTrace();
		}

		// Here I want to swap the screen!

		Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		primaryStage.setScene(new Scene(weatherView));
	}

	@FXML
	void sortBtnClick(ActionEvent event) {
		
	}

	@FXML
	void attractionsBtnClick(ActionEvent event) {
		Parent attractions = null;
		try {

			attractions = FXMLLoader.load(getClass().getResource("utahAttractionsView.fxml"));

		} catch (IOException e) {
			System.out.println("resort  failed");
			e.printStackTrace();
		}

		// Here I want to swap the screen!

		Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		primaryStage.setScene(new Scene(attractions));
	}

	@FXML
	void resortPage(ActionEvent event) {
		
		
		Parent resort = null;
		try {

			resort = FXMLLoader.load(getClass().getResource("resortView.fxml"));

		} catch (IOException e) {
			System.out.println("resort  failed");
			e.printStackTrace();
		}

		// Here I want to swap the screen!

		Stage primaryStage = (Stage) ResortButton.getScene().getWindow();
		primaryStage.setScene(new Scene(resort));
		
	}
	
	  @FXML
	    void AcctBTNClick(ActionEvent event) {
		 
currentUser.setVisible(true);
	    }
	  
	  
	    @FXML
	    void foodBTNclick(ActionEvent event) {
food.setVisible(true);
	    }

	    @FXML
	    void entertainmentBTNclick(ActionEvent event) {
entertainment.setVisible(true);
	    }

	    @FXML
	    void TravelBTNclick(ActionEvent event) {

	    }

}
