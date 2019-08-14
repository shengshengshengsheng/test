package geometry;

public class RectangleExtendsGeometricObject extends GeometricObject {
    private double width;
    private double height;
    public RectangleExtendsGeometricObject(){}
    public RectangleExtendsGeometricObject(double width, double height)
    {
        this.width=width;
        this.height=height;
    }
    public RectangleExtendsGeometricObject(double width, double height, String color, boolean filled)
    {
        super(color,filled);
        this.width=width;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return 2*(height+width);
    }
}
