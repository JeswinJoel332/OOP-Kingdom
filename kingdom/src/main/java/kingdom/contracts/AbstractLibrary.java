package kingdom.contracts;

import kingdom.core.KingdomEntity;
import java.util.List;

public abstract class AbstractLibrary implements KingdomEntity {

    /**
     * Adds a new scroll to the library's collection.
     * @param scrollName the name of the scroll
     */
    public abstract void addScroll(String scrollName);

    /**
     * Gets a list of all scrolls in the library.
     * @return list of scroll names
     */
    public abstract List<String> getScrolls();

    /**
     * Checks if a specific scroll exists in the library.
     * @param scrollName the name of the scroll
     * @return true if the scroll exists
     */
    public abstract boolean hasScroll(String scrollName);
}