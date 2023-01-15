package coc.Clan;

import coc.Tokens.Tokens;
import java.io.IOException;

public class ClanInfo {

    public static void main(String[] args) throws IOException {
        String CLAN_TAG = "2QPOPPVC9";
        String API_TOKEN = Tokens.getAPI_KEY();
        Clan clan = new Clan(API_TOKEN, CLAN_TAG);


        System.out.println(clan.getClanMembers());

    }
}
