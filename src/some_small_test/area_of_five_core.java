package some_small_test;

import java.util.Scanner;
/**
 * 计算五角星的面积
 * */
    public class area_of_five_core {
        public static void main(String[] args)
        {
            final double PI=3.1415926;
            Scanner input=new Scanner(System.in);
            System.out.println("请输入五边形中心到顶点的距离：");
            double r=input.nextDouble();
            double s=2*r*Math.sin(PI/5);
            double area=5.0*Math.pow(s,2)/(4*Math.tan(PI/5));
            System.out.println(area);
        }
}
