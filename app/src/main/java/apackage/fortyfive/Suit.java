package apackage.fortyfive;

public enum Suit {
    SPADE{
        @Override
        public Color getColor(){
            return Color.BLACK;
        }
    },HEART{
        @Override
        public Color getColor(){
            return Color.RED;
        }
    },CLUB{
        @Override
        public Color getColor(){
            return Color.BLACK;
        }
    },DIAMOND{
        @Override
        public Color getColor(){
            return Color.RED;
        }
    };

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

    public abstract Color getColor();
}
