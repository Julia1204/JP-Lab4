import java.awt.*;

public class Circle {
    private final int a=10;
    private final int x;
    private final int y;

    public Circle(int x, int y){
        this.x=x;
        this.y=y;
    }

    protected void drawCircle(Graphics2D g2d){

        g2d.fillOval(x,y,a,a);

    }
}
