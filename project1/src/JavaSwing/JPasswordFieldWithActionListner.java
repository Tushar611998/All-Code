package JavaSwing;

import com.sun.jdi.Value;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldWithActionListner {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login page");
        f.setSize(500,500);
        JLabel l1 = new JLabel("UserName = ");
        l1.setBounds(100,50,100,20);
        JTextField t = new JTextField();
        t.setBounds(200,50,100,20);
        JLabel l2 = new JLabel("Password = ");
        l2.setBounds(100,100,100,20);
        JPasswordField p = new JPasswordField();
        p.setBounds(200,100,100,20);
        JLabel l3 = new JLabel();
        l3.setBounds(100,200,500,20);
        JLabel l4 = new JLabel();
        l4.setBounds(100,250,500,20);
        JButton b = new JButton("Submit..!!");
        b.setBounds(150,150,200,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = t.getText();
                String pass= new String(p.getPassword());
                l3.setText("UserName = " + a);
                l4.setText("Password = " + pass);
            }
        });
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(b);
        f.add(t);
        f.add(p);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
