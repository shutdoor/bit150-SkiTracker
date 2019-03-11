package javafx.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.script.ScriptEngineManager;

import com.sun.javafx.scene.SceneHelper.SceneAccessor;
import com.sun.javafx.stage.StageHelper.StageAccessor;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DashboardController {
	public static Menu menu = new Menu("Menu 1");
	public static MenuItem item1 = new MenuItem("Item 1");
	public static MenuItem item2 = new MenuItem("Item 2");
	public SeparatorMenuItem separator = new SeparatorMenuItem();
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
	private TextField Username;

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
	private PasswordField Password;

	@FXML
	private Label date;

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
		GUIController.
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
}
