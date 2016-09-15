import java.util.Scanner;

/**
 * Created by Viscus on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller!");

        boolean keepRunning = true;

        while (keepRunning) {
            Player player = new Player();
            player.chooseName();
            player.chooseWeapon();
            player.chooseLocation();
            player.findItem("shield");
            player.findItem("potion");

            System.out.println("You win!");
            System.out.println("Would you like to play again? Type y or n");

            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")){
                keepRunning = false;
            }
        }

        System.out.println("Game over.");
    }
}
