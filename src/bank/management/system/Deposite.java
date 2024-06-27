package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener {

    String pin;
    TextField textField;
    JButton btn1, btn2;

    Deposite(String pin) {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("Enter Amount You Want to Deposit");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(460, 180, 400, 35);
        l2.setForeground(Color.white);
        l1.add(l2);

        textField = new TextField();
        textField.setBounds(460, 230, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        l1.add(textField);

        btn1 = new JButton("DEPOSIT");
        btn1.setBounds(700, 362, 150, 35);
        btn1.setBackground(new Color(65, 125, 128));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        l1.add(btn1);

        btn2 = new JButton("BACK");
        btn2.setBounds(700, 406, 150, 35);
        btn2.setBackground(new Color(65, 125, 128));
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        l1.add(btn2);

        setLayout(null);
        this.pin = pin;
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Deposite("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            String atype = "Deposit";
            if (e.getSource() == btn1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter The Amount You Want To Deposit");
                } else {
                    Con c = new Con();
                    c.statement.executeUpdate("INSERT INTO bank (pin, date, type, amount) VALUES('" + pin + "','" + date + "','" + atype + "','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource() == btn2) {
                setVisible(false);
                new main_Class(pin);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
