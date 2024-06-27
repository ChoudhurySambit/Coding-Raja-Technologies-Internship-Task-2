package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label,label2,label3;
    JTextField field;
    JPasswordField password;
    JButton btn1,btn2,btn3;
    Login() {
        super("Bank Management System");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        setLayout(null);
        add(image);

        ImageIcon ii11=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii21=ii11.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii31= new ImageIcon(ii21);
        JLabel iimage1=new JLabel(ii31);
        iimage1.setBounds(630,350,100,100);
        setLayout(null);
        add(iimage1);

        label =new JLabel("WELCOME TO THE ATM");
        label.setBounds(180,125,450,40);
        label.setForeground(Color.cyan);
        label.setFont(new Font("AvantGarde",Font.BOLD,38));

        add(label);

        label2=new JLabel("Card No :");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);

         field=new JTextField(15);
        field.setBounds(325,190,230,30);
        setFont(new Font("Arial",Font.BOLD,14));
        add(field);

        label3=new JLabel("PIN :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        password =new JPasswordField(15);
        password.setBounds(325,250,230,30);
        password.setFont(new Font("Arial",Font.BOLD,14));
        add(password);

        btn1=new JButton("SIGN IN");
        btn1.setFont(new Font("Arial",Font.BOLD,14));
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.DARK_GRAY);
        btn1.setBounds(330,300,100,30);
        btn1.addActionListener(this);
        add(btn1);

        btn2=new JButton("CLEAR");
        btn2.setFont(new Font("Arial",Font.BOLD,14));
        btn2.setForeground(Color.white);
        btn2.setBackground(Color.DARK_GRAY);
        btn2.setBounds(450,300,100,30);
        btn2.addActionListener(this);
        add(btn2);

        btn3=new JButton("SIGN UP");
        btn3.setFont(new Font("Arial",Font.BOLD,14));
        btn3.setForeground(Color.white);
        btn3.setBackground(Color.DARK_GRAY);
        btn3.setBounds(330,350,220,30);
        btn3.addActionListener(this);
        add(btn3);

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image ii2=ii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(0,0,850,480);
        setLayout(null);
        add(iimage);

        setSize(850, 480);
        setUndecorated(true);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if(e.getSource() == btn1){

                Con c1=new Con();
                String cardNo=field.getText();
                String pin=password.getText();
                String q="Select * from Login where card_number='"+cardNo+"' and pin ='"+pin+"'";
                ResultSet resultSet=c1.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect CardNo Aur PinNo ");
                }


            }
            else if(e.getSource() == btn2){
                field.setText("");
                password.setText("");

            }

            else if(e.getSource() ==btn3){

                new SignUp();
                setVisible(false);

            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();

    }
}
