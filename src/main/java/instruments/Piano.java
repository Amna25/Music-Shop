package instruments;

public class Piano extends Instruments{
    private int numOfKeys;

    public Piano( String style, String colour, String type,double price, int numOfKeys) {
        super( style, colour, type, price);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    @Override
    public String play() {
        return "tone tone na na na";
    }
}
