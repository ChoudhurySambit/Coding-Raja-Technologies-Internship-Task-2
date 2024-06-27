package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquriy extends JFrame implements ActionListener {

    String pin;
    JLabel l3;
    JButton btn1;
    BalanceEnquriy(String pin){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel l2=new JLabel("Your Current Balance Is Rs. ");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(430,180,700,35);
        l2.setForeground(Color.white);
        l1.add(l2);

        l3=new JLabel();
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setBounds(430,220,400,35);
        l3.setForeground(Color.white);
        l1.add(l3);

        btn1=new JButton("Back");
        btn1.setBounds(700,406,150,35);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        l1.add(btn1);

        int balance=0;
        try {

            Con c=new Con();
            String query="select * from bank where pin='"+pin+"'";
            ResultSet resultSet=c.statement.executeQuery(query);
            while (resultSet.next()){
                if(resultSet.getString("type").equals("Deposite")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }
                else {
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        l3.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquriy("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        new main_Class(pin);
        setVisible(false);


    }
}
