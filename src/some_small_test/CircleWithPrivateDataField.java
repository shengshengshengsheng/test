package some_small_test;

public class CircleWithPrivateDataField {
    private double radious;
    private double PI=3.14159265358;
    CircleWithPrivateDataField()
    {
        this.radious=Math.random()*100;
    }
    CircleWithPrivateDataField(double radious)
    {
        this.radious=radious;
    }
    public void setRadious(double radious)
    {
        this.radious=radious;
    }
    public double getRadious()
    {
        return radious;
    }
    public double getArea()
    {
        return PI*radious*radious;
    }
}
