package question3;

public class Circle implements Perarea{


    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double get_area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double get_perimeter() {
        return 2 * radius * Math.PI;
    }
}
