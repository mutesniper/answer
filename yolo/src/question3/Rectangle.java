package question3;

public class Rectangle implements Perarea{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double get_area() {
        return width * height;
    }

    @Override
    public double get_perimeter() {
        return (width + height)*2;
    }
}
