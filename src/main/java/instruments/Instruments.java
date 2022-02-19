package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items.Accessories;

public abstract class Instruments extends Accessories implements IPlay {

    private String style;
    private String colour;


    public Instruments( String type,String description, double sellingPrice, double buyingPrice, String style, String colour) {
        super(type,description,sellingPrice,buyingPrice);
        this.style = style;
        this.colour = colour;

    }


    public String getStyle() {
        return style;
    }

    public String getColour() {
        return colour;
    }


}
