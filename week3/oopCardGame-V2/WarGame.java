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

        // round 1
        if (player1.playTopCard().getValue() > player2.playTopCard().getValue()) {
            // player 1 won round 1
            // player1.addCardToBottom();
        }








        // simplify the game quite a bit
        // don't worry about adding cards BACK into the
        // winner deck (per round)

        // can i display all cards in deck 1 and deck 2
        System.out.println(player1);

        // can i display a specific card in deck 1
        System.out.println(player1.getCards()[0]);

    }
}
