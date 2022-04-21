package main;

import java.io.DataInputStream;
import java.io.IOException;

//
// implementation of constructor
//

class Employee {
	int empid;
	String ename,post;
	float salary;

	DataInputStream ds = new DataInputStream(System.in);

	// default constructor
	Employee() throws IOException{
		System.out.print("Enter employee id : ");
		empid = Integer.parseInt(ds.readLine());
		System.out.print("Enter employee name : ");
		ename = ds.readLine();
		System.out.print("Enter employee post : ");
		post = ds.readLine();
		System.out.print("Enter employee salary : ");
		salary = Float.parseFloat(ds.readLine());
	}

	// parameterized constructor
	Employee(int eid, String name, String post, float salary){
		empid = eid;
		ename = name;
		this.post = post;
		this.salary = salary;
	}

	// copy constructor
	Employee(Employee e){
		empid = e.empid;
		ename = e.ename;
		post = e.post;
		salary = e.salary;
	}

	void showResult(){
		System.out.println("Employee ID: "+empid+"\nName: "+ename+"\nPost: "+post+"\nSalary: "+salary);
	}
}
