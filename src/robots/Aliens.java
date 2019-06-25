package robots;

import java.util.Random;

public class Aliens {
    public static char planetRandom(){
        Random r = new Random();
        return (char) (Math.round(65 + r.nextInt(3)));
    }
}
