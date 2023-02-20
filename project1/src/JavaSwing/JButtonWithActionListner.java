package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonWithActionListner {
    public static void main(String[] args) {
        // create a new frame
        JFrame f = new JFrame();
        // set size of frame
        f.setSize(500,500);
        // create a text field to show or write content
        TextField tf = new TextField();
        // set coordinates of text field and dimensions of text field
        tf.setBounds(100,150,250,52);
        // create button
        JButton j = new JButton("click here");
        // set coordinates of button and dimensions of butoon
        j.setBounds(150,200,100,50);
        // add action listener to button which perform action when we click button
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //  define the action which we want after cicking button
                tf.setText("Hi I am Tushar Deshpande Happy java Learning");
            }
        });
        // add text field ans button to frame
        f.add(tf);
        f.add(j);
        // set layout of frame this is most imp
        f.setLayout(null);
        // make frame visible
        f.setVisible(true);
    }
}
