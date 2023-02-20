package JavaSwing;

import javax.swing.*;

public class JCheckBoxClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("Checkbox");
        f.setSize(500,500);
        JCheckBox j = new JCheckBox("java",true);
        JCheckBox k = new JCheckBox("C++");
        j.setBounds(100,100,50,50);
        k.setBounds(100,150,50,50);
        f.add(j);
        f.add(k);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
