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
        return PLAYER_INFO.has("townHallLevel") ? (int) PLAYER_INFO.get("townHallLevel") : 0;

    }

    /*
     * Reads Json file to return the Clash player's TownHall weapon level
     */
    public int getTownHallWeaponLevel() throws JSONException {
        return PLAYER_INFO.has("townHallWeaponLevel") ? (int) PLAYER_INFO.get("townHallWeaponLevel") : 0;
    }

    /*
     * Reads Json file to return the Clash player's account level
     */
    public int getExpLevel() throws JSONException {
        return PLAYER_INFO.has("expLevel") ? (int) PLAYER_INFO.get("expLevel") : 0;
    }

    /*
     * Reads Json file to return the Clash player's trophies
     */
    public int getTrophies() throws JSONException {
        return PLAYER_INFO.has("trophies") ? (int) PLAYER_INFO.get("trophies") : 0;
    }

    /*
     * Reads Json file to return the Clash player's best trophies
     */
    public int getBestTrophies() throws JSONException {
        return PLAYER_INFO.has("bestTrophies") ? (int) PLAYER_INFO.get("bestTrophies") : 0;
    }

    /*
     * Reads Json file to return the Clash player's total war stars earned
     */
    public int getTotalWarStars() throws JSONException {
        return PLAYER_INFO.has("warStars") ? (int) PLAYER_INFO.get("warStars") : 0;
    }

    /*
     * Reads Json file to return the Clash player's season attack wins
     */
    public int getAttackWins() throws JSONException {
        return PLAYER_INFO.has("attackWins") ? (int) PLAYER_INFO.get("attackWins") : 0;
    }

    /*
     * Reads Json file to return the Clash player's season defense wins
     */
    public int getDefenseWins() throws JSONException {
        return PLAYER_INFO.has("defenseWins") ? (int) PLAYER_INFO.get("defenseWins") : 0;
    }

    /*
     * Reads Json file to return the Clash player's Builder Hall level
     * If builder hall is not unlocked, method will return 0
     */
    public int getBuilderHallLevel() throws JSONException {
        return PLAYER_INFO.has("builderHallLevel") ? (int) PLAYER_INFO.get("BuilderHallLevel") : 0;
    }

    /*
     * Reads Json file to return the Clash player's Builder Hall trophies
     * If no versus trophies, method will return 0
     */
    public int getVersusTrophies() throws JSONException {
        return PLAYER_INFO.has("versusTrophies") ? (int) PLAYER_INFO.get("versusTrophies") : 0;
    }

    /*
     * Reads Json file to return the Clash player's Builder Hall best trophies
     * If no best versus trophies, method will return 0
     */
    public int getBestVersusTrophies() throws JSONException {
        return PLAYER_INFO.has("BestVersusTrophies") ? (int) PLAYER_INFO.get("BestVersusTrophies") : 0;
    }

    /*
     * Reads Json file to return the Clash player's Builder Hall versus battle wins
     * If no versus battle wins, method will return 0
     */
    public int getVersusBattleWins() throws JSONException {
        return PLAYER_INFO.has("versusBattleWins") ? (int) PLAYER_INFO.get("versusBattleWins") : 0;
    }

    /*
     * Reads Json file to return the Clash player's clan role
     */
    public String getRole() throws JSONException {
        return (String) PLAYER_INFO.get("role");

    }

    /*
     * Reads Json file to return the Clash player's clan war preference
     */
    public String getWarPreference() throws JSONException {
        return (String) PLAYER_INFO.get("warPreference");

    }

    /*
     * Reads Json file to return the Clash player's clan donations sent
     * If no clan donations, method will return 0
     */
    public int getDonations() throws JSONException {
        return PLAYER_INFO.has("donations") ? (int) PLAYER_INFO.get("donations") : 0;
    }

    /*
     * Reads Json file to return the Clash player's clan donations received
     * If no clan donations, method will return 0
     */
    public int getDonationsReceived() throws JSONException {
        return PLAYER_INFO.has("donationsReceived") ? (int) PLAYER_INFO.get("donationsReceived") : 0;
    }

    /*
     * Reads Json file to return the Clash player's clan capital contributions
     * If no clan capital contributions, method will return 0
     */
    public int getClanCapitalContributions() throws JSONException {
        return PLAYER_INFO.has("clanCapitalContributions") ? (int) PLAYER_INFO.get("clanCapitalContributions") : 0;
    }
}
