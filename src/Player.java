import java.util.ArrayList;

/**
 * Created by Viscus on 9/14/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    void chooseName() {
        System.out.println("What is your name?");
        name = Game.scanner.nextLine();
        System.out.println("Welcome," + name);
    }

    void chooseWeapon() {
        //chooseWeapon(); <--bad recursion, becomes a stack overflow
        System.out.println("Do you want a sword or mace");
        weapon = Game.scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")){
            System.out.println("Here is your sword!");
        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.printf("Here is your mace!");
        }
        else {
            //throw new Exception("Invalid weapon.");  <---crashes the game on a wrong choice
            System.out.println("Weapon not recognized");
            chooseWeapon();
        }
    }
    void chooseLocation() {
        System.out.println("Would you like to go to the tunnel or the forest?");
        location = Game.scanner.nextLine();

        if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        }
        else if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest..");
        }
        else {
            System.out.println("Location not recognized");
            chooseLocation();
        }
    }

    void findItem(String item) {
        System.out.println("You Found a " + item+ "! Press y to pick up.");
        String answer = Game.scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked" + item+ "up, it has been added to your inventory.");
        }
    }
}
