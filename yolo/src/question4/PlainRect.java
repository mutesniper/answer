package question4;

public class PlainRect extends Rect{
    private int startX;
    private int startY;
    public PlainRect(int x, int y, int width, int height) {
        this.startX = x;
        this.startY = y;
        this.width=width;
        this.height=height;
    }
    public PlainRect(int x, int y, int width, int height, int startX, int startY) {
        this.startX = 0;
        this.startY = 0;
        this.width = 0;
        this.height = 0;
    }

    public boolean contains(double x, double y) {
        if((x>startX&&x<startX+width)&&(y<startY&&y>startY-height)){
            return true;
        }
        return false;
    }

}
