package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    Drum drum;

    @Before
    public void before(){
        drum = new Drum("Kick Drum","Red", "808Neutron", 4,2);
    }

    @Test
    public void hasStyle(){
        assertEquals("Kick Drum", drum.getStyle());
    }


}
