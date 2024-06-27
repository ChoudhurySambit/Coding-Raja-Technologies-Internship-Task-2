package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {


    String pin;
    JButton btn;
    MiniStatement(String pin){



        JLabel l1=new JLabel();
        l1.setBounds(20,140,400,400);
        add(l1);

        JLabel l2=new JLabel("Sambit Choudhury");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setBounds(150,20,200,20);
        add(l2);

        JLabel l3=new JLabel();
        l3.setBounds(20,80,300,20);
        add(l3);

        JLabel l4=new JLabel();
        l4.setBounds(20,400,300,20);
        add(l4);

        try{

            Con c1=new Con();

            ResultSet resultSet1=c1.statement.executeQuery("Select * from Login where pin ='"+pin+"'");
            while (resultSet1.next()){

                l3.setText(" Card No "+resultSet1.getString("card_number").substring(0,4)+"XXXXXXXX"+resultSet1.getString("card_number").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {

            Con c2=new Con();

            ResultSet resultSet2 = c2.statement.executeQuery("SELECT * FROM bank WHERE pin='"+ pin +"'");
            int balance = 0;

            while (resultSet2.next()) {
                l1.setText(l1.getText()+"<html>"+resultSet2.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet2.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet2.getString("amount")+"<br><br><br></html>");

                if (resultSet2.getString("type").equals("Deposite")) {
                    balance += Integer.parseInt(resultSet2.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet2.getString("amount"));
                }
            }

            l4.setText("Your Total Balance In Rs. "+balance);


        }catch (Exception e){
            e.printStackTrace();
        }

        btn=new JButton("Exit");
        btn.setBounds(20,500,100,25);
        btn.addActionListener(this);
        btn.setForeground(Color.white);
        btn.setBackground(Color.BLACK);
        add(btn);


        setLayout(null);
        setSize(400,600);
        getContentPane().setBackground(new Color(255,204,204));
        setLocation(20,20);
        setVisible(true);





    }

    public static void main(String[] args) {
        new MiniStatement("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new main_Class(pin);
        setVisible(false);


    }
}
