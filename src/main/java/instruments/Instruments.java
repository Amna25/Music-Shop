package instruments;

import behaviours.IPlay;

public abstract class Instruments implements IPlay {

    private String style;
    private String colour;
    private String type;
    private double price;

    public Instruments( String style, String colour, String type, double price) {
        this.style = style;
        this.colour = colour;
        this.type = type;
        this.price = price;
    }


    public String getStyle() {
        return style;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getPrice(){
        return price;
    }
}
