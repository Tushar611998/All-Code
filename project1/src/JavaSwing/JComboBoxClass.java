package JavaSwing;

import javax.swing.*;

public class JComboBoxClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("JComboBoxExample");
        f.setSize(500,500);
        String[] arr = {"Java","C++","C"};
        JComboBox combo = new JComboBox(arr);
        combo.setBounds(100,100,100,20);
        combo.addItem("PHP");
        combo.addItem("HTML");
        combo.addItem("CSS");
        combo.removeItem("CSS");

        f.add(combo);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
