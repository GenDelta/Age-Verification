import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class WelcSM 
{
    WelcSM() 
    {
        Border border = BorderFactory.createLineBorder(Color.white, 3);
        JLabel welcSM = new JLabel(); 
        welcSM.setText("WELCOME TO SOCIAL MEDIA");
        welcSM.setForeground(new Color(255,255,255)); 
        welcSM.setFont(new Font("Century Gothic", Font.PLAIN, 30));
        welcSM.setBackground(Color.black); 
        welcSM.setOpaque(true); 
        welcSM.setBorder(border); 
        welcSM.setVerticalAlignment(JLabel.CENTER); 
        welcSM.setHorizontalAlignment(JLabel.CENTER); 
        welcSM.setBounds(100, 100, 250, 250); 

        JFrame welc = new JFrame(); 
        welc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        welc.setSize(500,500); 
        welc.setResizable(false);
        welc.setVisible(true);
        welc.setLocationRelativeTo(null);
        welc.add(welcSM);
       
    }
}