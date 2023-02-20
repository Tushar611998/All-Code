package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JCheckBoxInMenuBar {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
//        m.setMnemonic(KeyEvent.VK_C);
        JMenuItem m1 = new JMenuItem("Open");
        JCheckBoxMenuItem cmb = new JCheckBoxMenuItem("FileStatus");
//        cmb.setMnemonic(KeyEvent.VK_C);
        m.add(m1);
        m.add(cmb);
        mb.add(m);
//        ActionListener a = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AbstractButton aButton = (AbstractButton) e.getSource();
//                boolean selected =  aButton.getModel().isSelected();
//                String newlabel;
//                Icon newIcon;
//                if(selected){
//                    newlabel = "Hide";
//                }else{
//                    newlabel = "UnHide";
//                }
//                aButton.setText(newlabel);
//            }
//        };
        cmb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String a ="";
                if(cmb.isSelected()){
                    cmb.setText("hide");
                }else{
                    cmb.setText("Unhide");
                }
            }
        });
        f.setJMenuBar(mb);
        f.setVisible(true);


    }
}
