package instruments;

public class Piano extends Instruments{
    private int numOfKeys;

    public Piano( String style, String colour, String type, int numOfKeys) {
        super( style, colour, type);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    @Override
    public String play() {
        return null;
    }
}
