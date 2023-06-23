package online.examination;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login , back;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/frontImg.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,400);
        add(image);
        
        JLabel heading = new JLabel("Online Exam !");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(100,14,150));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,180,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        
       JLabel password = new JLabel("Enter Your Password"); 
       password.setBounds(810,230,300,20);
       password.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
       password.setForeground(new Color(30,144,254));
       add(password);
        
       JPasswordField passwordField = new JPasswordField();
       passwordField.setBounds(735,254,300,25);
       passwordField.setFont(new Font("Times New Roman",Font.BOLD,20));
       add(passwordField);
 
       
        login = new JButton("Login");
        login.setBounds(735,300,120,25);
        login.setBackground(new Color(30,144,254));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        back = new JButton("Back");
        back.setBounds(915,300,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==login) {
           String name = tfname.getText();
           setVisible(false);
           new Rules(name);
       }else if(ae.getSource()==back){
           setVisible(false);
       }
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
