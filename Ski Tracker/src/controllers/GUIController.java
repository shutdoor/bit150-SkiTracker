package controllers;

import java.util.HashMap;

import javafx.scene.control.TextField;
import javafxstuff.LoginPageController;
import models.User;

public class GUIController {
private static HashMap<TextField, User> users = new HashMap<>();
	private static User createNewUser() {
		User user = new User(LoginPageController.firstName, LoginPageController.lastName, LoginPageController.password, LoginPageController.username, LoginPageController.email);
		users.put(user.getUsername(), user);
		
		return user;
	}
	
	private static void login() {
	User user = new User(LoginPageController.username, LoginPageController.password);
	if(users.containsKey(user.getUsername())) {
		//Allow access to user page and display saved results from previous login
	}
		//Display error message and prompt to login again or create account
	}
}
