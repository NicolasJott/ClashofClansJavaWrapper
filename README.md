# ClashofClansJavaWrapper
This program is a Java Wrapper used as an extension of the clash of clans REST API.

## In order to use this. You must obtain a JSON Web Token obtained from (https://developer.clashofclans.com/) 



``
        String PLAYER_TAG;
        String API_KEY = Tokens.getAPI_KEY();
        Player player = new Player(API_KEY, PLAYER_TAG);
       

        System.out.println("Player Tag: " + player.getPlayerTag());
        System.out.println("Player Name: " + player.getPlayerName());
        System.out.println("TownHall Level: " + player.getTownHallLevel());
        System.out.println("Experience Level: " + player.getExpLevel());
        System.out.println("Trophies: " + player.getTrophies());
        System.out.println("Best Trophies: " + player.getBestTrophies());
        System.out.println("Total War Stars: " + player.getTotalWarStars());
        System.out.println("Total Capital Contributions: " + player.getClanCapitalContributions());
``

