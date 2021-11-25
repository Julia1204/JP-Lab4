import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Frame extends JFrame{
    public Frame() {

        this.setTitle("Ramka");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        add(panel);

        JButton runButton = new JButton("Run");
        runButton.setBounds(0,320,80,25);
        runButton.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseEntered(MouseEvent e) {
                Random random = new Random();
                super.mouseEntered(e);
                if(e.getX()>0 && e.getX()<40){
                runButton.setLocation(random.nextInt(320), random.nextInt(350));}

            }
        });
        panel.add(runButton);


        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(320, 320, 80, 25);
        cancelButton.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e) {
            runButton.setLocation(0,320);
        }
        });
        panel.add(cancelButton);

        this.setVisible(true);
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Frame();

                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

}
