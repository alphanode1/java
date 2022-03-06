// taking input using DataInputStream
package main;

import java.io.DataInputStream;
import java.io.IOException;
// import java.io.*;

class App {
   public static void main(String[] args) throws IOException {
	   int rollno;
	   String name,course;
	   float fee;

	   DataInputStream ds = new DataInputStream(System.in);
	   System.out.print("Enter rollno : ");
	   rollno=Integer.parseInt(ds.readLine());
	   System.out.print("Enter name : ");
	   name=ds.readLine();
	   System.out.print("Enter course : ");
	   course=ds.readLine();
	   System.out.print("Enter fee : ");
	   fee=Float.parseFloat(ds.readLine());

	   System.out.println("\nRollNo: "+rollno+"\nName: "+name+"\nCourse: "+course+"\nFee: "+fee);

   }
}
