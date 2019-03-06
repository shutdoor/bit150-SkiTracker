package models;

import javafx.scene.control.TextField;

public class User {
	private TextField fName;
	private TextField lName;
	private TextField username;
	private TextField email;
	private TextField password;

	public User(TextField fName, TextField lName, TextField password, TextField username, TextField email) {
		this.setfName(fName);
		this.setlName(lName);
		this.setPassword(password);
		this.setUsername(username);
		this.setEmail(username);
	}
	public User(TextField username, TextField password) {
		this.username = username;
		this.password = password;
	}

	public TextField getfName() {
		return fName;
	}

	public void setfName(TextField fName) {
		this.fName = fName;
	}

	public TextField getlName() {
		return lName;
	}

	public void setlName(TextField lName) {
		this.lName = lName;
	}

	public TextField getPassword() {
		return password;
	}

	public void setPassword(TextField password) {
		this.password = password;
	}

	public TextField getUsername() {
		return username;
	}

	public void setUsername(TextField username) {
		this.username = username;
	}

	public TextField getEmail() {
		return email;
	}

	public void setEmail(TextField email) {
		this.email = email;
	}

}
