package JavaSwing;

import javax.swing.*;

public class JProgressBarClass extends JFrame {
    int i =0;int num =0;
    JProgressBar jb;
    public void iterate(){
        while(i<=2000){
            jb.setValue(i);
            i=i+20;
            try{Thread.sleep(150);}catch(Exception e){}
        }
    }
    public JProgressBarClass(){
        JFrame j = new JFrame();
        j.setSize(500,500);
        jb = new JProgressBar(0,2000);
        jb.setBounds(100,100,200,50);
        jb.setValue(0);
        jb.setStringPainted(true);
        j.add(jb);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JProgressBarClass m = new JProgressBarClass();
        m.setVisible(true);
        m.iterate();
    }
}
