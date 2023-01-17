package coc.Player;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import coc.HttpRequest.ServerConnection;
import java.io.IOException;

public class Player {
    private final JSONObject  PLAYER_INFO;

    public Player(String api_key, String player_tag) throws IOException {

        PLAYER_INFO = ServerConnection.connectWithResults(api_key, ServerConnection.ENDPOINT + ServerConnection.API_VER
                + "/players/%23" + player_tag);

    }

    /*
    *****************************************************************
    *                                                               *
    *                     Player Info                               *
    *                                                               *
    *****************************************************************
     */
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
    public Integer getTownHallLevel() throws JSONException {
        return PLAYER_INFO.has("townHallLevel") ? (Integer) PLAYER_INFO.get("townHallLevel") : 0;

    }

    /*
     * Reads Json file to return the Clash player's TownHall weapon level
     */
    public Integer getTownHallWeaponLevel() throws JSONException {
        return PLAYER_INFO.has("townHallWeaponLevel") ? (Integer) PLAYER_INFO.get("townHallWeaponLevel") : 0;
    }

    /*
     * Reads Json file to return the Clash player's account level
     */
    public Integer getExpLevel() throws JSONException {
        return PLAYER_INFO.has("expLevel") ? (Integer) PLAYER_INFO.get("expLevel") : 0;
    }

    /*
     * Reads Json file to return the Clash player's trophies
     */
    public Integer getTrophies() throws JSONException {
        return PLAYER_INFO.has("trophies") ? (Integer) PLAYER_INFO.get("trophies") : 0;
    }

    /*
     * Reads Json file to return the Clash player's best trophies
     */
    public Integer getBestTrophies() throws JSONException {
        return PLAYER_INFO.has("bestTrophies") ? (Integer) PLAYER_INFO.get("bestTrophies") : 0;
    }

    /*
     * Reads Json file to return the Clash player's total war stars earned
     */
    public Integer getTotalWarStars() throws JSONException {
        return PLAYER_INFO.has("warStars") ? (Integer) PLAYER_INFO.get("warStars") : 0;
    }

    /*
     * Reads Json file to return the Clash player's season attack wins
     */
    public Integer getAttackWins() throws JSONException {
        return PLAYER_INFO.has("attackWins") ? (Integer) PLAYER_INFO.get("attackWins") : 0;
    }

    /*
     * Reads Json file to return the Clash player's season defense wins
     */
    public Integer getDefenseWins() throws JSONException {
        return PLAYER_INFO.has("defenseWins") ? (Integer) PLAYER_INFO.get("defenseWins") : 0;
    }

    /*
     * Reads Json file to return the Clash player's Builder Hall level
     * If builder hall is not unlocked, method will return 0
     */
    public Integer getBuilderHallLevel() throws JSONException {
        return PLAYER_INFO.has("builderHallLevel") ? (Integer) PLAYER_INFO.get("BuilderHallLevel") : 0;
    }

    /*
     * Reads Json file to return the Clash player's Builder Hall trophies
     * If no versus trophies, method will return 0
     */
    public Integer getVersusTrophies() throws JSONException {
        return PLAYER_INFO.has("versusTrophies") ? (Integer) PLAYER_INFO.get("versusTrophies") : 0;
    }

    /*
     * Reads Json file to return the Clash player's Builder Hall best trophies
     * If no best versus trophies, method will return 0
     */
    public Integer getBestVersusTrophies() throws JSONException {
        return PLAYER_INFO.has("BestVersusTrophies") ? (Integer) PLAYER_INFO.get("BestVersusTrophies") : 0;
    }

