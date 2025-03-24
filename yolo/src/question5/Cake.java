package question5;



public class Cake {
    private static int count = 0;
    private int id;
    public Cake() {
        this.id = count++;
    }
    public int getId() {
        return id;
    }
}
