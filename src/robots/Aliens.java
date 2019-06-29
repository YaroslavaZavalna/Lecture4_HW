package robots;

import java.util.Random;

public class Aliens {
    private static final int A = 65;
    private static final int range = 65;

    public static char planetRandom(){
        Random r = new Random();
        return (char) (Math.round(A + r.nextInt(range)));
    }
}
