package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    Drum drum;

    @Before
    public void before(){
        drum = new Drum("Kick Drum","Red", "808Neutron", 4,2, 2000);
    }

    @Test
    public void hasStyle(){
        assertEquals("Kick Drum", drum.getStyle());
    }
    @Test
    public void hasColour(){
        assertEquals("Red", drum.getColour());
    }
    @Test
    public void hasType(){
        assertEquals("808Neutron", drum.getType());
    }
    @Test
    public void hasNumberOfDrums(){
        assertEquals(4, drum.getNumOfDrums());
    }
    @Test
    public void hasNumberOfSticks(){
        assertEquals(2, drum.getNumOfSticks());
    }
    @Test
    public void canPlaySound(){
        assertEquals("Cling Clang", drum.play());
    }
    @Test
    public void hasPrice(){
        assertEquals(2000, drum.getPrice(),0.01);
    }


}
