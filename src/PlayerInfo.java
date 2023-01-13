import Tokens.Tokens;

import java.io.IOException;

public class PlayerInfo {

    public static void main(String[] args) throws IOException {
        String PLAYER_TAG = "QRRVVP99";
        String API_KEY = Tokens.getAPI_KEY();
        Player otter = new Player(API_KEY, PLAYER_TAG);
        Player cj = new Player (API_KEY, "V8VVOGUJ" );
        Player berry = new Player (API_KEY, "GOR22PRL2" );

        System.out.println("Player Tag: " + berry.getPlayerTag());
        System.out.println("Player Name: " + berry.getPlayerName());
        System.out.println("TownHall Level: " + berry.getTownHallLevel());

        if (berry.getTownHallWeaponLevel() == 0) {
            System.out.println("TownHall weapon Level: Not yet unlocked");
        } else {
            System.out.println("TownHall Weapon Level: " + berry.getTownHallWeaponLevel());
        }

        System.out.println("Experience Level: " + berry.getExpLevel());
        System.out.println("Trophies: " + berry.getTrophies());
        System.out.println("Best Trophies: " + berry.getBestTrophies());
        System.out.println("Total War Stars: " + berry.getTotalWarStars());
        System.out.println("Total Clan Capital Contributions: " + berry.getClanCapitalContributions());





    }



}
