import java.util.Scanner;

/**
 * Created by Viscus on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller!");

        Player player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();


    }
}
