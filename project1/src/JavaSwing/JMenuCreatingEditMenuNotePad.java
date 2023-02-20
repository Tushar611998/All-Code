package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuCreatingEditMenuNotePad {
    public static void main(String[] args){
        JFrame f = new JFrame("JMenu and JmenuBar Example");
        f.setSize(500,500);
        JMenu m = new JMenu("menu");

//        m.setSize(400,100);
        JMenuBar mb = new JMenuBar();
        JMenuItem m2 = new JMenuItem("New");
        JMenuItem m3 = new JMenuItem("Open");
        JMenuItem m4 = new JMenuItem("Save");
        JMenuItem m5 = new JMenuItem("Save As");
        JMenuItem m6 = new JMenuItem("Exit");
        JMenuItem m7 = new JMenuItem("item1");
        JMenuItem m8 = new JMenuItem("item2");
        JMenu sm = new JMenu("Submenu");
        sm.add(m7);sm.add(m8);
        m.add(m2);m.add(m3);m.add(m4);m.add(m5);m.add(m6);m.add(sm);

        JMenu e = new JMenu("Edit");
        JMenuItem e1 = new JMenuItem("Cut");
        JMenuItem e2 = new JMenuItem("Copy");
        JMenuItem e3 = new JMenuItem("Paste");
        JMenuItem e4 = new JMenuItem("Select All");
        e.add(e1);e.add(e2);e.add(e3);e.add(e4);

        JTextArea a = new JTextArea();
        a.setBounds(100,250,250,20);
        mb.add(m);mb.add(e);

        e1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==e1){
                    a.cut();
                }
            }
        });
        e2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==e2){
                    a.copy();
                }
            }
        });
        e3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==e3){
                    a.paste();
                }
            }
        });
        e4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==e4){
                    a.selectAll();
                }
            }
        });


        f.setJMenuBar(mb);
        f.add(a);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
