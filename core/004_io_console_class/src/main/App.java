// input using console class
package main;

import java.io.Console;

class App {
   public static void main(String[] args) {
	   Console con; // reference object of Console class
	   con = System.console();
	   
	   System.out.print("Enter your name : ");
	   String name = con.readLine();
	   System.out.println("Welcome "+name);
	   
	   System.out.print("Enter password: ");
	   char[] ch = con.readPassword();
	   String pass = String.valueOf(ch); //converting char array into string
	   System.out.println("Password is: "+pass);
   }
}
