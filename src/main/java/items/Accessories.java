package items;

import behaviours.ISell;

public class Accessories implements ISell {
    private String item;
    private double sellingPrice;
    private double buyingPrice;

    public Accessories(String item, double sellingPrice, double buyingPrice) {
        this.item = item;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getItem() {
        return item;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice;
    }
}
