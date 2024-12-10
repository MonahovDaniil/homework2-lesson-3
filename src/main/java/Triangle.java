public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        if (side1 <= 0 || side2 <= 0 || side3 <=0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new RuntimeException("There is no figure with such parameters");
        }
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double area() {
        double s = perimeter() /2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
