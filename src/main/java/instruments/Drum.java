package instruments;

public class Drum extends Instruments{
    private int numOfDrums;
    private int numOfSticks;

    public Drum( String style, String colour, String type, int numOfDrums, int numOfSticks,double price) {
        super( style, colour, type, price);
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

    @Override
    public double calculateMarkup() {
        return getPrice();
    }
}
