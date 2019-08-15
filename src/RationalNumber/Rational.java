package RationalNumber;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;
    public Rational()
    {
        numerator=0;
        denominator=1;

    }
    private static long gcd(long n,long d)
    {
        long n1=Math.abs(n);
        long n2=Math.abs(d);
        int gcd=1;
        for(int k=1;k<=n1&&k<=n2;k++)
        {
            if(n1%k==0&&n2%k==0)
                gcd=k;
        }
        return gcd;
    }

    public Rational(long numerator, long denominator) {
        long gcd=gcd(numerator,denominator);
        this.numerator=((denominator>0)?1:-1)*numerator/gcd;
        this.denominator=Math.abs(denominator)/gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }
    public Rational add(Rational secondRational)
    {
        long n1=numerator*secondRational.getDenominator()+denominator*secondRational.getNumerator();
        long n2=secondRational.getDenominator()*denominator;
        return new Rational(n1,n2);
    }
    public Rational subtract(Rational secondRational)
    {
        long n1=numerator*secondRational.getDenominator()-denominator*secondRational.getNumerator();
        long n2=secondRational.getDenominator()*denominator;
        return new Rational(n1,n2);
    }
    public Rational multiply(Rational secondRational)
    {
        long n1=numerator*secondRational.getNumerator();
        long n2=denominator*secondRational.getDenominator();
        long gcd=gcd(n1,n2);
        n1/=gcd;
        n2/=gcd;
        return new Rational(n1,n2);
    }
    public Rational divide(Rational secondRational)
    {
        long n1=numerator*secondRational.getDenominator();
        long n2=denominator*secondRational.getNumerator();
        long gcd=gcd(n1,n2);
        n1/=gcd;
        n2/=gcd;
        return new Rational(n1,n2);
    }
    @Override
    public String toString()
    {
        if(denominator==1)
            return numerator+"";
        else
            return numerator+"/"+denominator;
    }

    @Override
    public int compareTo(Rational rational) {
        long n1=rational.getDenominator()*numerator;
        long n2=rational.getNumerator()*denominator;
        if(n1>n2)
            return 1;
        else if(n1<n2)
            return -1;
        return 0;
    }

    @Override
    public int intValue() {
        return (int)numerator/(int)denominator;
    }

    @Override
    public long longValue() {
        return numerator/denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator/denominator;
    }

    @Override
    public double doubleValue() {
        return (double)numerator/denominator;
    }
}
