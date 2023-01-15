package coc.Clan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import coc.HttpRequest.ServerConnection;
import java.io.IOException;
import java.util.*;

public class Clan {
    private final JSONObject CLAN_INFO;

    public Clan(String api_key, String clan_tag) throws IOException {

        CLAN_INFO = ServerConnection.connectWithResults(api_key, ServerConnection.ENDPOINT + ServerConnection.API_VER
                + "/clans/%23" + clan_tag, clan_tag);
    }

    public String getTag() throws JSONException {
        return (String) CLAN_INFO.get("tag");
    }

    public String getName() throws JSONException {
        return (String) CLAN_INFO.get("name");
    }

    public String getType() throws JSONException {
        return (String) CLAN_INFO.get("type");
    }

    public String getDescription() throws JSONException {
        return (String) CLAN_INFO.get("description");
    }

    public int getLocationID() throws JSONException {
        return (int) CLAN_INFO.getJSONObject("location").get("id");
    }

    public String getLocationName() throws JSONException {
        return (String) CLAN_INFO.getJSONObject("location").get("name");
    }

    public boolean getIsCountry() throws JSONException {
        return (boolean) CLAN_INFO.getJSONObject("location").get("isCountry");
    }

    public String getCountryCode() throws JSONException {
        return (String) CLAN_INFO.getJSONObject("location").get("countryCode");
    }

    public JSONArray getClanMembers() throws JSONException {
        int numMembers = (int) CLAN_INFO.get("members");
        JSONArray members = new JSONArray();
        for (int i = 0; i < numMembers; i++) {
            JSONObject temp = new JSONObject();
            temp.put("name", CLAN_INFO.getJSONArray("memberList").getJSONObject(i).get("name").toString());
            temp.put("tag", CLAN_INFO.getJSONArray("memberList").getJSONObject(i).get("tag").toString());
            members.put(temp);
        }

        return members;
    }

}
