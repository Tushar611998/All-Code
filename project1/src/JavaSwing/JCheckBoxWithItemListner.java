package JavaSwing;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxWithItemListner {
    public static void main(String[] args) {
        JFrame f = new JFrame("Checkbox");
        f.setSize(500,500);
        JCheckBox j = new JCheckBox("java",true);
        JCheckBox k = new JCheckBox("C++");
        j.setBounds(100,100,50,50);
        JLabel l1 = new JLabel();
        l1.setBounds(50,50,200,50);
        JLabel l2 = new JLabel();
        l2.setBounds(250,50,200,50);
        j.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l1.setText("Java Checkbox: " + (e.getStateChange()==1? "checked":"Unchecked"));
            }
        });
        k.setBounds(100,150,50,50);
        k.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l2.setText("C++ Checkbox: " + (e.getStateChange()==1? "checked":"Unchecked"));

            }
        });
        f.add(j);
        f.add(k);
        f.add(l1);
        f.add(l2);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
