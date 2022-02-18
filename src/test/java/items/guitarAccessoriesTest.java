package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class guitarAccessoriesTest {
   GuitarAccessories item;

    @Before
    public void before(){
        item = new GuitarAccessories("Guitar", "Guitar Cables", 200,100);
    }

    @Test
    public void hasItem(){
        assertEquals("Guitar",item.getType());
    }
    @Test
    public void hasDescription(){
        assertEquals("Guitar Cables", item.getDescription());
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(200, item.getSellingPrice(),0.01);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(100, item.getBuyingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(200, item.calculateMarkup(), 0.01);
    }
}
