package question4;



public class TestPlainRect {
    public static void main(String[] args) {
        PlainRect pr=new PlainRect(10,10,10,20);
        System.out.println(pr.area()+","+pr.perimeter());
        System.out.println(pr.contains(25.5,13));


    }
}
