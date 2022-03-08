// use of 'switch...case' and 'if()....else if()....else'
package main;

import java.io.Console;
import javax.swing.JOptionPane;

class App {
   public static void main(String[] args) {
	   Console con; // reference object of Console class
	   con = System.console();
	   
	   System.out.print("Enter your name : ");
	   String uname = con.readLine();
	   
	   System.out.print("Enter password : ");
	   char[] ch = con.readPassword();
	   String pass = String.valueOf(ch); // converting char array into string

	   System.out.print("Enter your user type : ");
	   String utype = con.readLine();

	   switch(utype){
		   case "admin" :
			   if(uname.equals("ppu") && pass.equals("bca")){
				   // to compare string, equals() is used. equalsIgnoreCase() to ignore case also
				   JOptionPane.showMessageDialog(null,"Login Successful");
			   }
			   else if(uname.equals("ppu") == false && pass.equals("bca") == false){
				   JOptionPane.showMessageDialog(null,"Invalid username and password");
			   }
			   else if(uname.equals("ppu") == false){
				   JOptionPane.showMessageDialog(null,"Invalid username");
			   }
			   else {
				   JOptionPane.showMessageDialog(null,"Invalid password");
			   }
			   break;
		   case "guest" :
			   JOptionPane.showMessageDialog(null,"Welcome to guest page");
			   break;
		   default :
			   JOptionPane.showMessageDialog(null,"Invalid type");
			   break; // optional if default statement is the last case
	   }

   }
}
