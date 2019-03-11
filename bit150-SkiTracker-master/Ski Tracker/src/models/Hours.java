package models;

public class Hours {
private String openingHour;
private String closingHour;



public Hours(String openingHour, String closingHour) {
	this.setOpeningHour(openingHour);
	this.setClosingHour(closingHour);
}
public String getOpeningHour() {
	return openingHour;
}
public void setOpeningHour(String openingHour) {
	this.openingHour = openingHour;
}
public String getClosingHour() {
	return closingHour;
}
public void setClosingHour(String closingHour) {
	this.closingHour = closingHour;
}


}
