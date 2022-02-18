package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {
    Accessories accessories;

    @Before
    public void before(){
        accessories = new Accessories("MicroPhone", 200,100);
    }

    @Test
    public void hasItem(){
        assertEquals("Microphone", accessories.getItem());
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(200, accessories.getSellingPrice(),0.01);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(100, accessories.getBuyingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(200, accessories.calculateMarkup(), 0.01);
    }
}
