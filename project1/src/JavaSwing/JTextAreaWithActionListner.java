package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaWithActionListner {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        JButton b = new JButton("Count words !!");
        b.setBounds(150,350,100,20);
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        l1.setBounds(100,50,200,50);
        l2.setBounds(200,50,200,50);
        JTextArea a = new JTextArea();
        a.setBounds(100,100,300,300);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ans =a.getText();
                String words[] = ans.split("\\s");
                l1.setText("words = "+ words.length);
                l2.setText("characters = "+ ans.length());
            }
        });
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(a);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
