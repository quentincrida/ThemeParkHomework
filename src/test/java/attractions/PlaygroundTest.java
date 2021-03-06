package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorAdult;
    Visitor visitorKid;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorAdult = new Visitor(22, 175, 100);
        visitorKid = new Visitor(15, 122, 50);

    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }
    @Test
    public void adultsCantEnterFalse(){
        assertEquals(false, playground.isAllowedTo(visitorAdult));
    }
    @Test
    public void childrenCanEnterTrue(){
        assertEquals(true, playground.isAllowedTo(visitorKid));
    }

}