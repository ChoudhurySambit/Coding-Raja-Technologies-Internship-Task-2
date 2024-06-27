package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;
    TextField textField;
    JButton btn1, btn2;

    Withdrawl(String pin) {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("Maximum Withdrawal Is Rs. 10,000");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(460, 180, 700, 35);
        l2.setForeground(Color.white);
        l1.add(l2);

        JLabel l3 = new JLabel("Please Enter Your Amount");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setBounds(460, 220, 400, 35);
        l3.setForeground(Color.white);
        l1.add(l3);

        textField = new TextField();
        textField.setBounds(460, 260, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        l1.add(textField);

        btn1 = new JButton("Cash Withdraw");
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

        this.pin = pin;
        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            try {
                String amount = textField.getText();
                Date date = new Date();

                if (amount.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Amount You Want To Withdraw");
                } else {
                    Con c1 = new Con();
                    String query = "SELECT * FROM bank WHERE pin='" + pin + "'";
                    ResultSet resultSet = c1.statement.executeQuery(query);
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    } else {
                        c1.statement.executeUpdate("INSERT INTO bank (pin, date, type, amount) VALUES('" + pin + "','" + date + "','Withdrawal','" + amount + "')");
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                        setVisible(false);
                        new main_Class(pin);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == btn2) {
            setVisible(false);
            new main_Class(pin);
        }
    }
}
