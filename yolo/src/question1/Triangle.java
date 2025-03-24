package question1;


public class Triangle {
    private double a;
    private double b;
    private double c;

    public double area() throws NotTriangle {
        if(a<0 || b<0 || c<0||a+b<=c||b+c<=a||c+a<=b){
            throw new NotTriangle("不是三角形");
        }
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3.0,4.0,5.0);
        try{
            System.out.println(triangle1.area());
        }catch(NotTriangle notTriangle){
            System.out.println(notTriangle.getMessage());
        }

        Triangle triangle2 = new Triangle(1.0,2.0,1.0);
        try{
            System.out.println(triangle2.area());
        }catch(NotTriangle notTriangle){
            System.out.println(notTriangle.getMessage());
        }




    }



}
