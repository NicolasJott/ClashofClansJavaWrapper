package coc.Events;

import coc.HttpRequest.ServerConnection;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class GoldPass {
    private final JSONObject GOLD_PASS_INFO;

    public GoldPass(String api_key) throws IOException {

        GOLD_PASS_INFO = ServerConnection.connectWithResults(api_key, ServerConnection.ENDPOINT + ServerConnection.API_VER
                + "/goldpass/seasons/current");
    }

    public String getStartTime() throws JSONException {
        return (String) GOLD_PASS_INFO.get("startTime");
    }

    public String getEndTime() throws JSONException {
        return (String) GOLD_PASS_INFO.get("endTime");
    }
}
