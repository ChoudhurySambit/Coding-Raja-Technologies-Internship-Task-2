package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    String formNo;
    JComboBox<String> comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JRadioButton r1, r2, r3, r4;
    JButton btn;
    JTextField field1, field2;

    SignUp2(String first) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        setLayout(null);
        add(image);

        formNo = first;

        JLabel l1 = new JLabel("Page 2 :");
        l1.setFont(new Font("Ralway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details :");
        l2.setFont(new Font("Ralway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Ralway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String[] religion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Ralway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String[] category = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Ralway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String[] income = {"Null", "<1,50,000", "<2,50,000", "5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Ralway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);

        String[] education = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        comboBox4 = new JComboBox<>(education);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Ralway", Font.BOLD, 18));
        l7.setBounds(100, 320, 150, 30);
        add(l7);

        String[] occupation = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox5.setBounds(350, 320, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Ralway", Font.BOLD, 18));
        l8.setBounds(100, 370, 200, 30);
        add(l8);

        field1 = new JTextField();
        field1.setFont(new Font("Ralway", Font.BOLD, 18));
        field1.setBounds(350, 370, 320, 30);
        add(field1);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Ralway", Font.BOLD, 18));
        l9.setBounds(100, 420, 200, 30);
        add(l9);

        field2 = new JTextField();
        field2.setFont(new Font("Ralway", Font.BOLD, 18));
        field2.setBounds(350, 420, 320, 30);
        add(field2);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Ralway", Font.BOLD, 18));
        l10.setBounds(100, 470, 200, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Ralway", Font.BOLD, 14));
        r1.setBounds(350, 470, 100, 30);
        r1.setBackground(new Color(252, 208, 76));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Ralway", Font.BOLD, 14));
        r2.setBounds(460, 470, 100, 30);
        r2.setBackground(new Color(252, 208, 76));
        add(r2);

        ButtonGroup btngroup = new ButtonGroup();
        btngroup.add(r1);
        btngroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Ralway", Font.BOLD, 18));
        l11.setBounds(100, 520, 200, 30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Ralway", Font.BOLD, 14));
        r3.setBounds(350, 520, 100, 30);
        r3.setBackground(new Color(252, 208, 76));
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Ralway", Font.BOLD, 14));
        r4.setBounds(460, 520, 100, 30);
        r4.setBackground(new Color(252, 208, 76));
        add(r4);

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(r3);
        btnGroup.add(r4);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Ralway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Ralway", Font.BOLD, 14));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        btn = new JButton("Next");
        btn.setFont(new Font("Ralway", Font.BOLD, 18));
        btn.setBounds(570, 640, 100, 30);
        btn.setBackground(Color.white);
        btn.setForeground(Color.BLACK);
        btn.addActionListener(this);
        add(btn);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp2("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String Edu = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();
        String panNo = field1.getText();
        String adharNo = field2.getText();
        String seniorcitizen = null;

        if (r1.isSelected()) {
            seniorcitizen = "Yes";
        } else if (r2.isSelected()) {
            seniorcitizen = "No";
        }

        String accountExist = null;

        if (r3.isSelected()) {
            accountExist = "Yes";
        } else if (r4.isSelected()) {
            accountExist = "No";
        }

        try {
            if (field1.getText().equals("") || field2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Aadhar Number And PanCard Number");
            } else {
                Con con1 = new Con();
                String query = "INSERT INTO signuptwo VALUES('" + formNo + "','" + rel + "','" + cat + "','" + income + "','" + Edu + "','" + occupation + "','" + panNo + "','" + adharNo + "','" + seniorcitizen + "','" + accountExist + "')";
                con1.statement.executeUpdate(query);
                new SignUp3(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
