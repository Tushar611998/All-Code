package JavaSwing;

import jdk.swing.interop.LightweightFrameWrapper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxWithActionListner {
    public static void main(String[] args) {
        JFrame f = new JFrame("Food ordering System");
        f.setSize(500,500);
        JLabel l = new JLabel("Select food Items and Enjoy your meal....!!!");
        l.setBounds(50,50,500,50);
        JCheckBox cb1 = new JCheckBox("Pizza @ 250 $");
        JCheckBox cb2 = new JCheckBox("Burger @ 60 $");
        JCheckBox cb3 = new JCheckBox("Pasta @ 150 $");
        JCheckBox cb4 = new JCheckBox("Tea @ 20 $");
        cb1.setBounds(100,100,250,50);
        cb2.setBounds(100,150,250,50);
        cb3.setBounds(100,200,250,50);
        cb4.setBounds(100,250,250,50);
        JButton b = new JButton("place Order");
        b.setBounds(150,300,75,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float amount =0;
                String msg="";
                if(cb1.isSelected()){
                    amount+=250;
                    msg+="Pizza: 250\n";
                }if(cb2.isSelected()){
                    amount+=60;
                    msg+="Burger: 60\n";
                }if(cb3.isSelected()){
                    amount+=150;
                    msg+="Pasta: 150\n";
                }if(cb4.isSelected()){
                    amount+=20;
                    msg+="Tea: 20\n";
                }
                JOptionPane.showMessageDialog(f,msg +"Total" + amount);
            }
        });
        f.add(l);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
