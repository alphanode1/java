package main;

import java.io.DataInputStream;
import java.io.IOException;

class App {
   public static void main(String[] args) throws IOException {
	   // one dimentional array
	   int a[] = new int[10];
	   int svalue,i,flag=0;
	   DataInputStream ds = new DataInputStream(System.in);
	   System.out.println("Enter 10 numbers");
	   for(i = 0; i < a.length; i++){
		   a[i]= Integer.parseInt(ds.readLine());
	   }
	   System.out.print("Enter number to search : ");
	   svalue = Integer.parseInt(ds.readLine());
	   for(i = 0; i < a.length; i++){
		   if(a[i] == svalue){
			   flag=1;
			   break;
		   }
	   }

	   if(flag == 1){
		   System.out.println("Searching found");
	   }else{
		   System.out.println("Searching not found");
	   }
   }
}
