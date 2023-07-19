package dataTyped;

enum Level{
    LOW,
    MIDIUM,
    HIGH
};

enum Numbers{
    _1,
    _2,
    _3,
    _4
}

public class enuuuu {
    public static void main(String[] args) {
        Level myVal = Level.HIGH;
        System.out.println(myVal);

        switch (myVal){
            case LOW:
                break;
            case MIDIUM:
                break;
            case HIGH:
                System.out.println("High");
            default:
        }
    }
}
