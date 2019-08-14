package geometry;

public class CircleExtendsGeometricObject extends GeometricObject {
    private double radius;
    public CircleExtendsGeometricObject()
    {
    }
    public CircleExtendsGeometricObject(double radius)
    {
        this.radius=radius;
    }
    public CircleExtendsGeometricObject(double radius, String color, boolean filled)
    {
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()
    {
        return Math.PI*radius*2;
    }
    public void printCircle()
    {
        System.out.println("the radius of the area is:"+radius);
    }
}
