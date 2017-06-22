import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Player {

    private List<Card> hand;

    Player(){
        hand = new LinkedList<>();
    }

    public void addCardToHand(Card c){
        hand.add(c);
    }

    public void showHand(){
        for (Card c : hand) {
            c.showCard();
        }
        System.out.println("  ");
    }

    public void sortCards(){
        Collections.sort(hand, new Comparator<Card>() {
            public int compare(Card card1, Card card2) {
                int c;
                c = card1.getColor().compareTo(card2.getColor());
                if(c == 0) {
                   c = card1.getCardType().getValue() - card2.getCardType().getValue();
                }
                return c;
            }
        });
    }
}
