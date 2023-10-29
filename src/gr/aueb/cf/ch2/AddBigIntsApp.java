package gr.aueb.cf.ch2;


import java.math.BigInteger;

public class AddBigIntsApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("213457586789555555555555555555555555555555");
        BigInteger bigNum2 = new BigInteger("12345678999994");
        BigInteger result = bigNum1.add(bigNum2) ;

        System.out.printf("%,d%n", result);
    }
}
