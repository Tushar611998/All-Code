package JavaSwing;

import javax.management.MBeanAttributeInfo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopUpMenuWithacTIONlISTNER {
    public static void main(String[] args) {
        JFrame f = new JFrame("PopUpMenu Example");
        f.setSize(500,500);
        JPopupMenu pop = new JPopupMenu("Edit");
        JMenuItem m1 = new JMenuItem("Cut");
        JMenuItem m2 = new JMenuItem("Copy");
        JMenuItem m3 = new JMenuItem("Paste");
        JLabel l = new JLabel();
        l.setBounds(100,50,250,20);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                pop.show(f,e.getX(),e.getY());
            }
        });
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    l.setText("Cut clicked");

            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    l.setText("copy selected");

            }
        });
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    l.setText("paste selected");

            }
        });


        pop.add(m1);
        pop.add(m2);
        pop.add(m3);
        f.add(l);

        f.add(pop);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
