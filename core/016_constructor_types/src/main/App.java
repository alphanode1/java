package main;

import java.io.IOException;

class App {
   public static void main(String[] args) throws IOException{
	   Employee e1 = new Employee(); // executes default constructor
	   Employee e2 = new Employee(1001,"Kishan","Junior Eng.",15000.00f); // executes parameterized constructor
	   Employee e3 = new Employee(e1); // executes copy constructor (e1 is copied in e3)
	   Employee e4 = new Employee(e2); // executes copy constructor (e2 is copied in e4)

	   System.out.println("--- Default constructor(e1) ---");
	   e1.showResult();
	   System.out.println("\n--- Parameterized constructor(e2) ---");
	   e2.showResult();
	   System.out.println("\n--- Copy constructor(e1->e3) ---");
	   e3.showResult();
	   System.out.println("\n--- Copy constructor(e2->e4) ---");
	   e4.showResult();
   }
}
