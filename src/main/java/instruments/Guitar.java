package instruments;

public class Guitar extends Instruments{
    int numOfStrings;
    int toneKnobs;

    public Guitar( String style, String colour, String type, int numOfStrings, int toneKnobs, double price) {
        super( style, colour, type, price);
        this.numOfStrings = numOfStrings;
        this.toneKnobs = toneKnobs;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public int getToneKnobs() {
        return toneKnobs;
    }

    @Override
    public String play() {
        return "a-woogah woogah";
    }

    @Override
    public double calculateMarkup() {
        return getPrice();
    }
}
