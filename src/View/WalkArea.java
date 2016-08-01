package View;
import javax.swing.*;
import java.awt.*;



/**
 * Created by Greg on 7/30/2016.
 */
public class WalkArea extends JPanel {
    private int Xbound;
    private int Ybound;


    public WalkArea(int inXbound, int inYbound){
        Xbound=inXbound;
        Ybound=inYbound;
        this.setBackground(Color.BLACK);
        this.setSize(600,100);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawRect(50,50,15,25);

    }

    public void redraw(){
        this.repaint();
    }





}
