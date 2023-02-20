package JavaSwing;

import javax.swing.*;

public class JTextFieldClass {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setSize(500,500);
        j.setResizable(false);
        JTextField tf = new JTextField();
        tf.setBounds(50,50,100,25);
        JTextField tf1 = new JTextField("hello type here");
        tf1.setBounds(50,100,100,25);
        JTextField tf2 = new JTextField("hello type here",1);
        tf2.setBounds(50,150,100,25);
        j.add(tf);
        j.add(tf1);
        j.add(tf2);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
