package coc.Player;

import coc.Tokens.Tokens;

import java.io.IOException;

public class PlayerInfo {

    public static void main(String[] args) throws IOException {
        String PLAYER_TAG = Tokens.getOtter();
        String API_KEY = Tokens.getYsuApiKey();
        Player player = new Player(API_KEY, PLAYER_TAG);

        System.out.println(player.getAchievements());






    }



}
