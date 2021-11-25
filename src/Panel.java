import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;


public class Panel extends JPanel  implements MouseInputListener, KeyListener {
    Circle circle = null;
    Rectangle rectangle = null;

    private int mousePositionX;
    private int mousePositionY;


        public Panel() {
            setLayout(null);
            setFocusable(true);
            addMouseListener(this);
            addKeyListener(this);
            setBorder(BorderFactory.createMatteBorder(5, 10, 100, 10, Color.blue));
        }

        @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {

        mousePositionX = e.getX();
        mousePositionY=e.getY();

    }


    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_C && mousePositionX>=10 && mousePositionX<=390 && mousePositionY>=10 && mousePositionY<=300){
            circle = new Circle(mousePositionX,mousePositionY);
            repaint();
        }

        else if(e.getKeyCode()==KeyEvent.VK_R && mousePositionX>=10 && mousePositionX<=390 && mousePositionY>=10 && mousePositionY<=300) {
            rectangle = new Rectangle(mousePositionX,mousePositionY);
            repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {}


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        try {
            if(circle != null) {
                g2d.setColor(Color.RED);
                circle.drawCircle(g2d);}
            if(rectangle != null) {
                g2d.setColor(Color.YELLOW);
                rectangle.drawRectangle(g2d);}

        } finally {
            g2d.dispose();
        }
    }





}