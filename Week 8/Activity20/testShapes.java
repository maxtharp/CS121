package abstractClasses;

public class testShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(2.0);
        System.out.println("Circle area: " + circle.getArea());

        Shape rectangle = new Rectangle(3.0, 5.0);
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}