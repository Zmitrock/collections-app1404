package practice;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        FootballPlayer fp1 = new FootballPlayer("Leo", "Messi", 35, 10, 92, 10);
        FootballPlayer fp2 = new FootballPlayer("C", "Ronaldo", 36, 11, 91, 10);
        FootballPlayer fp3 = new FootballPlayer("G", "Bale", 40, 15, 90, 10);
        FootballPlayer fp4 = new FootballPlayer("S", "Ramos", 37, 132, 85, 10);
        FootballPlayer fp5 = new FootballPlayer("X", "Stranger", 37, 132, 85, 10);

        Set<FootballPlayer> fplayers = new HashSet<>(Arrays.asList(fp1, fp2, fp3, fp4));
        FootballTeam fTeam = new FootballTeam(1000000, "AllStars", "Zidan");
        fTeam.setPlayers(fplayers);
        fTeam.sellPlayer(fp3);
        fTeam.buyPlayer(fp5);
        for (FootballPlayer player : fTeam.getPlayers()) {
            System.out.println(player);
//            fTeam.getPlayers().remove(player);
        }
//        fTeam.getPlayers().iterator();


    }

}

