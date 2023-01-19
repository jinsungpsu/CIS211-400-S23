public class WarGame {
    public static void main(String[] args) {
        Deck player1 = new Deck();
        Deck player2 = new Deck();

        // don't worry about shuffling
        for (int i = 0; i < 26; i++) {
            player1.addCard(new Card(i));
        }
        for (int i = 26; i < 52; i++) {
            player2.addCard(new Card(i));
        }
        
    }
}
