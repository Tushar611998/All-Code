package JavaSwing;


import javax.swing.*;
import java.awt.*;

public class SimpleFrameAndButton {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton ("Click here");

        f.setSize(500,500);
//        b.setSize(50,50);
        b.setBounds(150,200,100,50);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }

}
