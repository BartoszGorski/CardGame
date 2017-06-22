import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    private List<Card> deck;

    public Deck() {
        deck = new LinkedList<>();
        createDeck();
    }

    private void createDeck() {
        for (CardsTypes ct : CardsTypes.values()) {
            deck.add(new Card(ct, ColorsPalet.Karo));
            deck.add(new Card(ct, ColorsPalet.Kier));
            deck.add(new Card(ct, ColorsPalet.Trefl));
            deck.add(new Card(ct, ColorsPalet.Pik));
        }
    }

    public void showDeck() {
        for (Card c : deck) {
            c.showCard();
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card takeFirstCard() {
        Card c = deck.get(0);
        deck.remove(0);
        return c;
    }

    public int cardsAmountInDeck() {
        return deck.size();
    }
}
