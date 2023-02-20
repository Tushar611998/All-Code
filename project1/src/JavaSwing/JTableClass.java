package JavaSwing;

import javax.swing.*;

public class JTableClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTableExample");
        f.setSize(500,500);
        String[][] data = {{"101","Tushar D.","Pune"},{"102","Sushma D.","Aurangabad"},{"103","Mohan D.","Aurangabad"}};
        String col [] = {"Roll No","Name","Address"};
        JTable t = new JTable(data,col);
//        t.setBounds(100,100,300,300);
        JScrollPane s = new JScrollPane(t);
//        f.add(t);
        f.add(s);
//        String data[][]={ {"101","Amit","670000"},
//                {"102","Jai","780000"},
//                {"101","Sachin","700000"}};
//        String column[]={"ID","NAME","SALARY"};
//        JTable jt=new JTable(data,column);
//        jt.setBounds(30,40,200,300);
//        JScrollPane sp=new JScrollPane(jt);
//        f.add(sp);
//        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
