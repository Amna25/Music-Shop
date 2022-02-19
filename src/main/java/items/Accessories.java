package items;

import behaviours.ISell;

public abstract class Accessories implements ISell {
    private String type;
    private String description;
    private double sellingPrice;
    private double buyingPrice;

    public Accessories(String type,String description, double sellingPrice, double buyingPrice) {
        this.type = type;
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }



    public String getType() {
        return type;
    }
    public String getDescription(){
        return description;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
