package question6.block;

public class Test {

    public static void main(String[] args) {
        Player player=new Player();
        Thread t=new Thread(new Creep("Creep-A", player));
        Thread t1=new Thread(new Creep("Creep-B", player));
        t.start();
        t1.start();
    }

}
