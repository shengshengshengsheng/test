package Money;
import java.util.Scanner;
public class test_loan {
        /**
         * 计算loanMoney
         * */
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter annualInterestRate,for example 8.25:");
            double annualInterestRate=input.nextDouble();
            System.out.println("Enter the total number of years as an integer:");
            int numberOfYears=input.nextInt();
            System.out.println("Enter loan amount,for example 1200000:");
            double loanAmount=input.nextDouble();
            Loan loan=new Loan(annualInterestRate,numberOfYears,loanAmount);
            System.out.printf("the loan was created on %s\n"+
                            "the monthly payment is %.2f\n"+
                            "the total payment is %.2f\n",
                    loan.getLoanDate().toString(),
                    loan.getMonthlyPayment(),
                    loan.getTotalPayment());
        }
}
