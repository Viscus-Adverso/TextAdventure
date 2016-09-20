import java.util.Scanner;

/**
 * Created by Viscus on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Player player = new Player();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller!");

        boolean keepRunning = true;

        while (keepRunning) {
            player.chooseName();
            player.chooseWeapon();
            player.chooseLocation();
            player.findItem("shield");
            player.findItem("potion");

            Enemy ogre = new Enemy("Ogre", 10, 10);
            player.battle(ogre);

            System.out.println("You win!");
            System.out.println("Would you like to play again? Type y or n");

            String answer = customLine();
            if (answer.equalsIgnoreCase("n")){
                keepRunning = false;
            }
        }

        System.out.println("Game over.");
    }

    static String customLine() {
        String line = scanner.nextLine();
        while (line.startsWith("/")) {
            switch (line) {
                case "/exit":
                    System.exit(0);
                    break;
                case "/inv":
                    for (String item : player.items) {
                        System.out.println(item);
                    }
                    if (player.items.isEmpty()) {
                        System.out.println("You have no items.");
                    }
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;

            }
            line = scanner.nextLine();
        }
        return line;
    }
}
