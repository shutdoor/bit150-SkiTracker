package models;

import javafx.example.CreateUserController;
import javafx.scene.control.TextField;

public class User {
	
	
private String username;
private String password;
private String fname;
private String lname;
private String email;


	
	public User(String username, String password, String fname, String lname, String email) {
	this.username = username;
	this.password = password;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getfName() {
		return fname;
	}

	public void setfName(String string) {
		this.fname = string;
	}

	public String getlName() {
		return lname;
	}

	public void setlName(String string) {
		this.lname = string;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String string) {
		this.password = string;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String string) {
		this.username = string;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String string) {
		this.email = string;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User: ").append(fname).append(" ").append(lname).append(", username=")
				.append(username).append(", email=").append(email).append(", password=").append(password).append("]");
		return builder.toString();
	}
	
	

}
