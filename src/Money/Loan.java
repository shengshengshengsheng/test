package Money;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    public Loan()
    {
        annualInterestRate=2.5;
        numberOfYears=10;
        loanAmount=100000;
    }
    public Loan(double annualInterestRate,int numberOfYears,double loanAmount)
    {
        this.annualInterestRate=annualInterestRate;
        this.loanAmount=loanAmount;
        this.numberOfYears=numberOfYears;
        loanDate=new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment() {
        return loanAmount;
    }

    public double getTotalPayment() {
        double totalPayment=getMonthlyPayment()*numberOfYears*12;
        return totalPayment;
    }
}
