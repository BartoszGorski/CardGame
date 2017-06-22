public class Card{

    private ColorsPalet color;
    private CardsTypes cardType;

    public Card(CardsTypes cT, ColorsPalet c){
        cardType=cT;
        color=c;
    }

    public void showCard() {
        System.out.println(cardType.getFigure() + " " + color.name());
    }

    public CardsTypes getCardType(){
        return cardType;
    }

    public ColorsPalet getColor() {
        return color;
    }
}
