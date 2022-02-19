import behaviours.ISell;
import items.Accessories;
import items.GuitarAccessories;
import items.TrumpetAccessories;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell>stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int countStock() {
        return stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(GuitarAccessories item) {
        this.stock.remove(item);
    }

   public double totalProfit() {
       double total = 0.0;
       for(ISell item : stock){
           total += item.calculateMarkup();
       }
        return total;

   }


    }





