package javafx.example;

import java.io.IOException;

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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class snowBirdPageController {

	
	@FXML
    private static Label resortName;

   

	@FXML
    private MenuItem Brighton;

    @FXML
    private MenuItem Solitude;

    @FXML
    private ImageView backButtonImage;

    @FXML
    private MenuItem Alta;

    @FXML
    public static  MenuButton ResortButton;
    

    @FXML
    private MenuItem Snowbird;

    @FXML
    private HBox Title;

    @FXML
    private Pane weatherInfo;

    @FXML
    private MenuItem none;

    @FXML
    private MenuItem cherryPark;

    @FXML
    private Button SortButton;

    @FXML
    private Pane ImageBox;

    @FXML
    private Button UtahAttractionsButton;

    @FXML
    private Label ContactUS;

    @FXML
    private Pane OtherInfo;

    @FXML
    private Button backButton;

    @FXML
    private MenuItem parkCity;

    @FXML
    private MenuItem deerValley;

    @FXML
    private Button WeatherButton;

    @FXML
    private AnchorPane MainPage;

    
    
	
   
    
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
		if (event.getSource().equals(Snowbird)) {
			ResortsPageController.resortName.setText("hello");;
		
	}

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

		Stage primaryStage = (Stage) ResortButton.getScene().getWindow();
		primaryStage.setScene(new Scene(attractions));
    }

    @FXML
    void sortBtnClick(ActionEvent event) {

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
    
    

}





