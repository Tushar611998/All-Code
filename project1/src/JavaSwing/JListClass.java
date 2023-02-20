package JavaSwing;

import javax.swing.*;

public class JListClass {
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
        j.setBounds(100,100,200,100);
        f.add(j);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
