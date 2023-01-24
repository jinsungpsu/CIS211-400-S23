import java.util.ArrayList;
import java.util.Collections;

public class WarGame {
    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<>();

        // initialize a list of 52 integers then shuffle them
        for (int i = 0; i < 52; i++) {
            deck.add(i);
        }
        // take advantage of the built in shuffle method in the Collections class
        Collections.shuffle(deck);

        Deck player1 = new Deck();
        Deck player2 = new Deck();
        // create/deal the cards to each player
        // by using the shuffled list of integers
        for (int i = 0; i < 52; i++) {
            if (i%2==0)
                player1.addCard(new Card(deck.get(i)));
            else
                player2.addCard(new Card(deck.get(i)));
        }
        // check each player's deck of cards
        System.out.println("Player 1 has: ");
        System.out.println(player1);

        System.out.println("Player 2 has: ");
        System.out.println(player2);

        System.out.println("########### GAME STARTS NOW!!! #############");

        // round 1
        if (player1.playTopCard().getValue() > player2.playTopCard().getValue()) {
            // player 1 won round 1
            // player1.addCardToBottom();
        }


        // simplify the game quite a bit
        // don't worry about adding cards BACK into the
        // winner deck (per round)

        // can i display all cards in deck 1 and deck 2
        // System.out.println(player1);

        // can i display a specific card in deck 1
        // System.out.println(player1.getCards()[0]);

    }
}
