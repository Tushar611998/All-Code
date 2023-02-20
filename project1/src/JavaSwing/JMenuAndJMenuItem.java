package JavaSwing;

import javax.swing.*;

public class JMenuAndJMenuItem {
    public static void main(String[] args) {
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
        mb.add(m);

        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
