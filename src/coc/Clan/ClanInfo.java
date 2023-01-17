package coc.Clan;

import coc.Events.GoldPass;
import coc.Tokens.Tokens;
import java.io.IOException;

public class ClanInfo {

    public static void main(String[] args) throws IOException {
        String CLAN_TAG = Tokens.getClanTag();
        String API_TOKEN = Tokens.getYsuApiKey();
        Clan clan = new Clan(API_TOKEN, CLAN_TAG);
        ClanCurrentWar clanWar = new ClanCurrentWar(API_TOKEN, CLAN_TAG);
        GoldPass goldPass = new GoldPass(API_TOKEN);


        System.out.println(clanWar.getWarRosterSize());

    }
}
