/**
 * Created by Viscus on 9/14/16.
 */
public class Player {
    String name;
    String weapon;
    String location;

    void chooseName() {
        System.out.println("What is your name?");
        name = Game.scanner.nextLine();
        System.out.println("Welcome," + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("Do you want a sword or mace");
        weapon = Game.scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")){
            System.out.println("Here is your sword!");
        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.printf("Here is your mace!");
        }
        else {
            throw new Exception("Invalid weapon.");
        }
    }
    void chooseLocation() throws Exception {
        System.out.println("Would you like to go to the tunnel or the forest?");
        location = Game.scanner.nextLine();

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
