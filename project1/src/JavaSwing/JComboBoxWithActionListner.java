package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxWithActionListner {
    public static void main(String[] args) {
        JFrame f = new JFrame("JComboBoxExample");
        f.setSize(500,500);
        String[] arr = {"Java","C++","C"};
        JComboBox combo = new JComboBox(arr);
        combo.setBounds(100,100,100,20);
        JLabel l = new JLabel();
        l.setBounds(100,150,350,20);
        combo.addItem("PHP");
        combo.addItem("HTML");
        combo.addItem("CSS");
        combo.removeItem("CSS");
        JButton b = new JButton("Submit");
        b.setBounds(200,100,80,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "the selected language is: " + combo.getItemAt(combo.getSelectedIndex());
                l.setText(s);

            }
        });

        f.add(combo);
        f.add(b);
        f.add(l);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
