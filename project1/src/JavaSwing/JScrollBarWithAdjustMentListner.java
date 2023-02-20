package JavaSwing;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBarWithAdjustMentListner {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        JLabel l = new JLabel();
        l.setBounds(100,100,200,20);
        l.setHorizontalAlignment(JLabel.CENTER);
        JScrollBar s = new JScrollBar();
        s.setBounds(465,0,20,465);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("Vertical ScrolBar value is " + s.getValue());
            }
        });
        f.add(s);
        f.add(l);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
