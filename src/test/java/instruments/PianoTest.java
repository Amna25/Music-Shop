package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Pop Rock","Purple", "Parlor Grand", 88, 4000);
    }

    @Test
    public void hasStyle(){
        assertEquals("Pop Rock", piano.getStyle());
    }
    @Test
    public void hasColour(){
        assertEquals("Purple",piano.getColour());
    }
    @Test
    public void hasType(){
        assertEquals("Parlor Grand", piano.getType());
    }
    @Test
    public void hasNumberOfDrums(){
        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void canPlaySound(){
        assertEquals("tone tone na na na", piano.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(4000, piano.calculateMarkup(),0.01);
    }

}
