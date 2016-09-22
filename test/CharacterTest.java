import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Viscus on 9/22/16.
 */
public class CharacterTest {
    @Test
    public void testBattle() {
        Player player = new Player();
        player.name = "Test Player";
        player.location = "tunnel";
        player.weapon = "sword";
        Enemy enemy = new Enemy("Test Enemy", 10, 10);
        player.battle(enemy);
        assertTrue(player.health > 0);
        assertTrue(enemy.health <= 0);
    }

}