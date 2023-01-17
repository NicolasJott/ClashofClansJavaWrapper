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
                + "/clans/%23" + clan_tag);
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

    public Integer getLocationID() throws JSONException {
        return (Integer) CLAN_INFO.getJSONObject("location").get("id");
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

    public Integer getRequiredVersusTrophies() throws JSONException {
        return (Integer) CLAN_INFO.get("requiredVersusTrophies");
    }

    public Integer getRequiredTownhallLevel() throws JSONException {
        return (Integer) CLAN_INFO.get("requiredTownhallLevel");
    }

    public Integer getCapitalHallLevel() throws JSONException {
        return CLAN_INFO.has("clanCapital") ? (Integer) CLAN_INFO.getJSONObject("clanCapital").get("capitalHallLevel") : 0;
    }

    public Integer getCapitalPeakLevel() throws JSONException {
        if (Objects.equals(CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(0).get("id"), 70000000)) {
            return (Integer) CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(0).get("districtHallLevel");
        }
        return 0;
    }

    public Integer getBarbarianCampLevel() throws JSONException {
        if (Objects.equals(CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(1).get("id"), 70000001)) {
            return (Integer) CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(1).get("districtHallLevel");
        }
        return 0;
    }

    public Integer getWizardValleyLevel() throws JSONException {
        if (Objects.equals(CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(2).get("id"), 70000002)) {
            return (Integer) CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(2).get("districtHallLevel");
        }
        return 0;
    }

    public Integer getBalloonLagoonLevel() throws JSONException {
        if (Objects.equals(CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(3).get("id"), 70000003)) {
            return (Integer) CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(3).get("districtHallLevel");
        }
        return 0;
    }

    public Integer getBuildersWorkshopLevel() throws JSONException {
        if (Objects.equals(CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(4).get("id"), 70000004)) {
            return (Integer) CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(4).get("districtHallLevel");
        }
        return 0;
    }

    public Integer getDragonCliffsLevel() throws JSONException {
        if (Objects.equals(CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(5).get("id"), 70000005)) {
            return (Integer) CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(5).get("districtHallLevel");
        }
        return 0;
    }

    public Integer getGolemQuarryLevel() throws JSONException {
        if (Objects.equals(CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(6).get("id"), 70000006)) {
            return (Integer) CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(6).get("districtHallLevel");
        }
        return 0;
    }

    public Integer getSkeletonParkLevel() throws JSONException {

        try {
            if (Objects.equals(CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(7).get("id"), 70000007)) {
                return (Integer) CLAN_INFO.getJSONObject("clanCapital").getJSONArray("districts").getJSONObject(7).get("districtHallLevel");
            }
        } catch (JSONException e){
            System.out.println("Not Unlocked Yet");
        }

        return null;
    }

    public JSONArray getClanMembers() throws JSONException {
        Integer numMembers = (Integer) CLAN_INFO.get("members");
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
