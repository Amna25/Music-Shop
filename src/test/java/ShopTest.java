import behaviours.ISell;
import items.GuitarAccessories;
import items.TrumpetAccessories;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    GuitarAccessories guitar;
  TrumpetAccessories trumpet;




    @Before
    public void before(){
        shop = new Shop();
        guitar = new GuitarAccessories("Guitar", "Guitar Cables", 200,100);
        trumpet = new TrumpetAccessories("Trumpet", "BergStone", 300,150);
        shop.addStock(guitar);
        shop.addStock(trumpet);


    }
    @Test
    public void canCountStock(){
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canAddStock() {
        assertEquals(2, shop.countStock());
    }
    @Test
    public void canRemoveStock(){
        shop.removeStock(guitar);
        assertEquals(1, shop.countStock());
    }
    @Test
    public void totalProfit(){
        assertEquals(250,shop.totalProfit(),0.01);

    }
}
