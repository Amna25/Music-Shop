package instruments;

import behaviours.IPlay;

public abstract class Instruments implements IPlay {

    private String style;
    private String colour;
    private String type;

    public Instruments( String style, String colour, String type) {
        this.style = style;
        this.colour = colour;
        this.type = type;
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
}
