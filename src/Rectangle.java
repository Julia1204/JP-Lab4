import java.awt.*;

public class Rectangle {

    private final int a=20;
    private final int b=10;
    private final int x;
    private final int y;


    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void drawRectangle(Graphics2D g2d){
        g2d.fillRect(x,y,a,b);
    }
}
