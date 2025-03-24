package question4;

public class Rect {
    double width;
    double height;
    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rect() {
        this.width = 10;
        this.height = 10;
    }

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (width+height);
    }


}
