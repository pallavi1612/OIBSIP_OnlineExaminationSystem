package online.examination;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    Score(String name , int score){
        
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel lblscore = new JLabel("Your Score is : "+ score );
        lblscore.setBounds(240,200,300,30);
        lblscore.setFont(new Font("Tohema",Font.BOLD,35));
        add(lblscore);        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
    }
    public static void main(String[]args){
        new Score("User",0);
    }
    
}
