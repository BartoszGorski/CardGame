import java.util.ArrayList;
import java.util.List;

public class GameMeneger {

    private List<Player> players;

    GameMeneger(int playersAmount){
        players = new ArrayList<>();
        for (int i = 0; i < playersAmount; i++) {
            players.add(new Player());
        }
    }

    public void dealCards(int cardsDealToOnePlayer, Deck deck){
        for (int i = 0; i < cardsDealToOnePlayer; i++) {
            for (Player p : players) {
                if(deck.cardsAmountInDeck() > 0)
                p.addCardToHand(deck.takeFirstCard());
            }
        }
    }

    public void showPlayersCards(){
        int i=1;
        for (Player p : players) {
            System.out.println("Player " + i);
            p.showHand();
            i++;
        }
    }

    public void sortPlayresHand(){
        for (Player p : players) {
            p.sortCards();
        }
    }
}
