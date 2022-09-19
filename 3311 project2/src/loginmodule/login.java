package loginmodule;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener  {
	
	
	JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    JTextField  textField1, textField2;  
    boolean isAuth;
    boolean isAuthPerformed;
	
    	public boolean login() {
    	isAuthPerformed = false;
    	isAuth = false;
		//create label for username   
        userLabel = new JLabel();  
        userLabel.setText("Username");      //set label value for textField1  
          
        //create text field to get username from the user  
        textField1 = new JTextField(15);    //set length of the text  
  
        //create label for password  
        passLabel = new JLabel();  
        passLabel.setText("Password");      //set label value for textField2  
          
        //create text field to get password from the user  
        textField2 = new JPasswordField(15);    //set length for the password  
          
        //create submit button  
        b1 = new JButton("SUBMIT"); //set label to button  
          
        //create panel to put form elements  
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(userLabel);    //set username label to panel  
        newPanel.add(textField1);   //set text field to panel  
        newPanel.add(passLabel);    //set password label to panel  
        newPanel.add(textField2);   //set text field to panel  
        newPanel.add(b1);           //set button to panel  
          
        //set border to panel   
        add(newPanel, BorderLayout.CENTER);  
          
        //perform action on button click   
        b1.addActionListener(this);     //add action listener to button  
        setTitle("LOGIN FORM");         //set title to the login form  
		return isAuth;
    }  
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		 String userValue = textField1.getText();        //get user entered username from the textField1  
	     String passValue = textField2.getText();
	     xmlDomParser checkXML = new xmlDomParser();
	     boolean authenticated = checkXML.getAuth(userValue, passValue);
	    
	        if (authenticated) {  
	           isAuth = true;
		
	}
	        isAuthPerformed = true;
}
	
	public boolean sendAuth(){
		
	
		return isAuth;
		
	}
	
}



