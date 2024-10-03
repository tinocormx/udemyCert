package example;

import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println("random = " + random);
        random *= 7;
        System.out.println("random = " + random);
        System.out.println("Math.floor(random) = " +  Math.floor(random));

        Random ran  = new Random();
        int randomInt = ran.nextInt();
        System.out.println("randomInt = " + randomInt);

        long randomLong  = ran.nextLong();
        System.out.println("randomLong = " + randomLong);
    }
}