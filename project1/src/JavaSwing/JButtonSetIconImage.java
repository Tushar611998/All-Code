package JavaSwing;

import javax.swing.*;

public class JButtonSetIconImage {
    public static void main(String[] args) {
        // create a new frame
        JFrame f = new JFrame();
        // set size of frame
        f.setSize(500,500);
        // create button with image link
        JButton j = new JButton(new ImageIcon("C:\\Users\\Tushar's\\Downloads\\unnamed.jpg"));
        // set coordinates of button and dimensions of butoon
        j.setBounds(150,200,100,50);
        f.add(j);
        f.setLayout(null);
        f.setVisible(true);
        // terminate program by clicking close button on frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
}
