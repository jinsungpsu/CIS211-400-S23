import java.util.Arrays;

public class Deck {
    private Card[] cards = new Card[52];

    private int count = 0;

    // arrays need to declare a size
    // b/c they're allocated in contiguous memory

    public void addCard(Card card) {
        cards[count] = card;
        count++;
    }

    public Card playTopCard() {
        Card cardPlayed = cards[0];
        cards[0] = null;

        // shift all cards to the left
        for (int i = 1; i < cards.length; i++) {
            cards[i-1] = cards[i];
        }
        count--;
        return cardPlayed;
    }

    public void addCardToBottom(Card card) {

    }

    // probably need some stuff here as well
    // setters/getters/toString


    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", count=" + count +
                '}';
    }
}
