package loginmodule;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class main {

	
	 public static void main(String []args)  
	    {  
	        try  
	        {  
	            //create instance of the CreateLoginForm  
	            login form = new login();  
	            boolean log = form.login();
	            form.setSize(500,300);  //set size of the frame  
	            form.setVisible(true);  //make form visible to the user  
	            
	            if(log) {
	            	NewPage page = new NewPage();  
	 	            page.setVisible(true); 
	 	            JLabel wel_label = new JLabel("Welcome");  
	 	            page.getContentPane().add(wel_label);  
	            }
	        }  
	        
	        
	        catch(Exception e)  
	        {     
	            //handle exception   
	            JOptionPane.showMessageDialog(null, e.getMessage());  
	        }  
	    }  
}

