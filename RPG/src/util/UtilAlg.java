package util;

import java.util.Random;


public class UtilAlg {
    public static int getRandom(int min, int max){
        Random r = new Random();
        return r.nextInt(1 + (max - min)) + min;
    }
}
