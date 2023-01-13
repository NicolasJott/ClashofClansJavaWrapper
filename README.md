# ClashofClansJavaWrapper
[`ClashofClansJavaWrapper`](https://github.com/NicolasJott/ClashofClansJavaWrapper)
is a Java Wrapper used as an extension of the clash of clans REST API to gather game related data .
## In order to use this. You must obtain a JSON Web Token from (https://developer.clashofclans.com/) and then replace API_KEY with your token in the form of a string ("").



```.java
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
```

