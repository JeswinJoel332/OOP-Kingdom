package kingdom.contracts;

import kingdom.core.KingdomEntity;
import java.util.List;

public abstract class AbstractTavern implements KingdomEntity {

    /**
     * Hires a new hero at the tavern.
     * @param heroName the name of the hero to hire
     */
    public abstract void hireHero(String heroName);

    /**
     * Gets a list of all hired heroes currently at the tavern.
     * @return list of hero names
     */
    public abstract List<String> getHeroes();

    /**
     * Rests at the tavern, restoring status to OPERATIONAL if DAMAGED.
     */
    public abstract void rest();
}