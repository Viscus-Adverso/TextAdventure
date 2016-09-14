import java.util.Scanner;

/**
 * Created by Viscus on 9/14/16.
 */
public class Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller!");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome," + name);

        System.out.println("Do you want a sword or mace");
        String weapon = scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")){
            System.out.println("Here is your sword!");
        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.printf("Here is your mace!");
        }
        else {
            throw new Exception("Invalid weapon.");
        }

        System.out.println("Would you like to go to the tunnel or the forest?");
        String location = scanner.nextLine();

        if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        }
        else if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest..");
        }
        else {
            throw new Exception("Invalid location.");
        }
    }
}
