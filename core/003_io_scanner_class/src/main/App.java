// taking input using scanner class
package main;

import java.util.Scanner;

class App {
   public static void main(String[] args) {
	   	  Scanner sc = new Scanner(System.in);

		  int rollno;
		  String name,course;
		  float fee;
		  char grade;

		  System.out.print("Enter rollno : ");
		  //to input Integer value nextInt() method is there in Scanner class
		  rollno = sc.nextInt();

		  System.out.print("Enter Grade : ");
		  //nextChar is not a method of Scanner class rather use charAt(<indexNumber>)
		  grade = sc.next().charAt(0);

		  System.out.print("Enter Name : ");
		  //to input String value next() method is used
		  name = sc.next();

		  System.out.print("Enter Course : ");
		  course = sc.next();

		  System.out.print("Enter Fee : ");
		  //to input Float value we use nextFloat()
		  fee = sc.nextFloat();

		  System.out.println("\nRoll: "+rollno+"\nGrade: "+grade+"\nName: "+name+"\nCourse: "+course+"\nFee: "+fee);

   }
}
