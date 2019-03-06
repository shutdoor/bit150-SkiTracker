package javafxstuff;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegistrationFormApplication extends Application {
public static boolean change = false;
    @Override
    public  void start(Stage primaryStage) {
        Parent root = null;
        
		try {
			root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
			
		} catch (IOException e) {
			System.out.println("root failed");
			e.printStackTrace();
		}
		
		
		
			
		

        primaryStage.setTitle("Ski Tracker");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        
        primaryStage.show();
        
        
     
        
    }
        
     

    public static void main(String[] args) {
        launch(args);
    }
}
