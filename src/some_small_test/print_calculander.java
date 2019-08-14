package some_small_test;

import java.util.Scanner;
/**
 * 用户输入年月，打印输出当月的日历
 * */
public class print_calculander {
        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("请输入你要打印的年份：");
            int year=input.nextInt();
            System.out.println("请输入你要打印的月份：");
            int month=input.nextInt();
            int total_day=calcluate_total_day(year,month);
            int firstDay=total_day%7+1;
            int day_of_month=get_month(month);
            if(isLeapYear(year)&&month==2)
                day_of_month++;
            String month_name=get_month_name(month);
            System.out.printf("%15d%-20s",year,month_name);
            System.out.printf("\n");
            System.out.printf("------------------------------------\n");
            print_cal(firstDay,day_of_month);
        }

        private static void print_cal(int firstDay, int day_of_month) {
            for(int i=0;i<firstDay;i++)
                System.out.printf("    ");
            for(int i=1;i<=day_of_month;i++)
            {
                System.out.printf("%-4d",i);
                if(firstDay==7)
                {
                    System.out.printf("\n");
                    firstDay=1;
                }

                else
                {
                    System.out.printf(" ");
                    firstDay++;
                }

            }
        }
        private static int calcluate_total_day(int year, int month) {
            int total=0;
            for(int i=1900;i<year;i++)
            {
                if(isLeapYear(i))
                {
                    total+=366;
                }
                else
                {
                    total+=365;
                }
            }
            total+=get_day_of_month(month-1);
            if(isLeapYear(year)&&month>2)
                total++;
            return total;
        }
        private static String get_month_name(int i) {
            String day=null;
            switch (i)
            {
                case 1:
                    day="January";
                    break;
                case 2:
                    day="February";
                    break;
                case 3:
                    day="March";
                    break;
                case 4:
                    day="April";
                    break;
                case 5:
                    day="May";
                    break;
                case 6:
                    day="June";
                    break;
                case 7:
                    day="July";
                    break;
                case 8:
                    day="August";
                    break;
                case 9:
                    day="September";
                    break;
                case 10:
                    day="October";
                    break;
                case 11:
                    day="November";
                    break;
                case 12:
                    day="December";
                    break;
                default:
                    break;

            }
            return day;
        }
        private static int get_month(int i) {
            int day=0;
            switch (i)
            {
                case 1:
                    day=31;
                    break;
                case 2:
                    day=28;
                    break;
                case 3:
                    day=31;
                    break;
                case 4:
                    day=30;
                    break;
                case 5:
                    day=31;
                    break;
                case 6:
                    day=30;
                    break;
                case 7:
                    day=31;
                    break;
                case 8:
                    day=31;
                    break;
                case 9:
                    day=30;
                    break;
                case 10:
                    day=31;
                    break;
                case 11:
                    day=30;
                    break;
                case 12:
                    day=31;
                    break;
                default:
                    break;

            }
            return day;
        }
        private static int get_day_of_month(int i) {
            int day=0;
            switch (i)
            {
                case 1:
                    day=31;
                    break;
                case 2:
                    day=31+28;
                    break;
                case 3:
                    day=31+28+31;
                    break;
                case 4:
                    day=31+28+31+30;
                    break;
                case 5:
                    day=31+28+31+30+31;
                    break;
                case 6:
                    day=31+28+31+30+31+30;
                    break;
                case 7:
                    day=31+28+31+30+31+30+31;
                    break;
                case 8:
                    day=31+28+31+30+31+30+31+31;
                    break;
                case 9:
                    day=31+28+31+30+31+30+31+31+30;
                    break;
                case 10:
                    day=31+28+31+30+31+30+31+31+30+31;
                    break;
                case 11:
                    day=31+28+31+30+31+30+31+31+30+31+30;
                    break;
                case 12:
                    day=31+28+31+30+31+30+31+31+30+31+30+31;
                    break;
                default:
                    break;

            }
            return day;
        }
        private static boolean isLeapYear(int i) {
            boolean flag=false;
            if((i%100!=0&&i%4==0)||i%400==0)
                flag=true;
            return flag;
        }
}
