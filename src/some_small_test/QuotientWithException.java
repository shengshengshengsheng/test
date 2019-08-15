package some_small_test;

import java.util.Scanner;

public class QuotientWithException {
    public static double quotient(double number1,double number2)
    {
        if (number2==0)
            throw new ArithmeticException("Divisor can not be zero");
        return number1/number2;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("please input two numbers:");
        double number1=input.nextDouble();
        double number2=input.nextDouble();
        try{
            double result=quotient(number1,number2);
            System.out.println(number1+"/"+number2+"="+result);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Exceptions:an integer can not be divided by zero");
        }
        System.out.println("Exception continues.....");
    }

}
