package main;

class Factorial{
	int fact(int n){
		int result;
		if(n==1) return 1;
		result = fact(n-1)*n;
		return result;
	}
}

class App {
   public static void main(String[] args) {
	   Factorial fact = new Factorial();
	   System.out.println("Factorial of 1 is : "+fact.fact(1));
	   System.out.println("Factorial of 3 is : "+fact.fact(3));
	   System.out.println("Factorial of 4 is : "+fact.fact(4));
	   System.out.println("Factorial of 5 is : "+fact.fact(5));
   }
}
