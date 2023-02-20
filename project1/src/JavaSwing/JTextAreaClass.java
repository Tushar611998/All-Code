package JavaSwing;

import javax.swing.*;

public class JTextAreaClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTextArea");
        f.setSize(500,500);
        JTextArea j = new JTextArea("Helloo....!!!");
        j.setBounds(100,50,100,50);
        f.add(j);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
