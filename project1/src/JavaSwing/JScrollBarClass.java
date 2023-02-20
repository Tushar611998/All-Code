package JavaSwing;

import javax.swing.*;

public class JScrollBarClass {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        JScrollBar s = new JScrollBar(1);
        s.setBounds(465,0,20,465);
        f.add(s);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
