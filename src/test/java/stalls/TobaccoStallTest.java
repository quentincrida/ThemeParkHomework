package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorAdult;
    Visitor visitorKid;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitorAdult = new Visitor(22, 175, 100);
        visitorKid = new Visitor(15, 122, 50);  }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }
    @Test

    public void adultsCanSmoke(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorAdult));
    }
    public void childrenCantSmoke(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitorKid));
    }

}
