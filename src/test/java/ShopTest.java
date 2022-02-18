import behaviours.ISell;
import items.GuitarAccessories;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    GuitarAccessories item;


    @Before
    public void before(){
        shop = new Shop();
        item = new GuitarAccessories("Guitar", "Guitar Cables", 200,100);

    }
    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStock() {
        shop.addStock(item);
        assertEquals(1, shop.countStock());
    }
    @Test
    public void canRemoveStock(){
        shop.addStock(item);
        shop.addStock(item);
        shop.addStock(item);
        shop.removeStock(item);
        assertEquals(2, shop.countStock());

    }
}
