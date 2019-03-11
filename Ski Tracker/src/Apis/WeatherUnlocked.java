package Apis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

//40.5811, -111.6603 - Snowbird Ski Resort
//40.5883, -111.6358 - Alta Ski Area
//40.6374, -111.4783 - Deer Valley Resort
//40.6199, -111.5919 - Solitude Mountain Resort
//40.5980, -111.5832 - Brighton Resort
//40.6514, -111.5080 - Park City Mountain
//41.9263, -111.7564 - Cherry Peak

public class WeatherUnlocked {
	
	public static int temperatureF = -99;
	public static int temperatureC= -99;
	public static int feelTemperatureFahrenheit = -99;
	public static int feelTemperatureCelsius = -99;
	public static int windSpeedMiles = -99; 
	public static int windSpeedMeters = -99; 
	public static int windSpeedKnots = -99; 
	public static String weatherDescription = "";
	public static double visablityMiles = -99.99;
	public static int windDirect = -99;
	public static String windCardinalDirection = "";
	public static double seaLevelInches = -99;
	
	public static Map<String, Object> jsonToMap(String str){
		Map<String, Object> map = new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() {}.getType()
	);
		return map;
	}
	
	
	public void WeatherUnlocked(String LongLad) {	
	String urlString = "http://api.weatherunlocked.com/api/current/"+ LongLad +"?app_id=f73495b6&app_key=2cdedf4b35e95f11ff12fd0634911cad";
	try {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlString);
		URLConnection conn = url.openConnection();
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		rd.close();
		
		Map<String, Object> respMap = jsonToMap(result.toString());
		
		double tempF = (double) respMap.get("temp_f");
		setTemperatureF((int) Math.round(tempF));
		double tempC = (double) respMap.get("temp_c");
		setTemperatureC((int) Math.round(tempC));
		double feelTempF = (double) respMap.get("feelslike_f");
		setFeelTemperatureFahrenheit((int) Math.round(feelTempF));
		double feelTempC = (double) respMap.get("feelslike_c");
		setFeelTemperatureCelsius((int) Math.round(feelTempC));
		double windSpeedMph = (double) respMap.get("windspd_mph");
		setWindSpeedMiles((int) Math.round(windSpeedMph));
		double windSpeedM = (double) respMap.get("windspd_kmh");
		setWindSpeedMeters((int) Math.round(windSpeedM));
		double windSpeedK = (double) respMap.get("windspd_kts");
		setWindSpeedKnots((int)Math.round(windSpeedK));
		String weatherDesc = (String) respMap.get("wx_desc");
		setWeatherDescription(weatherDesc);
		double visablity = (double) respMap.get("vis_mi");
		setVisablityMiles(visablity);
		double windDirection = (double) respMap.get("winddir_deg");
		setWindDirect((int) windDirection);
		String windCompass = (String) respMap.get("winddir_compass");
		setWindCardinalDirection(windCompass);
		double seaLevel = (double) respMap.get("slp_in");
		setSeaLevelInches(seaLevel);
		
		
	}catch (IOException e) {
		System.out.println(e.getMessage());
	}
}


	public int getTemperatureF() {
		return temperatureF;
	}


	public void setTemperatureF(int temperatureF) {
		WeatherUnlocked.temperatureF = temperatureF;
	}


	public int getTemperatureC() {
		return temperatureC;
	}


	public void setTemperatureC(int temperatureC) {
		WeatherUnlocked.temperatureC = temperatureC;
	}


	public int getFeelTemperatureFahrenheit() {
		return feelTemperatureFahrenheit;
	}


	public void setFeelTemperatureFahrenheit(int feelTemperatureFahrenheit) {
		WeatherUnlocked.feelTemperatureFahrenheit = feelTemperatureFahrenheit;
	}


	public int getFeelTemperatureCelsius() {
		return feelTemperatureCelsius;
	}


	public void setFeelTemperatureCelsius(int feelTemperatureCelsius) {
		WeatherUnlocked.feelTemperatureCelsius = feelTemperatureCelsius;
	}


	public int getWindSpeedMiles() {
		return windSpeedMiles;
	}


	public void setWindSpeedMiles(int windSpeedMiles) {
		WeatherUnlocked.windSpeedMiles = windSpeedMiles;
	}


	public int getWindSpeedMeters() {
		return windSpeedMeters;
	}


	public void setWindSpeedMeters(int windSpeedMeters) {
		WeatherUnlocked.windSpeedMeters = windSpeedMeters;
	}


	public int getWindSpeedKnots() {
		return windSpeedKnots;
	}


	public void setWindSpeedKnots(int windSpeedKnots) {
		WeatherUnlocked.windSpeedKnots = windSpeedKnots;
	}


	public String getWeatherDescription() {
		return weatherDescription;
	}


	public void setWeatherDescription(String weatherDescription) {
		WeatherUnlocked.weatherDescription = weatherDescription;
	}


	public double getVisablityMiles() {
		return visablityMiles;
	}


	public void setVisablityMiles(double visablityMiles) {
		WeatherUnlocked.visablityMiles = visablityMiles;
	}


	public int getWindDirect() {
		return windDirect;
	}


	public void setWindDirect(int windDirect) {
		WeatherUnlocked.windDirect = windDirect;
	}


	public String getWindCardinalDirection() {
		return windCardinalDirection;
	}


	public void setWindCardinalDirection(String windCardinalDirection) {
		WeatherUnlocked.windCardinalDirection = windCardinalDirection;
	}


	public double getSeaLevelInches() {
		return seaLevelInches;
	}


	public void setSeaLevelInches(double seaLevelInches) {
		WeatherUnlocked.seaLevelInches = seaLevelInches;
	}

	
	
}