package instruments;

public class Guitar extends Instruments{
    int numOfStrings;
    int toneKnobs;

    public Guitar( String style, String colour,String type,String description, double sellingPrice, double buyingPrice, int toneKnobs) {
        super(type, description,sellingPrice,buyingPrice, style, colour);
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

}
