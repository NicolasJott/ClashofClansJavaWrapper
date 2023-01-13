package coc.Clan;

import org.json.JSONException;
import org.json.JSONObject;

import coc.HttpRequest.ServerConnection;
import java.io.IOException;

public class Clan {
    private final JSONObject CLAN_INFO;

    public Clan(String api_key, String clan_tag) throws IOException {

        CLAN_INFO = ServerConnection.connectWithResults(api_key, ServerConnection.ENDPOINT + ServerConnection.API_VER
                + "/clans/%23" + clan_tag, clan_tag);
    }

    public String getTag() throws JSONException {
        return (String) CLAN_INFO.get("tag");
    }
}
