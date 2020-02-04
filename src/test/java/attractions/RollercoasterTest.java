package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorAdult;
    Visitor visitorKid;
    Visitor tallKid;
    Visitor reallyTallAdult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitorAdult = new Visitor(22, 175,100);
        visitorKid = new Visitor(10, 140, 50);
        tallKid = new Visitor(8, 146, 25);
        reallyTallAdult = new Visitor(26, 201, 75);
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
        assertEquals(true, rollerCoaster.isAllowedTo(visitorAdult));
    }
    @Test
    public void evenTallKidsFalse(){
        assertEquals(false, rollerCoaster.isAllowedTo(tallKid));
    }
    @Test
    public void defaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }
   @Test
   public void priceFor(){
       assertEquals(16.80, rollerCoaster.priceFor(reallyTallAdult), 0.02);
       assertEquals(8.4, rollerCoaster.priceFor(visitorKid), 0.02);
    }
}
