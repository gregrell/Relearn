package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Greg on 7/30/2016.
 */
public class ProgramFrame extends JFrame {
    JButton exitButton = new JButton("Exit");
    JButton otherButton = new JButton("Other");
    WalkArea wa = new WalkArea(1,1);
    ButtonFrame bf = new ButtonFrame();




    public ProgramFrame(){
        super("The swear arena");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Bound set
        setBounds(0,0,640,480);
        setSize(640,480);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.PAGE_AXIS));
        setResizable(false);
// other component properties size and color set
        otherButton.setBackground(Color.CYAN);
        otherButton.setPreferredSize(new Dimension(200,50));


//The components on the Frame that require action listeners

        otherButton.addActionListener(new Action());

        //Add buttons to button frama
        bf.add(otherButton);
        //bf.add(exitButton);

//Add components
        add(wa);
        add(bf);






        setVisible(true);
    }

    static class Action implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println(e.getActionCommand());

        }

    }






}

