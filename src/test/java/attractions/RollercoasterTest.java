package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorAdult;
    Visitor visitorKid;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorAdult = new Visitor(22, 175,100);
        visitorKid = new Visitor(10, 140, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void canGoOnRollercoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorAdult));
    }
    @Test
    public void cantGoOnRollercoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorKid));
    }
}
