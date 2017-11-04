import java.util.List;
import java.util.ArrayList;

public class Card {
    public static void main(String[] args) {

        List<String> cards = new ArrayList<>();
        Deck deck = new Deck();
        deck.shuffle();

        Hand hand = new Hand();
        hand.getHand(cards);
        hand.showHand();

    }
}