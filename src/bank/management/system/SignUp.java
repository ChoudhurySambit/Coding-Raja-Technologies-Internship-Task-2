package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JButton nextBtn;
    JRadioButton r1, r2, r3, r4, r5;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    JTextField field1, field2, email, field4, field5, field6, field7;
    JDateChooser dateChooser;

    SignUp() {
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        setLayout(null);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first4);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1 ");
        label2.setBounds(400, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Info ");
        label3.setBounds(360, 90, 600, 40);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        JLabel label4 = new JLabel("Name :");
        label4.setBounds(100, 190, 100, 30);
        label4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label4);

        field1 = new JTextField();
        field1.setFont(new Font("Raleway", Font.BOLD, 14));
        field1.setBounds(300, 190, 400, 30);
        add(field1);

        JLabel label5 = new JLabel("Father's Name :");
        label5.setBounds(100, 240, 200, 30);
        label5.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label5);

        field2 = new JTextField();
        field2.setFont(new Font("Raleway", Font.BOLD, 14));
        field2.setBounds(300, 240, 400, 30);
        add(field2);

        JLabel label6 = new JLabel("Date of Birth :");
        label6.setBounds(100, 340, 200, 30);
        label6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label6);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel label7 = new JLabel("Gender");
        label7.setBounds(100, 290, 200, 30);
        label7.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label7);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 290, 60, 30);
        r1.setBackground(new Color(222, 255, 228));
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 290, 90, 30);
        r2.setBackground(new Color(222, 255, 228));
        add(r2);
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(r1);
        btnGroup.add(r2);

        JLabel label8 = new JLabel("Email address :");
        label8.setBounds(100, 390, 200, 30);
        label8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label8);

        email = new JTextField();
        email.setFont(new Font("Raleway", Font.BOLD, 14));
        email.setBounds(300, 390, 400, 30);
        add(email);

        JLabel label9 = new JLabel("Marital Status :");
        label9.setBounds(100, 440, 200, 30);
        label9.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label9);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(300, 440, 150, 30);
        r3.setBackground(new Color(222, 255, 228));
        add(r3);
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBounds(450, 440, 150, 30);
        r4.setBackground(new Color(222, 255, 228));
        add(r4);
        r5 = new JRadioButton("Divorced");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBounds(600, 440, 150, 30);
        r5.setBackground(new Color(222, 255, 228));
        add(r5);
        ButtonGroup btnGroup2 = new ButtonGroup();
        btnGroup2.add(r3);
        btnGroup2.add(r4);
        btnGroup2.add(r5);

        JLabel label10 = new JLabel("Address :");
        label10.setBounds(100, 490, 200, 30);
        label10.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label10);

        field4 = new JTextField();
        field4.setFont(new Font("Raleway", Font.BOLD, 14));
        field4.setBounds(300, 490, 400, 30);
        add(field4);

        JLabel label12 = new JLabel("Pin Code :");
        label12.setBounds(100, 590, 200, 30);
        label12.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label12);

        field6 = new JTextField();
        field6.setFont(new Font("Raleway", Font.BOLD, 14));
        field6.setBounds(300, 590, 400, 30);
        add(field6);

        JLabel label13 = new JLabel("City :");
        label13.setBounds(100, 540, 200, 30);
        label13.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label13);

        field5 = new JTextField();
        field5.setFont(new Font("Raleway", Font.BOLD, 14));
        field5.setBounds(300, 540, 400, 30);
        add(field5);

        JLabel label14 = new JLabel("State :");
        label14.setBounds(100, 640, 200, 30);
        label14.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label14);

        field7 = new JTextField();
        field7.setFont(new Font("Raleway", Font.BOLD, 14));
        field7.setBounds(300, 640, 400, 30);
        add(field7);

        nextBtn = new JButton("Next");
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.WHITE);
        nextBtn.setFont(new Font("Raleway", Font.BOLD, 14));
        nextBtn.setBounds(620, 690, 80, 30);
        add(nextBtn);

        nextBtn.addActionListener(this);
        getContentPane().setBackground(new Color(222, 255, 228));
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = field1.getText();
        String fName = field2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String Email = email.getText();
        String mStatus = null;
        if (r3.isSelected()) {
            mStatus = "Married";
        } else if (r4.isSelected()) {
            mStatus = "Unmarried";
        } else if (r5.isSelected()) {
            mStatus = "Divorced";
        }
        String address = field4.getText();
        String pinCode = field6.getText();
        String city = field5.getText();
        String state = field7.getText();

        try {
            if (field1.getText().isEmpty() || field2.getText().isEmpty() || dob.isEmpty() || gender == null || Email.isEmpty() || mStatus == null || address.isEmpty() || pinCode.isEmpty() || city.isEmpty() || state.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill All The Fields");
            } else {
                Con con1 = new Con();
                String q = "insert into signup values('" + formNo + "','" + name + "','" + fName + "','" + dob + "','" + gender + "','" + Email + "','" + mStatus + "','" + address + "','" + city + "','" + pinCode + "','" + state + "')";
                con1.statement.executeUpdate(q);
                new SignUp2(first);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
