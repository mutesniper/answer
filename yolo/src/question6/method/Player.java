package question6.method;

public class Player {
    private int HP;
    public Player(){
        HP = 100;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public synchronized void attacked(String AttackerName){

            for (int i = 0; i < 3; i++) {
                if(this.getHP() == 0){
                    break;
                }
                this.setHP(this.getHP() - 20);
                System.out.println(AttackerName+" attack...");
                System.out.println(AttackerName+": 当前player的hp值="+this.getHP());
                try{
                    Thread.sleep(200);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                if(this.getHP()==0){
                    System.out.println(AttackerName+": player is dead");
                }
            }
            System.out.println(AttackerName+" end.");


    }
}
