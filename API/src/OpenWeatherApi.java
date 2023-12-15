import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenWeatherApi {

    public static void main(String[] args) {
        String apiKey = "f4f5fc75271184eed3254f93ba3e563c";
        String city = "Bengaluru";
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                // Parse JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Access weather details
                JSONObject main = jsonResponse.getJSONObject("main");
                double temperature = main.getDouble("temp");
                double celsius=temperature-273;
                double humidity = main.getDouble("humidity");
                double pressure = main.getDouble("pressure");
               
                JSONArray weatherArray = jsonResponse.getJSONArray("weather");
                JSONObject weather = weatherArray.getJSONObject(0);
                String description = weather.getString("description");
                
                JSONObject wind = jsonResponse.getJSONObject("wind");
                double windSpeed = wind.getDouble("speed");
                
                JSONObject clouds = jsonResponse.getJSONObject("clouds");
                double cloudiness = clouds.getDouble("all");
                


                
                System.out.println("Temperature in " + city + ": " + celsius + " degree°C");
                System.out.println("Humidity in " + city + ": " + humidity + "%");
                System.out.println("Pressure in " + city + ": " + pressure + " hPa");
                System.out.println("Weather conditions in " + city + ": " + description);
                System.out.println("Wind speed in " + city + ": " + windSpeed + " m/s");
                System.out.println("Cloudiness in " + city + ": " + cloudiness + "%");
            } else {
                System.out.println("Error: Unable to fetch weather details. Response code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	private static void printf(String string) {
		// TODO Auto-generated method stub
		
	}
}
