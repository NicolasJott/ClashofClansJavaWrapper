package coc.Clan;

import coc.Events.GoldPass;
import coc.Tokens.Tokens;
import java.io.IOException;

public class ClanInfo {

    public static void main(String[] args) throws IOException {
        String CLAN_TAG = "2QPOPPVC9";
        String API_TOKEN = Tokens.getAPI_KEY();
        Clan clan = new Clan(API_TOKEN, CLAN_TAG);
        GoldPass goldPass = new GoldPass(API_TOKEN);


        System.out.println(goldPass.getEndTime());

    }
}
