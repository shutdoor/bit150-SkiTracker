package javafx.example;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class WeatherViewController {

	


	

	    @FXML
	    private Label cherryTreeCurrentTemp;

	    @FXML
	    private Label snowBirdSnowDepth;

	    @FXML
	    private Label brightonLabel;

	    @FXML
	    private Pane Brighton;

	    @FXML
	    private Label SnowBirdTitle;

	    @FXML
	    private Label snowBirdCurrentTemp;

	    @FXML
	    private ImageView backButtonImage;

	    @FXML
	    private Pane Alta;

	    @FXML
	    private Label altaSnowDepth;

	    @FXML
	    private Label brightonCurrentTemp;

	    @FXML
	    private Label cherryTreeTitle;

	    @FXML
	    private Label parkCitySnowDepth;

	    @FXML
	    private Pane CherryTree;

	    @FXML
	    private Label brightonSnowDepth;

	    @FXML
	    private Label parkCityTitle;

	    @FXML
	    private Label parkCityCurrentTemp;

	    @FXML
	    private Pane ParkCity;

	    @FXML
	    private Label cherryTreeSnowDepth;

	    @FXML
	    private Label altaCurrentTemp;

	    @FXML
	    private Label altaTitle;

	    @FXML
	    private Button backButton;

	    @FXML
	    private Pane SnowBird;

	

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

}
