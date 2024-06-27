package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {

    JButton btn1,btn2;

    JPasswordField p1,p2;

    String pin;

    ChangePin(String pin){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        this.pin=pin;

        JLabel l2 = new JLabel("Change Your Pin");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(430, 180, 400, 35);
        l2.setForeground(Color.white);
        l1.add(l2);

        JLabel l3 = new JLabel("New Pin :");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setBounds(430, 220, 150, 35);
        l3.setForeground(Color.white);
        l1.add(l3);

        p1=new JPasswordField();
        p1.setBounds(600, 220, 150, 25);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        p1.setBackground(new Color(65, 125, 128));
        p1.setForeground(Color.WHITE);
        l1.add(p1);

        JLabel l4 = new JLabel("Re-Enter New Pin :");
        l4.setFont(new Font("System", Font.BOLD, 16));
        l4.setBounds(430, 255, 400, 35);
        l4.setForeground(Color.white);
        l1.add(l4);

        p2=new JPasswordField();
        p2.setBounds(600, 255, 150, 25);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        p2.setBackground(new Color(65, 125, 128));
        p2.setForeground(Color.WHITE);
        l1.add(p2);

        btn1 = new JButton("Change");
        btn1.setBounds(700, 362, 150, 35);
        btn1.setBackground(new Color(65, 125, 128));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        l1.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(700, 406, 150, 35);
        btn2.setBackground(new Color(65, 125, 128));
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        l1.add(btn2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {

        new ChangePin("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            String pin1=p1.getText();
            String pin2=p2.getText();

            if(!pin1.equals(pin2)){

                JOptionPane.showMessageDialog(null,"Entered Pin Does Not Match");
                return;
            }

            if(e.getSource()==btn1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New Pin");

                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New Pin");
                }

                Con c=new Con();
                String q1="Update bank set pin='"+pin1+"' where pin ='"+pin+"'";
                String q2="Update login set pin='"+pin1+"' where pin ='"+pin+"'";
                String q3="Update signupthree set pin='"+pin1+"' where pin ='"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"Pin Change Successfully");
                setVisible(false);
                new main_Class(pin);
            }

            else if(e.getSource()==btn2){
                new main_Class(pin);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
}
