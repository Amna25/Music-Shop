package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Jazz", "Blue","Electric", 6,2, 500);
    }


    @Test
    public void hasStyle(){
        assertEquals("Jazz", guitar.getStyle());
    }
    @Test
    public void hasColour(){
        assertEquals("Blue", guitar.getColour());
    }
    @Test
    public void hasType(){
        assertEquals("Electric", guitar.getType());
    }
    @Test
    public void hasNumberOfDrums(){
        assertEquals(6, guitar.getNumOfStrings());
    }
    @Test
    public void hasNumberOfSticks(){
        assertEquals(2, guitar.getToneKnobs());
    }
    @Test
    public void canPlaySound(){
        assertEquals("a-woogah woogah", guitar.play());
    }
    @Test
    public void hasPrice(){
        assertEquals(500, guitar.getPrice(),0.01);
    }

}
