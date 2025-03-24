package question3;

public class Test {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        Rectangle r=new Rectangle(5,10);

        System.out.println("长方形面积、周长为："+r.get_area()+"、"+r.get_perimeter());
        System.out.println("圆形面积、周长为："+c.get_area()+"、"+c.get_perimeter());


    }
}
