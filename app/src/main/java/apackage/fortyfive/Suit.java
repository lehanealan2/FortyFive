package apackage.fortyfive;

public enum Suit {
    SPADE,HEART,CLUB,DIAMOND;

    public static Suit parse(Integer number){
        Suit output = null;
        switch(number){
            case 0:
                output = Suit.SPADE;
                break;
            case 1:
                output = Suit.HEART;
                break;
            case 2:
                output = Suit.CLUB;
                break;
            case 3:
                output = Suit.DIAMOND;
                break;
        }

        return output;
    }
}
