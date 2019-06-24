package robots;

import java.util.Random;

public class Aliens {
    public static char planetRandom(){
        Random r = new Random();
        char planetRand = (char) (65 + r.nextInt(3));
        return planetRand;
    }
}
