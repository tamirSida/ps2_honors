import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate an 8-bit number
        int x8 = random.nextInt(256); // 8-bit number ranges from 0 to 255
        int y8 = 23;
        int[] result8 = division.div(x8, y8);
        System.out.println("8-bit number: " + x8);
        System.out.println(x8 + " divided by 23 equals:");
        System.out.println("Quotient: " + result8[0]);
        System.out.println("Remainder: " + result8[1]);

        // Generate a 512-bit number
        BigInteger x512 = new BigInteger(512, random);
        BigInteger y512 = BigInteger.valueOf(12345);
        BigInteger[] result512 = x512.divideAndRemainder(y512);
        System.out.println("512-bit number: " + x512);
        System.out.println(x512 + " divided by 12345 equals:");
        System.out.println("Quotient: " + result512[0]);
        System.out.println("Remainder: " + result512[1]);
    }
}