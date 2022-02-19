package instruments;

public class Piano extends Instruments{
    private int numOfKeys;

    public Piano(String style, String colour,String type,String description, double sellingPrice, double buyingPrice, int numOfKeys) {
        super(type, description,sellingPrice,buyingPrice, style, colour);
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
