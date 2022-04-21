package main;

class App {
   public static void main(String[] args) {

	   // creating an object
	   UserProfile obj = new UserProfile();
	   UserProfile obj2; // declare reference to object
	   obj2 = new UserProfile(); // allocate a UserProfile object

	   obj.getInput();
	   obj.validateUser();

	   obj2.getInput();
	   obj2.validateUser();

   }
}
