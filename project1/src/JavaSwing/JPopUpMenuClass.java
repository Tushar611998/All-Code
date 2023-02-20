package JavaSwing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopUpMenuClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("PopUpMenu Example");
        f.setSize(500,500);
        JPopupMenu pop = new JPopupMenu("Edit");
        JMenuItem m1 = new JMenuItem("Cut");
        JMenuItem m2 = new JMenuItem("Copy");
        JMenuItem m3 = new JMenuItem("Paste");

        pop.add(m1);
        pop.add(m2);
        pop.add(m3);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                pop.show(f,e.getX(),e.getY());
            }
        });
        f.add(pop);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
