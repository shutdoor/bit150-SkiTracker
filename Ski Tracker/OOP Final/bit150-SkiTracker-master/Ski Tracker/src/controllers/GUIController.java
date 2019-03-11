package controllers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import javafx.example.CreateUserController;
import models.User;

public class GUIController implements Serializable {
	public static HashMap<String, User> users = new HashMap<>();

	public static  User createNewUser() {
		
		String confirmPassword = null;
		boolean errorFound = false;
	User user = null;
		do {

			 user = new User(CreateUserController.getUname(), "pass"); // different because of testing
			if (users.containsKey(user.getUsername())) {
				// UsernameAlreadyExists
				System.out.println("user exists");
				errorFound = true;
			}
			if (users.containsValue(user.getEmail())) {
				// UserAlreadyExists
				System.out.println("that email is already in");
				errorFound = true;
			}
//			if (user.getPassword().equals(confirmPassword)) {
//				users.put(user.getUsername(), user);
//				saveMap();
//				errorFound = false;
//				// puts user into hashmap and saves hashmap
//				return user;
//			} 
			else {
				return null;
				
			}
		} while (errorFound);
		return user;
	}
/* username cant be static 
 * gotta find out what is calling the method below
 */
//	public static User login(String username, String password) {
//		loadMap();
//		boolean errorFound = false;
//		do {
//			
////		User user = new User(javafx.example.DashboardController.Username.getText(), javafx.example.DashboardController.Password.getText());
//		if (users.containsKey(user.getUsername())) {
//			if (users.containsValue(user.getPassword())) {
//				errorFound = false;
//				// Allow access to user page and display saved results from previous login
//				return user;
//
//			} else {
//				errorFound = true;
//				return null;
//				// Wrong password error/prompt for username again
//			}
//		} else {
//			errorFound = true;
//			// Wrong username error/prompt to login again or create account
//			return null;
//		}
//		// Return user and bring user to new page with user content
//		}while(errorFound);
//	}

	private static void saveMap() {
//		boolean isBorked = false; // in case do while
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("userhashmap.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(users);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private static void loadMap() {
		users = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("userhashmap.ser");
			ois = new ObjectInputStream(fis);
			users = (HashMap<String, User>) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
			return;
		}

	}
}
