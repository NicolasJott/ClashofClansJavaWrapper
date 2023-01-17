package coc.Clan;

import coc.HttpRequest.ServerConnection;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class ClanCurrentWar {

    private final JSONObject WAR_INFO;

    public ClanCurrentWar(String api_key, String clan_tag) throws IOException {

        WAR_INFO = ServerConnection.connectWithResults(api_key, ServerConnection.ENDPOINT + ServerConnection.API_VER
                + "/clans/%23" + clan_tag + "/currentwar");
    }

    public String getWarState() throws JSONException {
        return (String) WAR_INFO.get("state");
    }

    public int getWarRosterSize() throws JSONException {
        return (int) WAR_INFO.get("teamSize");
    }

}
