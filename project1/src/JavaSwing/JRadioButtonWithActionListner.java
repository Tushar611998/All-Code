package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonWithActionListner {
    public static void main(String[] args) {
        JFrame f = new JFrame("RadioButton");
        f.setSize(500,500);
        JRadioButton b1 = new JRadioButton("Java");
        JRadioButton b2 = new JRadioButton("C++");
        JRadioButton b3 = new JRadioButton("c");
        b1.setBounds(100,50,200,20);
        b2.setBounds(100,100,200,20);
        b3.setBounds(100,150,200,20);
        JButton b = new JButton("Submit..!");
        b.setBounds(150,200,100,50);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b1.isSelected()){
                    JOptionPane.showMessageDialog(f,"Selected Java");
                }
                if(b2.isSelected()){
                    JOptionPane.showMessageDialog(f,"Selected C++");
                }
                if(b3.isSelected()){
                    JOptionPane.showMessageDialog(f,"Selected C");
                }
            }
        });
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


}
