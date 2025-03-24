package question6.block;

public class Creep implements Runnable {
    private String name;
    private Player player;
    public Creep(String name,Player player) {
        this.player = player;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void run() {
        player.attacked(name);
    }

}
