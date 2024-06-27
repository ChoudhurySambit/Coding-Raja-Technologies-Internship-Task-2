package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    String pin;

    FastCash(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("Select Withdrawal Amount");
        l2.setBounds(490, 180, 700, 35);
        l2.setForeground(Color.white);
        l2.setBackground(new Color(65, 125, 128));
        l2.setFont(new Font("System", Font.BOLD, 22));
        l1.add(l2);

        btn1 = new JButton("Rs. 100");
        btn1.setForeground(Color.white);
        btn1.setBackground(new Color(65, 125, 128));
        btn1.addActionListener(this);
        btn1.setBounds(403, 271, 150, 35);
        l1.add(btn1);

        btn2 = new JButton("Rs. 500");
        btn2.setForeground(Color.white);
        btn2.setBackground(new Color(65, 125, 128));
        btn2.addActionListener(this);
        btn2.setBounds(706, 271, 150, 35);
        l1.add(btn2);

        btn3 = new JButton("Rs. 1000");
        btn3.setForeground(Color.white);
        btn3.setBackground(new Color(65, 125, 128));
        btn3.addActionListener(this);
        btn3.setBounds(403, 316, 150, 35);
        l1.add(btn3);

        btn4 = new JButton("Rs. 2000");
        btn4.setForeground(Color.white);
        btn4.setBackground(new Color(65, 125, 128));
        btn4.addActionListener(this);
        btn4.setBounds(706, 316, 150, 35);
        l1.add(btn4);

        btn5 = new JButton("Rs. 5000");
        btn5.setForeground(Color.white);
        btn5.setBackground(new Color(65, 125, 128));
        btn5.addActionListener(this);
        btn5.setBounds(403, 362, 150, 35);
        l1.add(btn5);

        btn6 = new JButton("Rs. 10000");
        btn6.setForeground(Color.white);
        btn6.setBackground(new Color(65, 125, 128));
        btn6.addActionListener(this);
        btn6.setBounds(706, 362, 150, 35);
        l1.add(btn6);

        btn7 = new JButton("Back");
        btn7.setForeground(Color.white);
        btn7.setBackground(new Color(65, 125, 128));
        btn7.addActionListener(this);
        btn7.setBounds(706, 406, 150, 35);
        l1.add(btn7);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn7) {
            setVisible(false);
            new main_Class(pin);
        } else {
            String amount = ((JButton) e.getSource()).getText().substring(4).trim();
            Con c = new Con();
            Date date = new Date();

            try {
                String query = "SELECT * FROM bank WHERE pin='" + pin + "'";
                ResultSet resultSet = c.statement.executeQuery(query);
                int balance = 0;

                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                    return;
                }

                c.statement.executeUpdate("INSERT INTO bank (pin, date, type, amount) VALUES('" + pin + "','" + date + "','Withdrawal','" + amount + "')");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            setVisible(false);
            new main_Class(pin);
        }
    }
}
