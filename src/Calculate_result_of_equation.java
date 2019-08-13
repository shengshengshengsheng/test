import java.util.Scanner;
/**
 * 计算方程的根
 * */
public class Calculate_result_of_equation {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入a：");
        double a=input.nextDouble();
        System.out.println("请输入b：");
        double b=input.nextDouble();
        System.out.println("请输入c：");
        double c=input.nextDouble();
        if(b*b-4*a*c<0)
        {
            System.out.println("no result");
        }
        else if(b*b-4*a*c==0)
        {
            System.out.println("one result:"+((-b)/(2*a)));
        }
        else
        {
            double result1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            double result2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("the first result:"+result1);
            System.out.println("the second result:"+result2);
        }

    }
}
