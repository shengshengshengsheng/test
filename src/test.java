import Stack.StackOfIntegers;

import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        System.out.println("50! is\n"+factorial(50));
    }

    private static BigInteger factorial(int n) {
        BigInteger bigInteger=BigInteger.ONE;
        for(int i=1;i<=n;i++)
            bigInteger=bigInteger.multiply(new BigInteger(i+""));
        return bigInteger;
    }

}
