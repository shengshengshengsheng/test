import geometry.CircleExtendsGeometricObject;
import geometry.RectangleExtendsGeometricObject;

public class test {
    public static void main(String[] args) {
        CircleExtendsGeometricObject circleExtendsGeometricObject=new CircleExtendsGeometricObject(1);
        System.out.println("A circle "+circleExtendsGeometricObject.toString());
        System.out.println("the color is "+circleExtendsGeometricObject.getColor());
        System.out.println("the radius is "+circleExtendsGeometricObject.getRadius());
        System.out.println("the area is "+circleExtendsGeometricObject.getArea());
        System.out.println("the diameter is "+circleExtendsGeometricObject.getPerimeter());


        RectangleExtendsGeometricObject rectangleExtendsGeometricObject=new RectangleExtendsGeometricObject(2,4);
        System.out.println("\nA rectangle "+rectangleExtendsGeometricObject.toString());
        System.out.println("the color is "+rectangleExtendsGeometricObject.getColor());
        System.out.println("the height is "+rectangleExtendsGeometricObject.getHeight());
        System.out.println("the area is "+rectangleExtendsGeometricObject.getArea());
        System.out.println("the diameter is "+rectangleExtendsGeometricObject.getPerimeter());
    }
}
