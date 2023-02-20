package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListWithActionLIstner {
    public static void main(String[] args) {
        JFrame f = new JFrame("JList Example");
        f.setSize(500,500);
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Java");
        l1.addElement("C++");
        l1.addElement("Html");
        l1.addElement("Javascipt");
        l1.addElement("PHP");

        JList<String> j = new JList<>(l1);
        j.setBounds(100,100,100,100);
        DefaultListModel<String> l2 = new DefaultListModel<>();
        l2.addElement("Spring");
        l2.addElement("NodeJs");
        l2.addElement("Reactjs");
        l2.addElement("hibernet");
        JList<String> j2 = new JList<>(l2);
        j2.setBounds(250,100,100,100);
        JLabel l11 = new JLabel();
        l11.setBounds(50,300,250,20);
        JLabel l12 = new JLabel();
        l12.setBounds(250,300,250,20);
        JButton b = new JButton("Click");
        b.setBounds(175,250,85,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
                String a ="";
                if(j.getSelectedIndex()!=-1){
                    s="the selected language: " + j.getSelectedValue();
                    l11.setText(s);
                }
                if(j2.getSelectedIndex()!=-1){
                    a="selected framework: " + j2.getSelectedValue();
                    l12.setText(a);
                }
            }
        });

        f.add(j2);
        f.add(j);
        f.add(b);
        f.add(l11);
        f.add(l12);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
