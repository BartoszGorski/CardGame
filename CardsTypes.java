public enum CardsTypes {
    one (1, "1"),
    two (2, "2"),
    three (3, "3"),
    four (4, "4"),
    five (5, "5"),
    six (6, "6"),
    seven (7, "7"),
    eight (8, "8"),
    nine (9, "9"),
    ten (10, "10"),
    J (11, "J"),
    Q (12, "Q"),
    K (13, "K"),
    A (14, "A");

    private String figure;
    private int value;
    CardsTypes(int val, String f){
        this.figure = f;
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public String getFigure() {
        return figure;
    }
}