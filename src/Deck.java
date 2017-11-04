import java.util.*;
class Deck {
    private static final String[] suits = {
        "hearts", "diamonds", "clubs", "spades"
    };
    
    private static final String[] ranks = {
        "A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2"
    };

    private List<String> cards;
    private String[] hand = new String[5];

    public Deck() {
        this.cards = new LinkedList<>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                this.cards.add(ranks[j] + suits[i]);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public String drawCard() throws NoSuchElementException {
        if (this.cards.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.cards.remove(0);
    }

    public void returnCard(String card) {
        this.cards.add(card);
    }

    public String toString() {
        return String.join(" ", this.cards);
    }
    
    public String[] getHand(List<String> cards) {//needs update
		return hand;
    }
    
}