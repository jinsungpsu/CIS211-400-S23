public class Deck {
    private Card[] cards = new Card[52];

    private int count = 0;

    // arrays need to declare a size
    // b/c they're allocated in contiguous memory

    public void addCard(Card card) {
        cards[count] = card;
        count++;
    }

    // probably need some stuff here as well
    // setters/getters/toString
}
