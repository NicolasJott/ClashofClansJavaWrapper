package coc.Clan;

import coc.HttpRequest.ServerConnection;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class ClanCurrentWar {

    private final JSONObject WAR_INFO;

    public ClanCurrentWar(String api_key, String clan_tag) throws IOException {

        WAR_INFO = ServerConnection.connectWithResults(api_key, ServerConnection.ENDPOINT + ServerConnection.API_VER
                + "/clans/%23" + clan_tag + "/currentwar");
    }

    public String getWarState() throws JSONException {
        return (String) WAR_INFO.get("state");
    }

    public Integer getWarRosterSize() throws JSONException {
        if (Objects.equals(getWarState(), "notInWar")) {
            return 0;
        }
        return (Integer) WAR_INFO.get("teamSize");
    }

    public Integer getCurrentStars() throws JSONException {
        return (Integer) WAR_INFO.getJSONObject("clan").get("stars");
    }

    public Integer getCurrentAttacks() throws JSONException {
        return (Integer) WAR_INFO.getJSONObject("clan").get("attacks");
    }

    public BigDecimal getWarDestructionPercentage() throws JSONException {
        return (BigDecimal) WAR_INFO.getJSONObject("clan").get("destructionPercentage");
    }

    public Integer getOpponentCurrentStars() throws JSONException {
        return (Integer) WAR_INFO.getJSONObject("opponent").get("stars");
    }

    public Integer getOpponentCurrentAttacks() throws JSONException {
        return (Integer) WAR_INFO.getJSONObject("opponent").get("attacks");
    }

    public BigDecimal getOpponentWarDestructionPercentage() throws JSONException {
        return (BigDecimal) WAR_INFO.getJSONObject("opponent").get("destructionPercentage");
    }


}
