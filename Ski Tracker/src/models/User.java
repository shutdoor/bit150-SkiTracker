package models;

public class User {
private String fName;
private String lName;
private String password;


public User(String fName, String lName, String password) {
	this.setfName(fName);
	this.setlName(lName);;
	this.setPassword(password);;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}





}
