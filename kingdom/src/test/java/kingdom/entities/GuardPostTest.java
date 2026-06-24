package kingdom.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import kingdom.core.KingdomEntity;

class GuardPostTest {

    @Test
    void defaultConstructorShouldInitializeGuardPost() {
        GuardPost guardPost = new GuardPost();

        assertNotNull(guardPost.getIdentity());
        assertEquals("Guard Post", guardPost.getName());
        assertEquals(KingdomEntity.Status.UNDER_CONSTRUCTION,
                guardPost.getStatus());
        assertEquals(0, guardPost.getIncidentCount());
    }

    @Test
    void parameterizedConstructorShouldSetValues() {
        GuardPost guardPost = new GuardPost(
    "North Guard Post",
    "Protects the northern district"
);

        assertEquals("North Guard Post", guardPost.getName());
        assertEquals("Protects the northern district",
                guardPost.getDescription());
        assertEquals(KingdomEntity.Status.OPERATIONAL,
                guardPost.getStatus());
    }

    @Test
    void patrolShouldIncreaseIncidentCount() {
        GuardPost guardPost = new GuardPost();

        guardPost.patrol();

        assertEquals(1, guardPost.getIncidentCount());
    }

    @Test
    void reportToStationShouldReturnTrue() {
        GuardPost guardPost = new GuardPost();

        assertTrue(guardPost.reportToStation());
    }
}