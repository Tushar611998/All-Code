package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class JLabelWithActionListner {
    public static void main(String[] args) {
        // add frame
        JFrame f = new JFrame();
        f.setSize(500,500);
        TextField tf = new TextField();
        tf.setBounds(50,50,100,50);
        // creat new label it is container for read only text
        JLabel l1 = new JLabel();
        l1.setBounds(50,100,700,50);
        JLabel l2 = new JLabel("this is image",new ImageIcon("C:\\Users\\Tushar's\\Downloads\\unnamed.jpg"),JLabel.HORIZONTAL);
        l2.setBounds(0,10,500,500);
//        l2.setHorizontalAlignment(+50);

        JButton b = new JButton("click here");
        b.setBounds(50,170,100,50);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String host = tf.getText();
                try {
                    String ip = java.net.InetAddress.getByName(host).getHostAddress();
                    l1.setText("the Ip of "+host+" is: "+ip);
                } catch (UnknownHostException ex) {
                    System.out.println("ex");
                }
            }
        });
        f.add(tf);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
