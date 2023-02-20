package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTabbedPaneClass {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setSize(500,500);
        JTextArea a = new JTextArea(200,200);
//        a.setSize(200,200);
        JPanel p1 = new JPanel();
        p1.add(a);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50,50,250,250);
        tp.add("main",p1);
        tp.add("visit",p2);
        tp.add("help",p3);
        JSlider s = new JSlider(JSlider.HORIZONTAL,0,50,50);
        s.setBounds(100,250,200,50);
        s.setVisible(false);
//        JPanel p = new JPanel();
//        p.add(s);
        JButton b = new JButton("click");
        b.setBounds(100,300,100,50);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.setVisible(true);
            }
        });
//        j.add(p);
        j.add(b);
        j.add(s);
        j.add(tp);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
