public class Card {
    private String suit;
    private int num;
    // don't worry about suit and num
    // you can make your program more fancy later using these if you want

    private int value;
    // each unique card will be given values 0 through 51
    // this also means no ties per round
    // less fun, b/c no "war" where ties happen
    // feel free to build this in later if you're interested

    // consider making constructors and setters, getters, toString

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card: " + value + "\n";
    }
}
