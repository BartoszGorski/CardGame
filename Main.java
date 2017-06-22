
public class Main {
    public static void main(String[] args){

        Deck deck = new Deck();
        deck.shuffleDeck();
//        deck.showDeck();

        GameMeneger gameMeneger= new GameMeneger(4);
        gameMeneger.dealCards(6,deck);
        gameMeneger.sortPlayresHand();
        gameMeneger.showPlayersCards();

    }
}
