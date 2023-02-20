package JavaSwing;

import javax.swing.*;

public class JLabelClass {
    public static void main(String[] args) {
        // add frame
        JFrame f = new JFrame();
        f.setSize(500,500);
        // creat new label it is container for read only text
        JLabel l1 = new JLabel();
        // set text to label
        l1.setText("hello i am Tushar");
        l1.setBounds(50,100,200,100);
        JLabel l2 = new JLabel("Hi I am Krushna");
        l2.setBounds(50,50,200,100);
        f.add(l1);
        f.add(l2);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }
}
