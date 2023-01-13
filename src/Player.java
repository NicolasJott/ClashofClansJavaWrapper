import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;

public class Player {
    private final JSONObject  PLAYER_INFO;

    public Player(String api_key, String player_tag) throws IOException {

        PLAYER_INFO = ServerConnection.connectWithResults(api_key, ServerConnection.ENDPOINT + ServerConnection.API_VER
                + "/players/%23" + player_tag, player_tag);

    }

    /*
    * Reads Json file to return the Clash player's account tag
     */
    public String getPlayerTag() throws JSONException {
        return (String) PLAYER_INFO.get("tag");
    }

    /*
     * Reads Json file to return the Clash player's account name
     */
    public String getPlayerName() throws JSONException {
        return (String) PLAYER_INFO.get("name");

    }

    /*
     * Reads Json file to return the Clash player's TownHall level
     */
    public int getTownHallLevel() throws JSONException {
        return (int) PLAYER_INFO.get("townHallLevel");

    }

    /*
     * Reads Json file to return the Clash player's TownHall weapon level
     */
    public int getTownHallWeaponLevel() throws JSONException {
        return (int) PLAYER_INFO.get("townHallWeaponLevel");
    }

    /*
     * Reads Json file to return the Clash player's account level
     */
    public int getExpLevel() throws JSONException {
        return (int) PLAYER_INFO.get("expLevel");
    }
}
