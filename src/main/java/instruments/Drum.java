package instruments;

public class Drum extends Instruments{
    private int numOfDrums;
    private int numOfSticks;

    public Drum( String style, String colour,String type,String description, double sellingPrice, double buyingPrice, int numOfDrums, int numOfSticks) {
        super(type, description,sellingPrice,buyingPrice, style, colour);
        this.numOfDrums = numOfDrums;
        this.numOfSticks = numOfSticks;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }

    public int getNumOfSticks() {
        return numOfSticks;
    }

    @Override
    public String play() {
        return "Cling Clang";
    }


}
