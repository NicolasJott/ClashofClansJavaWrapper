package coc.Player;

import coc.Tokens.Tokens;

import java.io.IOException;

public class PlayerInfo {

    public static void main(String[] args) throws IOException {
        String PLAYER_TAG = "QUROQGQRG";
        String API_KEY = Tokens.getAPI_KEY();
        Player player = new Player(API_KEY, PLAYER_TAG);

        System.out.println("Player Tag: " + player.getPlayerTag());
        System.out.println("Player Name: " + player.getPlayerName());
        System.out.println("TownHall Level: " + player.getTownHallLevel());

        if (player.getTownHallWeaponLevel() == 0) {
            System.out.println("TownHall weapon Level: Not yet unlocked");
        } else {
            System.out.println("TownHall Weapon Level: " + player.getTownHallWeaponLevel());
        }

        System.out.println("Experience Level: " + player.getExpLevel());
        System.out.println("Trophies: " + player.getTrophies());
        System.out.println("Best Trophies: " + player.getBestTrophies());
        System.out.println("Total War Stars: " + player.getTotalWarStars());
        System.out.println("Total Capital Contributions: " + player.getClanCapitalContributions());
        System.out.println("Clan Tag: " + player.getClanTag());
        System.out.println("Clan Name: " + player.getClanName());
        System.out.println("Clan Badge: " + player.getLargeClanBadge());





    }



}