    /*
     * Reads Json file to return the Clash player's Builder Hall versus battle wins
     * If no versus battle wins, method will return 0
     */
    public Integer getVersusBattleWins() throws JSONException {
        return PLAYER_INFO.has("versusBattleWins") ? (Integer) PLAYER_INFO.get("versusBattleWins") : 0;
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
    public Integer getDonations() throws JSONException {
        return PLAYER_INFO.has("donations") ? (Integer) PLAYER_INFO.get("donations") : 0;
    }

    /*
     * Reads Json file to return the Clash player's clan donations received
     * If no clan donations, method will return 0
     */
    public Integer getDonationsReceived() throws JSONException {
        return PLAYER_INFO.has("donationsReceived") ? (Integer) PLAYER_INFO.get("donationsReceived") : 0;
    }

    /*
     * Reads Json file to return the Clash player's clan capital contributions
     * If no clan capital contributions, method will return 0
     */
    public Integer getClanCapitalContributions() throws JSONException {
        return PLAYER_INFO.has("clanCapitalContributions") ? (Integer) PLAYER_INFO.get("clanCapitalContributions") : 0;
    }


    /*
     *****************************************************************
     *                                                               *
     *                     Player Clan Info                          *
     *                                                               *
     *****************************************************************
     */
    /*
     * Reads Json file to return the Clash player's clan tag
     * Check's to see if player is in clan. If so, it returns the clan tag. If not it returns not in a clan
     */
    public String getClanTag() throws JSONException {
        return PLAYER_INFO.has("clan") ? (String) PLAYER_INFO.getJSONObject("clan").get("tag") : "Not in a clan";
    }

    /*
     * Reads Json file to return the Clash player's clan name
     * Check's to see if player is in clan. If so, it returns the clan name. If not it returns not in a clan
     */
    public String getClanName() throws JSONException {
        return PLAYER_INFO.has("clan") ? (String) PLAYER_INFO.getJSONObject("clan").get("name") : "Not in a clan";
    }

    /*
     * Reads Json file to return the Clash player's clan level
     * Check's to see if player is in clan. If so, it returns the clan level. If not it returns 0
     */
    public Integer getClanLevel() throws JSONException {
        return PLAYER_INFO.has("clan") ? (Integer) PLAYER_INFO.getJSONObject("clan").get("clanLevel") : 0;
    }

    /*
     * Reads Json file to return the Clash player's small clan badge url
     * Check's to see if player is in clan. If so, it returns the small clan badge url. If not it returns not in clan
     */
    public String getSmallClanBadge() throws JSONException {
        return PLAYER_INFO.has("clan") ? (String) PLAYER_INFO.getJSONObject("clan").getJSONObject("badgeUrls").get("small") : "Not in a clan";
    }

    /*
     * Reads Json file to return the Clash player's medium clan badge url
     * Check's to see if player is in clan. If so, it returns the medium clan badge url. If not it returns not in clan
     */
    public String getMediumClanBadge() throws JSONException {
        return PLAYER_INFO.has("clan") ? (String) PLAYER_INFO.getJSONObject("clan").getJSONObject("badgeUrls").get("medium") : "Not in a clan";
    }

    /*
     * Reads Json file to return the Clash player's large clan badge url
     * Check's to see if player is in clan. If so, it returns the large clan badge url. If not it returns not in clan
     */
    public String getLargeClanBadge() throws JSONException {
        return PLAYER_INFO.has("clan") ? (String) PLAYER_INFO.getJSONObject("clan").getJSONObject("badgeUrls").get("large") : "Not in a clan";
    }

    /*
     *****************************************************************
     *                                                               *
     *                     Player League Info                          *
     *                                                               *
     *****************************************************************
     */

    public Integer getLeagueID() throws JSONException {
        return PLAYER_INFO.has("league") ? (Integer) PLAYER_INFO.getJSONObject("league").get("id") : 0;
    }

    public String getLeagueName() throws JSONException {
        return PLAYER_INFO.has("league") ? (String) PLAYER_INFO.getJSONObject("league").get("name") : "Not in a League";
    }
    public String getSmallIconUrl() throws JSONException {
        return PLAYER_INFO.has("league") ? (String) PLAYER_INFO.getJSONObject("league").getJSONObject("iconUrls").get("small") : "Not in a League";

    }

    public String getTinyIconUrl() throws JSONException {
        return PLAYER_INFO.has("league") ? (String) PLAYER_INFO.getJSONObject("league").getJSONObject("iconUrls").get("tiny") : "Not in a League";

    }

    public String getMediumIconUrl() throws JSONException {
        return PLAYER_INFO.has("league") ? (String) PLAYER_INFO.getJSONObject("league").getJSONObject("iconUrls").get("medium") : "Not in a League";

    }

    public JSONArray getAchievements () throws JSONException {
        return PLAYER_INFO.has("achievements") ? PLAYER_INFO.getJSONArray("achievements") : new JSONArray("[]");
    }

}
