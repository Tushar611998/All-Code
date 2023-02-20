package JavaSwing;

import javax.swing.*;

public class JButtonClass {
    public static void main(String[] args) {

        JFrame p = new JFrame();// creating frame
        JButton j = new JButton();//creating button
        j.setText("hello click me");// set text on button
        p.setSize(1000,500);// set sixe of frame
        j.setBounds(200,250,150,75);  // sets x , y distance from left corner of frame and size of button
        p.add(j);// add the button to frame
        j.setMnemonic(123445);// sets alphanumeric character to button
        System.out.println(j.getMnemonic());// get Mnemonic
        j.setEnabled(true);// make button clickable or non clickable
        p.setLayout(null); // set frame layout
        p.setVisible(true);//makes frame visible or invisible on screen
        System.out.println(j.getText());// getting text over button
    }

}
