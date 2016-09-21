import java.util.ArrayList;

/**
 * Created by Viscus on 9/14/16.
 */
public class Player extends Character {
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    public Player() {
        this.health = 20;
        this.damage =20;
    }

    void chooseName() {
        System.out.println("What is your name?");
        name = Game.customLine();
        System.out.printf("Welcome, %s\n", name);
    }

    void chooseWeapon() {
        //chooseWeapon(); <--bad recursion, becomes a stack overflow
        System.out.println("Do you want a sword or mace");
        weapon = Game.customLine();

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
        location = Game.customLine();

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
        System.out.printf("You Found a %s! Press y to pick it up.\n", item);
        String answer = Game.customLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.printf("You pick %s up!\n", item);
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
