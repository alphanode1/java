package main;

// import java.io.DataInputStream;
// import java.io.IOException;
import javax.swing.JOptionPane;

class UserProfile {
	
	String uname,pname; // member variable / instance variable / object level variable
	// DataInputStream ds = new DataInputStream(System.in);

	
	// member functions
	void getInput() // throws IOException
	{
		// System.out.println("Enter user name and password : ");
		// uname = ds.readLine();
		// pname = ds.readLine();

		uname = JOptionPane.showInputDialog(null,"Enter user name");
		pname = JOptionPane.showInputDialog(null,"Enter password");
	}

	void validateUser(){
		if(uname.equals("cimage") == true && pname.equals("ppu"))
			JOptionPane.showMessageDialog(null,"Login Successful");
		else if(uname.equals("cimage") == false && pname.equals("ppu") == false)
			JOptionPane.showMessageDialog(null,"Invalid User Name and Password");
		else if(uname.equals("cimage") == false)
			JOptionPane.showMessageDialog(null,"Invalid User Name");
		else
			JOptionPane.showMessageDialog(null,"Invalid Password");
	}

	// method overloading
	void getInput(String unm, String pname){
		uname = unm;
		this.pname = pname;
	}

}
