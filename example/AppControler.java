package javafx.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppControler extends Application {
public static boolean change = false;
    @Override
    public  void start(Stage primaryStage) {
        Parent root = null;
        Parent login = null;
        
		try {
			root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
//			login = FXMLLoader.load(getClass().getResource("Login.fxml"));
			
		} catch (IOException e) {
			System.out.println("root failed");
			e.printStackTrace();
		}
		
		
		
		Image icon = new Image("@../../photos/skiing-icon.png");
		

        primaryStage.setTitle("Ski Tracker");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.centerOnScreen();
        
        primaryStage.getIcons().add((icon));
        primaryStage.show();
       

    	
    }
        
     

    public static void main(String[] args) {
        launch(args);
    }
}
