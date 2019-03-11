package controllers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;


import models.User;

public class GUIController {
	private static HashMap<String, User> users = new HashMap<>();

	public static User createNewUser() {
		boolean errorFound = false;
		String confirmPassword = javafx.example.CreateUserController.confirmPass.getText();
		do {

			User user = new User(javafx.example.CreateUserController.firstName.getText(), javafx.example.CreateUserController.lastName.getText(),
					javafx.example.CreateUserController.password.getText(), javafx.example.CreateUserController.username.getText(),
					javafx.example.CreateUserController.email.getText(0, javafx.example.CreateUserController.email.getLength())); // different because of testing
			if (users.containsKey(user.getUsername())) {
				// UsernameAlreadyExists
				errorFound = true;
			}
			if (users.containsValue(user.getEmail())) {
				// UserAlreadyExists
				errorFound = true;
			}
			if (user.getPassword() == confirmPassword) {
				users.put(user.getUsername(), user);
				saveMap();
				errorFound = false;
				// puts user into hashmap and saves hashmap
				return user;
			} else {
				return null;
				
			}
		} while (errorFound);
	}

	public static User login() {
		loadMap();
		boolean errorFound = false;
		do {
			
		User user = new User(javafx.example.DashboardController.Username.getText(), javafx.example.DashboardController.Password.getText());
		if (users.containsKey(user.getUsername())) {
			if (users.containsValue(user.getPassword())) {
				errorFound = false;
				// Allow access to user page and display saved results from previous login
				return user;

			} else {
				errorFound = true;
				return null;
				// Wrong password error/prompt for username again
			}
		} else {
			errorFound = true;
			// Wrong username error/prompt to login again or create account
			return null;
		}
		// Return user and bring user to new page with user content
		}while(errorFound);
	}

	private static void saveMap() {
//		boolean isBorked = false;
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
