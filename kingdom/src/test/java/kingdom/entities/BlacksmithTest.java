package kingdom.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BlacksmithTest {

    @Test
    void testForgeWeapon() {
        Blacksmith blacksmith = new Blacksmith("Royal Forge", "Weapon crafting");

        blacksmith.forgeWeapon();
        blacksmith.forgeWeapon();

        assertEquals(2, blacksmith.getWeaponCount());
    }

    @Test
    void testRepairAnvil() {
        Blacksmith blacksmith = new Blacksmith("Royal Forge", "Weapon crafting");

        for (int i = 0; i < 100; i++) {
            blacksmith.forgeWeapon();
        }

        assertEquals(Blacksmith.Status.DAMAGED, blacksmith.getStatus());

        blacksmith.repairAnvil();

        assertEquals(Blacksmith.Status.OPERATIONAL, blacksmith.getStatus());
    }
}