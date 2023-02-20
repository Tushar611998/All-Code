package JavaSwing;

import jdk.jfr.Timespan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldWithActionListner {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setSize(500,500);
        j.setResizable(false);
        JTextField tf = new JTextField();
        tf.setBounds(50,50,100,25);
        JTextField tf1 = new JTextField();
        tf1.setBounds(50,100,100,25);
        JTextField tf2 = new JTextField();
        tf2.setBounds(50,150,100,25);
        tf2.setEditable(false);
        JButton b = new JButton("+");
        b.setBounds(50,200,50,25);
        Font f = new Font("Times",Font.BOLD,30);
        tf1.setFont(f);
        JButton b1 = new JButton("-");
        b1.setBounds(100,200,50,25);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tf.getText());
                int b = Integer.parseInt(tf1.getText());
                tf2.setText((Integer.toString(a+b)));
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tf.getText());
                int b = Integer.parseInt(tf1.getText());
                tf2.setText((Integer.toString(a-b)));

            }
        });

        j.add(tf);
        j.add(tf1);
        j.add(tf2);
        j.add(b);
        j.add(b1);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
