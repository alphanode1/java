package main;

class App {
   public static void main(String[] args) {
	   
	   System.out.print("Values of x : ");
	   // variable x is inferred to be type double because that is the type of its initializer
	   for(var x = 2.5; x < 100.0; x = x*2)
		   System.out.print(x + " ");
	   System.out.println();

	   int[] nums = {1, 2, 3, 4, 5, 6};
	   System.out.print("Values in nums array : ");
	   // variable v is inferred to be type int because that is the type of the array nums
	   for(var v : nums)
		   System.out.print(v + " ");
	   System.out.println();

   }
}

// OUTPUT:
// Values of x : 2.5 5.0 10.0 20.0 40.0 80.0
// Values in nums array : 1 2 3 4 5 6
