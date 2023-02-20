package JavaSwing;

import javax.swing.*;

public class JPasswordFieldClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("JPasswordField Example");
        f.setSize(500,500);
        JLabel l1 =  new JLabel("Username");
        l1.setBounds(100,50,100,50);
        JTextField j = new JTextField();
        j.setBounds(250,50,100,50);
        JLabel l2 = new JLabel("Password");
        l2.setBounds(100,150,100,50);
        JPasswordField p = new JPasswordField();
        p.setBounds(250,150,100,50);
        f.add(l1);
        f.add(l2);
        f.add(j);
        f.add(p);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
