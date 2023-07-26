import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SecurityCheck implements ActionListener
{
    public JFrame frame;
    public JButton loginButton;
    public JFormattedTextField dateText;
    public JFormattedTextField fnameText;
    public JFormattedTextField snameText;
    public JFormattedTextField unameText;
    public JButton exitButton;
    public JTextField access1;
    public JLabel access2;
    public String start_date;

    void Check()
    {
        frame = new JFrame("Access Check Screen");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = new ImageIcon("SM.jpg"); 
        frame.setIconImage(logo.getImage());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(12,120,130));
        panel.setLayout(null);
        
        JLabel fnameLabel = new JLabel("Name");
        fnameLabel.setBounds(10,80,200,25);
        fnameLabel.setForeground(new Color(255,255,255));
        fnameLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
        panel.add(fnameLabel);
        
        MaskFormatter fnameMask = null;
        try {
            fnameMask = new MaskFormatter("********************************************************");
        } 
        catch (ParseException en) 
        {
            en.printStackTrace();
        }
        fnameMask.setValidCharacters("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"+" ");
        fnameText = new JFormattedTextField(fnameMask); 
        fnameMask.setPlaceholderCharacter(' ');
        fnameText.setBounds(200,80,165,25);
        panel.add(fnameText);
        
        JLabel snameLabel = new JLabel("Surname");
        snameLabel.setBounds(10,110,200,25);
        snameLabel.setForeground(new Color(255,255,255));
        snameLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
        panel.add(snameLabel);
        
        MaskFormatter snameMask = null;
        try {
            snameMask = new MaskFormatter("********************************************");
        } 
        catch (ParseException es) 
        {
            es.printStackTrace();
        }
        snameMask.setValidCharacters("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"+" ");
        snameText = new JFormattedTextField(snameMask); 
        snameMask.setPlaceholderCharacter(' ');
        snameText.setBounds(200,110,165,25);
        panel.add(snameText);
        
        JLabel unameLabel = new JLabel("Username");
        unameLabel.setBounds(10,140,200,25);
        unameLabel.setForeground(new Color(255,255,255));
        unameLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
        panel.add(unameLabel);
        
        MaskFormatter unameMask = null;
        try {
            unameMask = new MaskFormatter("@*******************************************");
        } 
        catch (ParseException eu) 
        {
            eu.printStackTrace();
        }
        unameMask.setValidCharacters("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"+" "+"0123456789");
        unameText = new JFormattedTextField(unameMask); 
        unameMask.setPlaceholderCharacter(' ');
        unameText.setBounds(200,140,165,25);
        panel.add(unameText);
        
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(10,170,200,25);
        genderLabel.setForeground(new Color(255,255,255));
        genderLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
        panel.add(genderLabel);
        
        JRadioButton r1=new JRadioButton(" Male");    
        r1.setBackground(new Color(12,120,130));
        r1.setForeground(new Color(255,255,255));
        JRadioButton r2=new JRadioButton(" Female");
        r2.setBackground(new Color(12,120,130));
        r2.setForeground(new Color(255,255,255));
        JRadioButton r3=new JRadioButton(" Transgender"); 
        r3.setBackground(new Color(12,120,130));
        r3.setForeground(new Color(255,255,255));
        r1.setBounds(150,170,75,30);    
        r2.setBounds(250,170,75,30);  
        r3.setBounds(350,170,150,30); 
        ButtonGroup bg=new ButtonGroup(); 
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        
        JLabel dateLabel = new JLabel("Date of Birth (DD-MM-YYYY)");
        dateLabel.setBounds(10,200,200,25);
        dateLabel.setForeground(new Color(255,255,255));
        dateLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
        panel.add(dateLabel);
        
        MaskFormatter dateMask = null;
        try {
            dateMask = new MaskFormatter("##-##-####");
        } 
        catch (ParseException ex) 
        {
            ex.printStackTrace();
        }
        dateMask.setValidCharacters("0123456789");
        dateText = new JFormattedTextField(dateMask); 
        dateText.setBounds(200,200,165,25);
        panel.add(dateText);
        
        exitButton = new JButton("Exit");
        exitButton.setBounds(150,430, 125, 25);
        exitButton.setFont(new Font("Century Gothic",Font.PLAIN,13));
        exitButton.setBorder(BorderFactory.createEtchedBorder());
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);
        panel.add(exitButton);

        loginButton = new JButton("Access Check");
        loginButton.setBounds(150,250, 125, 25);
        loginButton.setFont(new Font("Century Gothic",Font.PLAIN,13));
        loginButton.setBorder(BorderFactory.createEtchedBorder());
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        access2 = new JLabel("Access Status");
        access2.setBounds(75,350,150,25);
        access2.setForeground(new Color(255,255,255));
        access2.setFont(new Font("Century Gothic", Font.BOLD, 17));
        access2.setVisible(false);
        panel.add(access2);
        
        access1 = new JTextField();
        access1.setBounds(200,350,165,25);
        access1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 17));
        access1.setEditable(false);
        access1.setVisible(false);
        panel.add(access1);

        frame.add(panel);
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {

        if(e.getSource()==loginButton)
        {
            start_date=dateText.getText();
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
            String strDate = dateFormat.format(date);
            
            findDifference(start_date, strDate);
        }
        
        if(e.getSource()==exitButton)
        {
            frame.dispose();
        }
            
    }

    public void findDifference(String start_date, String end_date)
    {
        SimpleDateFormat obj = new SimpleDateFormat("dd-MM-yyyy"); 
        if(dateValidation(start_date))
            {
                try {   
                     
                    Date date1 = obj.parse(start_date);   
                    Date date2 = obj.parse(end_date);   
                    
                    long time_difference = date2.getTime() - date1.getTime();  
                    
                    long years_difference = (time_difference / (1000l*60*60*24*365));

                    access1.setVisible(true);
                    if(years_difference>=13)
                    {
                        access1.setForeground(new Color(0,180,0));
                        access2.setVisible(true);
                        access1.setText(" ACCESS GRANTED");
                        new Delay();
                        //frame.setVisible(false);
                    }
                    else
                    {
                        access1.setForeground(new Color(255,127,80));
                        access2.setVisible(true);
                        access1.setText(" ACCESS DENIED");
                    }
                }
                
                catch (ParseException excep) 
                {   
                    excep.printStackTrace();   
                }
                
            }
            else
            {
                JOptionPane optionPane = new JOptionPane("Invalid DOB : "+start_date,JOptionPane.WARNING_MESSAGE);
                JDialog dialog = optionPane.createDialog("Invalid DOB!");
                dialog.setAlwaysOnTop(true); 
                dialog.setVisible(true); 
            }
         
    }

    public boolean dateValidation(String date)
    {
        boolean status = false;
        if (checkDate(date)) 
        {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dateFormat.setLenient(false);
            try 
            {
                dateFormat.parse(date);
                status = true;
            } 
            catch (Exception e) 
            {
                status = false;
            }
        }
        return status;
    }
    
    public boolean checkDate(String date) 
    {
        String pattern = "(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[0-2])-([0-9]{4})";
        boolean flag = date.matches(pattern);
        return flag;
    }
    
    public static void main()
    {
        SecurityCheck obj=new SecurityCheck();
        obj.Check();
    }
}