
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class GreetingsGUI extends JFrame {
   
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    private JTextArea greetingsTxtArea;
    
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
            
    public GreetingsGUI(){
        //configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700, 750);
        setBackground(Color.YELLOW);
        
        //create the panels
        namePnl=new JPanel(new FlowLayout());
        surnamePnl=new JPanel(new FlowLayout());
        
        nameAndSurnamePnl= new JPanel(new GridLayout(2,1));
        
        greetingsAreaPnl= new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder (new LineBorder (Color.BLACK,1), "Greetings"));
        
        btnsPnl=new JPanel(new FlowLayout());
        mainPnl=new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        headingLbl= new JLabel("Greetings App");
        nameLbl = new JLabel("Name: ");
        surnameLbl= new JLabel("Surname: ");
        
        nameTxtFld= new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        greetingsTxtArea= new JTextArea(40,50);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name] [surname]");
        
        //create the buttons
        greetBtn =new JButton("Greet");
        clearBtn= new JButton("Clear");
        exitBtn= new JButton("Exit");
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        greetingsAreaPnl.add(greetingsTxtArea);
        
        btnsPnl.add(greetBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
}
