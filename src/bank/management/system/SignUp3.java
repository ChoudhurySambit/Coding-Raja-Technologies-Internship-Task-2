package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class SignUp3 extends JFrame implements ActionListener {


    String formNo;
    JRadioButton btn1,btn2,btn3,btn4;

    JCheckBox c1,c2,c3,c4,c5,c6;

    JButton submit,cancel;
    SignUp3(String formNo){

        this.formNo=formNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        setLayout(null);
        add(image);

        JLabel l1=new JLabel("Page 3");
        l1.setFont(new Font("Ralway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account Details ");
        l2.setFont(new Font("Ralway",Font.BOLD,22));
        l2.setBounds(280,60,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Type :");
        l3.setFont(new Font("Ralway",Font.BOLD,18));
        l3.setBounds(100,140,200,40);
        add(l3);

        btn1=new JRadioButton("Saving Account");
        btn1.setFont(new Font("ralway",Font.BOLD,16));
        btn1.setBounds(100,180,150,40);
        btn1.setBackground(new Color(215,252,252));
        add(btn1);

        btn2=new JRadioButton("Fixed Deposite Account");
        btn2.setFont(new Font("ralway",Font.BOLD,16));
        btn2.setBounds(350,180,300,40);
        btn2.setBackground(new Color(215,252,252));
        add(btn2);

        btn3=new JRadioButton("Current Account");
        btn3.setFont(new Font("ralway",Font.BOLD,16));
        btn3.setBounds(100,220,250,40);
        btn3.setBackground(new Color(215,252,252));
        add(btn3);

        btn4=new JRadioButton("Recurring Account");
        btn4.setFont(new Font("ralway",Font.BOLD,16));
        btn4.setBounds(350,220,250,40);
        btn4.setBackground(new Color(215,252,252));
        add(btn4);

        ButtonGroup btnGroup=new ButtonGroup();
        btnGroup.add(btn1);
        btnGroup.add(btn2);
        btnGroup.add(btn3);
        btnGroup.add(btn4);


        JLabel l4=new JLabel("Card Number :");
        l4.setFont(new Font("Ralway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5=new JLabel("(Your 16 digit Card Number)");
        l5.setFont(new Font("Ralway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Ralway",Font.BOLD,18));
        l6.setBounds(330,300,250,20);
        add(l6);

        JLabel l7=new JLabel("(It Would Apper on atm card/Cheque Book And Statements)");
        l7.setFont(new Font("Ralway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8=new JLabel("PIN :");
        l8.setFont(new Font("Ralway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Ralway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10=new JLabel("(4 Digit Password)");
        l10.setFont(new Font("Ralway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11=new JLabel("Services Required :");
        l11.setFont(new Font("Ralway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        c1=new JCheckBox("ATM Card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Ralway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Ralway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Ralway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("Email Alert");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Ralway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Ralway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Ralway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);



        JCheckBox c7=new JCheckBox("I here by declared that all the above Entered Details correct to best of my Knowledge",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Ralway",Font.BOLD,12));
        c7.setBounds(100,680,600,20);
        add(c7);

        JLabel l12=new JLabel("Form No :");
        l12.setBounds(700,10,70,30);
        l12.setFont(new Font("Ralway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formNo);
        l13.setFont(new Font("Ralway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);


        submit=new JButton("Submit");
        submit.setBounds(250,720,100,30);
        submit.setFont(new Font("Ralway",Font.BOLD,14));
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setBounds(420,720,100,30);
        cancel.setFont(new Font("Ralway",Font.BOLD,14));
        cancel.setBackground(Color.DARK_GRAY);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,500);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


        String aType=null;

        if(btn1.isSelected()){
            aType="Saving Account";
        }
        else if(btn2.isSelected()){
            aType="Fixed Deposite Account";
        } else if (btn3.isSelected()) {

            aType="Current Account";

        }
        else if(btn4.isSelected()){
            aType="Recurring Account";
        }

        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);
        long first3= (ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac="";
        if(c1.isSelected()){
            fac=fac+"ATM Card";
        }
        if(c2.isSelected()){
            fac=fac+"Internet Banking";
        } if (c3.isSelected()) {
            fac=fac+"Mobile Banking";
        } if (c4.isSelected()) {
            fac=fac+"Email Alert";
        } if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }

        try{
            if(e.getSource()==submit){
                if(aType.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill All The Fields");
                }
                else {
                    Con c1=new Con();
                    String query1="INSERT INTO signupthree VALUES('" + formNo + "','" + aType+ "','" + cardno + "','" + pin + "','" + fac + "')";

                    String query2="INSERT INTO Login VALUES('" + formNo + "','" + cardno + "','" + pin + "')";
                    c1.statement.executeUpdate(query1);
                    c1.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card Number"+cardno+"\n Pin "+pin);
                    new Deposite(pin);
                    setVisible(false);
                }
            }

            else if(e.getSource()==cancel){
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {


        new SignUp3("");

    }

}
