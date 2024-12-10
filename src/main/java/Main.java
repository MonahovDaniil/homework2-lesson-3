public class Main {
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("Площадь прямоугольника: " + rectangle.area());
            System.out.println("Периметр прямоугольника: " + rectangle.perimeter());

            Circle circle = new Circle(8);
            System.out.println("Площадь круга: " + circle.area());
            System.out.println("Периметр круга: " + circle.perimeter());

            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Площадь треугольника: " + triangle.area());
            System.out.println("Периметр треугольника: " + triangle.perimeter());
        }

        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
