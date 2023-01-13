import java.io.IOException;

public class PlayerInfo {

    public static void main(String[] args) throws IOException {
        String API_KEY = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjkyNTNmNThkLTdhYjMtNDhlZi1hZGI2LTI5MDcyNzE5MTRjNiIsImlhdCI6MTY3MzU3NDc4NSwic3ViIjoiZGV2ZWxvcGVyLzkwYjUyMDQ3LWYxNDUtMDRmNS01ZTQ5LWMwNTBhN2MxYzg1NiIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjE3NC4xMDAuMTc5LjExMyJdLCJ0eXBlIjoiY2xpZW50In1dfQ.wncYuylQZojZ-4oA00Jdtola8srUbr3Ks1Yg1E6rlEvRiM8LgBjSpowjC7NwaFIjVAckBfmM-ZNnfZMQuX4nQg";
        String PLAYER_TAG = "QRRVVP99";

        Player otter = new Player(API_KEY, PLAYER_TAG);
        Player cj = new Player (API_KEY, "V8VVOGUJ" );

        System.out.println("Player Tag: " + otter.getPlayerTag());
        System.out.println("Player Name: " + otter.getPlayerName());
        System.out.println("TownHall Level: " + otter.getTownHallLevel());





    }



}
