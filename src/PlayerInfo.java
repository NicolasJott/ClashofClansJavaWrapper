import java.io.IOException;

public class PlayerInfo {

    public static void main(String[] args) throws IOException {
        String PLAYER_TAG = "QRRVVP99";
        String API_KEY = Tokens.getAPI_KEY();
        Player otter = new Player(API_KEY, PLAYER_TAG);
        Player cj = new Player (API_KEY, "V8VVOGUJ" );

        System.out.println("Player Tag: " + otter.getPlayerTag());
        System.out.println("Player Name: " + otter.getPlayerName());
        System.out.println("TownHall Level: " + otter.getTownHallLevel());





    }



}
