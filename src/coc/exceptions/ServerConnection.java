package coc.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import org.json.JSONObject;

public class ServerConnection {

    public static final String ENDPOINT = "https://api.clashofclans.com/";
    public static final String API_VER = "v1";
    public static JSONObject connectWithResults(String API_KEY, String link, String PLAYER_TAG) throws IOException {


        HttpURLConnection connection = (HttpURLConnection) new URL(link).openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
        connection.setRequestProperty("Accept", "application/json");

        InputStream input = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        //System.out.println(response.toString());

        return new JSONObject(response.toString());
    }
}
