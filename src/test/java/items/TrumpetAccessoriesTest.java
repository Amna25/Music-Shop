package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetAccessoriesTest {

    TrumpetAccessories accessories;

    @Before
    public void before(){
        accessories = new TrumpetAccessories("Trumpet", "BergStone", 300,150);
    }

    @Test
    public void hasItem(){
        assertEquals("Trumpet",accessories.getType());
    }
    @Test
    public void hasDescription(){
        assertEquals("BergStone", accessories.getDescription());
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(300, accessories.getSellingPrice(),0.01);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(150, accessories.getBuyingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(300, accessories.calculateMarkup(), 0.01);
    }
}
